package com.fico.testCaseGenerator.converter;

import com.cams.blaze.request.Application;
import org.apache.commons.beanutils.PropertyUtils;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.*;

/**
 * @Author XiangbinYuan stevenYuan
 * @CreationDate 3/28/2018
 */
public class TestDataConvertProcessor {

    private Map<String, Class> SIMPLE_NAME_JAVACLASS_MAP = new HashMap<String, Class>();

    private Map<String, String> targetBeanSrcBeanMap = new HashMap<String, String>();

    private List<SourceBOMBeanConvertMapper> sourceBOMBeanConvertMappers = new ArrayList<SourceBOMBeanConvertMapper>();

    private TestDataConverter testDataConverter = null;

    private List<LoadConversion> loadConversion = null;

    public TestDataConvertProcessor(){
        testDataConverter = new TestDataConverter();
        try {
            buildConstructor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private List<ConfigRawData> configRawDataList = new ArrayList<ConfigRawData>();

    public void buildConstructor() throws Exception{

        loadConversion = LoadConversionConfiguration.readExcelData("C:\\temp\\conversion.xls");

        String applicationClassFullPackageName = ResourceBundle.getBundle("javaBOM").getString("rootApplicationFullName");

        Class appClass = Class.forName( applicationClassFullPackageName );

        Queue<Class> queue = new LinkedList<Class>();

        queue.add(appClass);

        SourceBOMBeanConvertMapper parent = null;

        SourceBOMBeanConvertMapper rootBomBeanConvertMapper = createSourceMapper(appClass, parent);

        SourceBOMBeanConvertMapper tmpBomBeanConvertMapper = rootBomBeanConvertMapper;

        updateSourceBOMConverterMapperRref();

    }

    private void updateSourceBOMConverterMapperRref(){
        for(SourceBOMBeanConvertMapper sourceBOMBeanConvertMapper : this.sourceBOMBeanConvertMappers){
            for(String targetBOMName : this.targetBeanSrcBeanMap.keySet()){
                String srcBeanName = this.targetBeanSrcBeanMap.get(targetBOMName);
                if( srcBeanName.equalsIgnoreCase(sourceBOMBeanConvertMapper.getBenaName()) ){

                    TargetBOMBeanConverMapper targetBOMBeanConverMapper = new TargetBOMBeanConverMapper( targetBOMName );

                    sourceBOMBeanConvertMapper.getTargetBOMBeanConverMapperList().add( targetBOMBeanConverMapper );
                }
            }
        }
    }

    public List process(Object appObj) throws Exception {
        if(appObj != null){
           recursiveBuildTargetBOM(appObj, null, null);

            List rtn =  this.rtnList;

            this.rtnList = null;

            return rtn;
        }
        return null;
    }

    private List rtnList = null;

    private Object recursiveBuildTargetBOM(Object currentSrcOBJ, List parentSrcObjList, Object parentTargetObj) throws Exception{

        Class cls = currentSrcOBJ.getClass();

        String className = cls.getSimpleName();

        List<TargetBOMBeanConverMapper> targetBOMBeanConverMappers = getTargetBOMBeanConverMapperList( className );

        Object newTargetObj = null;

        for(TargetBOMBeanConverMapper targetBOMBeanConverMapper : targetBOMBeanConverMappers){
            newTargetObj = targetBOMBeanConverMapper.newInstance();
            setTargetObjAttribute(currentSrcOBJ, parentSrcObjList, newTargetObj);
            appendToParent(newTargetObj, parentTargetObj);
        }

        for(Field field : cls.getDeclaredFields()){
                if( isBasicType( field.getType() ) ){
                }
                else{
                    String fieldName = field.getName();

                    List tmpChildList = new ArrayList();

                    if(  Collection.class.isAssignableFrom( field.getType() )){
                        if(field.getGenericType() instanceof ParameterizedType){
                            ParameterizedType pt = (ParameterizedType) field.getGenericType();
                            //得到泛型里的class类型对象
                            Class genericClazz = (Class)pt.getActualTypeArguments()[0];

                            List childrenEleList = (List)PropertyUtils.getProperty(currentSrcOBJ, fieldName);

                            if(childrenEleList != null){

                                for(Object child : childrenEleList){

                                    List ll = new ArrayList(parentSrcObjList);
                                    ll.add(child);

                                    Object tmpRtnObj = recursiveBuildTargetBOM(child, ll, newTargetObj);
                                    if( tmpRtnObj != null ){
                                        tmpChildList.add( tmpRtnObj );
                                    }

                                }
                            }
                        }
                    }
                    else{

                        Object oneToOneChild = PropertyUtils.getProperty(currentSrcOBJ, fieldName);

                        List ll = null;

                        if(parentSrcObjList == null){
                            ll = new ArrayList();
                        }else{
                            ll = new ArrayList(parentSrcObjList);
                        }

                        ll.add(oneToOneChild);

                        Object tmpRtnObj = recursiveBuildTargetBOM(oneToOneChild, ll, newTargetObj);
                        if( tmpRtnObj != null ){
                            tmpChildList.add( tmpRtnObj );
                        }
                    }

                    if(this.rtnList == null && tmpChildList.size()>0){
                        rtnList = tmpChildList;
                    }
                }
            }
            return newTargetObj;
    }

    public List getRtnList() {
        return rtnList;
    }

    private void setTargetObjAttribute(Object currentSrcOBJ, List parentSrcObjList, Object currentTargetObj) {
        Class targetCls = currentTargetObj.getClass();

        String clsName = targetCls.getSimpleName();

        for(Field field : targetCls.getDeclaredFields()){
            String fieldName = field.getName();

            String[] srcBeanNameAndSrcBeanAttrName = getSrcBeanNameAndSrcBeanAttrName(clsName, fieldName);

            if( srcBeanNameAndSrcBeanAttrName != null ){
                String targetCorrspondingClsName = srcBeanNameAndSrcBeanAttrName[0];

                String targetCorrspondingFieldName = srcBeanNameAndSrcBeanAttrName[1];

                try{
                    if (targetCorrspondingClsName.equalsIgnoreCase( currentSrcOBJ.getClass().getSimpleName() )) {

                        Field curField = currentSrcOBJ.getClass().getDeclaredField(targetCorrspondingFieldName.trim());

                        curField.setAccessible(true);

                        Object corrspondingVal = curField.get(currentSrcOBJ);

                        //Object corrspondingVal = PropertyUtils.getProperty(currentSrcOBJ, targetCorrspondingFieldName.trim());

                        if( corrspondingVal != null){
                            if( field.getType() == Double.class || field.getType() == double.class){
                                corrspondingVal = new Double(corrspondingVal.toString());
                            }else if(field.getType() == Integer.class || field.getType() == int.class){
                                corrspondingVal = new Double(corrspondingVal.toString()).intValue();
                            }
                        }

                        field.setAccessible(true);
                        field.set(currentTargetObj, corrspondingVal);
                        //PropertyUtils.setProperty(currentTargetObj, fieldName.trim(), corrspondingVal);
                    }
                    else{
                        for(Object obj : parentSrcObjList){
                            if (targetCorrspondingClsName.equalsIgnoreCase( obj.getClass().getSimpleName() )) {
                                Object corrspondingVal = PropertyUtils.getSimpleProperty(obj, targetCorrspondingFieldName);
                                PropertyUtils.setSimpleProperty(currentTargetObj, targetCorrspondingFieldName.trim(), corrspondingVal);

                            }
                        }
                    }
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }

    private String[] getSrcBeanNameAndSrcBeanAttrName(String targetClsName, String fieldName){
        for(LoadConversion loadConversion : this.loadConversion){
            if(loadConversion.getAimClassName().equalsIgnoreCase(targetClsName)
                    && loadConversion.getAimProperty().equalsIgnoreCase(fieldName)){
                return new String[] {loadConversion.getSourceClassName(), loadConversion.getSourceProperty()};
            }
        }
        return null;
    }

    private void appendToParent(Object newTargetObj, Object parentObj) throws Exception{
        Class cls = newTargetObj.getClass();

        for(Field field : cls.getDeclaredFields()){
            if(  Collection.class.isAssignableFrom( field.getType() )){
                if(field.getGenericType() instanceof ParameterizedType){
                    ParameterizedType pt = (ParameterizedType) field.getGenericType();
                    //得到泛型里的class类型对象
                    Class genericClazz = (Class)pt.getActualTypeArguments()[0];

                    if(genericClazz.equals(cls) ){
                       List list = (List) PropertyUtils.getProperty(parentObj, field.getName());
                       list.add(newTargetObj);
                    }
                }
            }
        }
    }

    private List<TargetBOMBeanConverMapper> getTargetBOMBeanConverMapperList(String bomName){
        for(SourceBOMBeanConvertMapper sourceBOMBeanConvertMapper : this.sourceBOMBeanConvertMappers)  {
            if(sourceBOMBeanConvertMapper.getBenaName().equalsIgnoreCase( bomName ) ){
                return sourceBOMBeanConvertMapper.getTargetBOMBeanConverMapperList();
            }
        }
        return null;
    }

    private BOMAttributeConverterMapper createSourceMapperAttr(Field field, SourceBOMBeanConvertMapper parentBean){
        BOMAttributeConverterMapper bomAttributeConverterMapper = new BOMAttributeConverterMapper();

        bomAttributeConverterMapper.setParentBeanConverter(parentBean);

        bomAttributeConverterMapper.setSrcAttributeName( field.getName() );

        parentBean.getBeanAttrList().add(bomAttributeConverterMapper);

        return bomAttributeConverterMapper;
    }

    private SourceBOMBeanConvertMapper createSourceMapper(Class selfClass, SourceBOMBeanConvertMapper parent){

        SourceBOMBeanConvertMapper sourceBOMBeanConvertMapper = new SourceBOMBeanConvertMapper();

        sourceBOMBeanConvertMapper.setBenaName(selfClass.getSimpleName());

        sourceBOMBeanConvertMapper.setParentMapper(parent);

        sourceBOMBeanConvertMapper.setCorrespondingClass(selfClass);

        this.sourceBOMBeanConvertMappers.add( sourceBOMBeanConvertMapper );

        refreshTargetBeanSrcBeanMap( selfClass.getSimpleName() );

        for(Field field : selfClass.getDeclaredFields()){
            if( isBasicType( field.getType() ) ){
                createSourceMapperAttr(field, sourceBOMBeanConvertMapper);
            }
            else{
                if(  Collection.class.isAssignableFrom( field.getType() )){
                    if(field.getGenericType() instanceof ParameterizedType){
                        ParameterizedType pt = (ParameterizedType) field.getGenericType();
                        //得到泛型里的class类型对象
                        Class genericClazz = (Class)pt.getActualTypeArguments()[0];

                        String fieldName = field.getName();

                        if(SIMPLE_NAME_JAVACLASS_MAP.get(genericClazz.getSimpleName()) == null){
                            createSourceMapper(genericClazz, sourceBOMBeanConvertMapper);

                            SIMPLE_NAME_JAVACLASS_MAP.put(genericClazz.getSimpleName(), genericClazz);
                        }
                    }
                }
                else{

                    if(SIMPLE_NAME_JAVACLASS_MAP.get(field.getType().getSimpleName()) == null){

                        createSourceMapper(field.getType(), sourceBOMBeanConvertMapper);

                        SIMPLE_NAME_JAVACLASS_MAP.put(field.getType().getSimpleName(), field.getType());

                    }
                }
            }
        }

        return sourceBOMBeanConvertMapper;
    }

    private void refreshTargetBeanSrcBeanMap(String srcBeanName){
        for (LoadConversion loadConversion : this.loadConversion ){
            if(srcBeanName.equalsIgnoreCase(loadConversion.getSourceClassName())){
                this.targetBeanSrcBeanMap.put(loadConversion.getAimClassName(), srcBeanName);
                return;
            }
        }
    }

    public  boolean isBasicType(Class fieldType){
        if(fieldType.isPrimitive() ||
                fieldType == Integer.class || fieldType == Double.class ||
                fieldType == Float.class || fieldType == String.class ||
                fieldType == Date.class || fieldType == Short.class ||
                fieldType == Long.class || fieldType == Byte.class ||
                fieldType == Boolean.class || fieldType == Byte.class ||
                fieldType == Character.class || fieldType == Character.class
                ){
            return true;
        }
        return false;
    }
}
