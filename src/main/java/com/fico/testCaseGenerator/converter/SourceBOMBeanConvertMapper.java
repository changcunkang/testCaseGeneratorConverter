package com.fico.testCaseGenerator.converter;


import java.util.ArrayList;
import java.util.List;

/**
 * @Author XiangbinYuan stevenYuan
 * @CreationDate 3/28/2018
 */
public class SourceBOMBeanConvertMapper extends BOMBeanConvertMapper {

    private List<TargetBOMBeanConverMapper> targetBOMBeanConverMapperList = new ArrayList<TargetBOMBeanConverMapper>();

    public List<TargetBOMBeanConverMapper> getTargetBOMBeanConverMapperList() {
        return targetBOMBeanConverMapperList;
    }

    public void setTargetBOMBeanConverMapperList(List<TargetBOMBeanConverMapper> targetBOMBeanConverMapperList) {
        this.targetBOMBeanConverMapperList = targetBOMBeanConverMapperList;
    }
}
