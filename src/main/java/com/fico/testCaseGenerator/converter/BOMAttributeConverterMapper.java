package com.fico.testCaseGenerator.converter;

/**
 * @Author XiangbinYuan stevenYuan
 * @CreationDate 3/28/2018
 */
public class BOMAttributeConverterMapper {

    private String srcAttributeName;

    private BOMBeanConvertMapper parentBeanConverter;

    private BOMBeanConvertMapper targetBeanConverter;

    public String getSrcAttributeName() {
        return srcAttributeName;
    }

    public void setSrcAttributeName(String srcAttributeName) {
        this.srcAttributeName = srcAttributeName;
    }

    public BOMBeanConvertMapper getParentBeanConverter() {
        return parentBeanConverter;
    }

    public void setParentBeanConverter(BOMBeanConvertMapper parentBeanConverter) {
        this.parentBeanConverter = parentBeanConverter;
    }

    public BOMBeanConvertMapper getTargetBeanConverter() {
        return targetBeanConverter;
    }

    public void setTargetBeanConverter(BOMBeanConvertMapper targetBeanConverter) {
        this.targetBeanConverter = targetBeanConverter;
    }
}
