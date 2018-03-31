package com.fico.testCaseGenerator.converter;

/**
 * @Author XiangbinYuan stevenYuan
 * @CreationDate 3/28/2018
 */
public class ConfigRawData {

    private String srcBeanName;

    private String srcAttributeName;

    private String targetBeanName;

    private String targetAttributeName;

    public String getSrcBeanName() {
        return srcBeanName;
    }

    public void setSrcBeanName(String srcBeanName) {
        this.srcBeanName = srcBeanName;
    }

    public String getSrcAttributeName() {
        return srcAttributeName;
    }

    public void setSrcAttributeName(String srcAttributeName) {
        this.srcAttributeName = srcAttributeName;
    }

    public String getTargetBeanName() {
        return targetBeanName;
    }

    public void setTargetBeanName(String targetBeanName) {
        this.targetBeanName = targetBeanName;
    }

    public String getTargetAttributeName() {
        return targetAttributeName;
    }

    public void setTargetAttributeName(String targetAttributeName) {
        this.targetAttributeName = targetAttributeName;
    }
}
