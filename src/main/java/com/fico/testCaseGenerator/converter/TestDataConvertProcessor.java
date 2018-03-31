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
    }

    private List<ConfigRawData> configRawDataList = new ArrayList<ConfigRawData>();

    public Object buildConstructor(Object applicationObj) throws Exception{

        loadConversion = LoadConversionConfiguration.readExcelData("C:\\temp\\conversion.xls");

        String applicationClassFullPackageName = ResourceBundle.getBundle("javaBOM").getString("rootApplicationFullName");

        Class appClass = Class.forName( applicationClassFullPackageName );

        Queue<Class> queue = new LinkedList<Class>();

        queue.add(appClass);

        SourceBOMBeanConvertMapper parent = null;

        SourceBOMBeanConvertMapper rootBomBeanConvertMapper = createSourceMapper(appClass, parent);

        SourceBOMBeanConvertMapper tmpBomBeanConvertMapper = rootBomBeanConvertMapper;

        updateSourceBOMConverterMapperRref();

        return null;
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

    public void process(Object appObj) throws Exception {
        if(appObj != null){
            recursiveBuildTargetBOM(appObj, null, null);
        }
    }

    private void recursiveBuildTargetBOM(Object currentSrcOBJ, List parentSrcObjList, Object parentTargetObj) throws Exception{

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

                                    recursiveBuildTargetBOM(child, ll, newTargetObj);
                                }
                            }
                        }
                    }
                    else{

                        Object oneToOneChild = PropertyUtils.getProperty(currentSrcOBJ, fieldName);

                        List ll = new ArrayList(parentSrcObjList);

                        ll.add(oneToOneChild);

                        recursiveBuildTargetBOM(oneToOneChild, ll, newTargetObj);
                    }
                }
            }
    }

    private void setTargetObjAttribute(Object currentSrcOBJ, List parentSrcObjList, Object currentTargetObj) throws Exception{
        Class targetCls = currentTargetObj.getClass();

        String clsName = targetCls.getSimpleName();

        for(Field field : targetCls.getDeclaredFields()){
            String fieldName = field.getName();

            String[] srcBeanNameAndSrcBeanAttrName = getSrcBeanNameAndSrcBeanAttrName(clsName, fieldName);

            String targetCorrspondingClsName = srcBeanNameAndSrcBeanAttrName[0];

            String targetCorrspondingFieldName = srcBeanNameAndSrcBeanAttrName[1];

            if (targetCorrspondingClsName.equalsIgnoreCase( currentSrcOBJ.getClass().getSimpleName() )) {
                Object corrspondingVal = PropertyUtils.getProperty(currentSrcOBJ, targetCorrspondingFieldName);
                PropertyUtils.setProperty(currentTargetObj, targetCorrspondingFieldName, corrspondingVal);
            }
            else{
                for(Object obj : parentSrcObjList){
                    if (targetCorrspondingClsName.equalsIgnoreCase( obj.getClass().getSimpleName() )) {
                        Object corrspondingVal = PropertyUtils.getProperty(obj, targetCorrspondingFieldName);
                        PropertyUtils.setProperty(currentTargetObj, targetCorrspondingFieldName, corrspondingVal);
                    }
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


    public static void main(String[] args) throws Exception{
        TestDataConvertProcessor testDataConvertProcessor = new TestDataConvertProcessor();

        testDataConvertProcessor.buildConstructor( new Application());
    }
}
