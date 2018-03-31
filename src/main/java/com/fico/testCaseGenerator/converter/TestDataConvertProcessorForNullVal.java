package com.fico.testCaseGenerator.converter;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @Author XiangbinYuan stevenYuan
 * @CreationDate 3/28/2018
 */
public class TestDataConvertProcessorForNullVal {

    private static int OPERATION_TYPE_ADD_NULL_VALUE = 0;

    private static int OPERATION_TYPE_REMOVE_NULL_VALUE = 1;

    private static Integer INT_NULL_VAL = -9998;

    private static Long LONG_NULL_VAL = -9998l;

    private static Double DOUBLE_NULL_VAL = -9998d;

    private static String STRING_NULL_VAL = "NULL";

    private static Date DATE_NULL_VAL = null;

    private static Map<Class, Object> TYPE_NULL_VAL_MAP = new HashMap<Class, Object>();

    static{
        try {
            DATE_NULL_VAL = new SimpleDateFormat("yyyy-MM-dd").parse("1099-01-01");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        TYPE_NULL_VAL_MAP.put(Double.class, DOUBLE_NULL_VAL);
        TYPE_NULL_VAL_MAP.put(Float.class, DOUBLE_NULL_VAL);
        TYPE_NULL_VAL_MAP.put(double.class, DOUBLE_NULL_VAL);
        TYPE_NULL_VAL_MAP.put(float.class, DOUBLE_NULL_VAL);

        TYPE_NULL_VAL_MAP.put(Integer.class, INT_NULL_VAL);
        TYPE_NULL_VAL_MAP.put(Long.class, LONG_NULL_VAL);
        TYPE_NULL_VAL_MAP.put(int.class, INT_NULL_VAL);
        TYPE_NULL_VAL_MAP.put(long.class, LONG_NULL_VAL);

        TYPE_NULL_VAL_MAP.put(String.class, STRING_NULL_VAL);

        TYPE_NULL_VAL_MAP.put(Date.class, DATE_NULL_VAL);
    }


    public Object addApplicationNullValue(Object appObj) throws Exception {
        if(appObj != null){
           recursiveOperationBOM(appObj, OPERATION_TYPE_ADD_NULL_VALUE);
        }
        return appObj;
    }

    public Object removeApplicationNullValue(Object appObj) throws Exception {
        if(appObj != null){
            recursiveOperationBOM(appObj, OPERATION_TYPE_REMOVE_NULL_VALUE);
        }
        return appObj;
    }

    private void recursiveOperationBOM(Object currentSrcOBJ, int operationType) throws Exception{

        Class cls = currentSrcOBJ.getClass();

        for(Field field : cls.getDeclaredFields()) {
            if (isBasicType(field.getType())) {
                operationSimpleField(field, currentSrcOBJ, operationType);
            } else {
                String fieldName = field.getName();

                if (Collection.class.isAssignableFrom(field.getType())) {
                    if (field.getGenericType() instanceof ParameterizedType) {
                        ParameterizedType pt = (ParameterizedType) field.getGenericType();
                        //得到泛型里的class类型对象
                        Class genericClazz = (Class) pt.getActualTypeArguments()[0];

                        List childrenEleList = (List) invokeGetterMethod(currentSrcOBJ, fieldName);

                        if (childrenEleList != null) {
                            for (Object child : childrenEleList) {
                                recursiveOperationBOM(child, operationType);
                            }
                        }
                    }
                } else {

                    Object oneToOneChild = invokeGetterMethod(currentSrcOBJ, fieldName);
                    if( oneToOneChild != null ){
                        recursiveOperationBOM(oneToOneChild, operationType);
                    }
                }
            }
        }
    }

    private void operationSimpleField(Field field, Object obj, int operationType) throws Exception{

        //规避使用PropertyUtils.setProperty获取属性时，属性首字母大写报错问题
        String filedName = field.getName();
        Object fieldValue = invokeGetterMethod(obj, filedName);
        Class filedType = field.getType();

        if(operationType == OPERATION_TYPE_ADD_NULL_VALUE && fieldValue == null){
            invokeSetterMethod(obj, filedName, TYPE_NULL_VAL_MAP.get(filedType));
        }
        else if(operationType == OPERATION_TYPE_REMOVE_NULL_VALUE){
           if( invokeGetterMethod(obj, filedName ).equals(TYPE_NULL_VAL_MAP.get(filedType))){
               invokeSetterMethod(obj, filedName, null);
           }
        }
    }


    public Object invokeGetterMethod(Object obj, String filedName) throws Exception{
        Class cls = obj.getClass();

        for( Method m : cls.getDeclaredMethods() ){
            if(m.getName().equalsIgnoreCase( getGetterMethodName(filedName) )){
               return  m.invoke(obj, null);
            }
        }
        return null;
    }

    public void invokeSetterMethod(Object obj, String filedName, Object val) throws Exception{
        Class cls = obj.getClass();

        for( Method m : cls.getDeclaredMethods() ){
            if(m.getName().equalsIgnoreCase( getSetterMethodName(filedName) )){
                m.invoke(obj, val);
            }
        }
    }

    public String getGetterMethodName(String filedName){
        return "get" + filedName.substring(0,1).toLowerCase() + filedName.substring(1);
    }


    public String getSetterMethodName(String filedName){
        return "set" + filedName.substring(0,1).toLowerCase() + filedName.substring(1);
    }

    public  boolean isBasicType(Class fieldType){
        if(fieldType.isPrimitive() ||
                fieldType == Integer.class || fieldType == Double.class ||
                fieldType == Float.class || fieldType == String.class ||
                fieldType == Date.class || fieldType == Short.class ||
                fieldType == Long.class || //|| fieldType == Byte.class ||
                fieldType == Boolean.class //|| fieldType == Byte.class ||
                //fieldType == Character.class || fieldType == Character.class
                ){
            return true;
        }
        return false;
    }
}
