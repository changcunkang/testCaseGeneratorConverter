package com.fico.testCaseGenerator.converter;

import java.util.List;

/**
 * @Author XiangbinYuan stevenYuan
 * @CreationDate 3/28/2018
 */
public class TestDataConverter {

    private BOMBeanConvertMapper rootBOMConverter;

    private List<BOMBeanConvertMapper> srcBOMConverterList;

    public BOMBeanConvertMapper getRootBOMConverter() {
        return rootBOMConverter;
    }

    public void setRootBOMConverter(BOMBeanConvertMapper rootBOMConverter) {
        this.rootBOMConverter = rootBOMConverter;
    }

    public List<BOMBeanConvertMapper> getSrcBOMConverterList() {
        return srcBOMConverterList;
    }

    public void setSrcBOMConverterList(List<BOMBeanConvertMapper> srcBOMConverterList) {
        this.srcBOMConverterList = srcBOMConverterList;
    }


}
