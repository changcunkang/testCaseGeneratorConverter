package com.fico.testCaseGenerator.converter;

import java.util.ResourceBundle;

/**
 * @Author XiangbinYuan stevenYuan
 * @CreationDate 3/28/2018
 */
public class TargetBOMBeanConverMapper extends BOMBeanConvertMapper {

    private static String packageName = ResourceBundle.getBundle("javaBOM").getString("convertClassPackageName") + ".";

    public TargetBOMBeanConverMapper(String clsSimpleName){

        String javaClassName = packageName + clsSimpleName;

        try {
            this.setCorrespondingClass( Class.forName(javaClassName  ) );
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private SourceBOMBeanConvertMapper correspondingScourceBOMBeanConvertMapper = null;


    public Object newInstance() throws Exception{
        return this.getCorrespondingClass().newInstance();
    }
}
