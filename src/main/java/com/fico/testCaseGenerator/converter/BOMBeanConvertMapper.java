package com.fico.testCaseGenerator.converter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author XiangbinYuan stevenYuan
 * @CreationDate 3/28/2018
 */
public abstract class BOMBeanConvertMapper {

    public static final int TYPE_SRC = 0;

    public static final int TYPE_TARGET = 1;

    private String benaName;

    private Class correspondingClass = null;

    private List<BOMAttributeConverterMapper> beanAttrList = new ArrayList<BOMAttributeConverterMapper>();

    private BOMBeanConvertMapper parentMapper;

    private int type;

    public static int getTypeSrc() {
        return TYPE_SRC;
    }

    public static int getTypeTarget() {
        return TYPE_TARGET;
    }

    public String getBenaName() {
        return benaName;
    }

    public void setBenaName(String benaName) {
        this.benaName = benaName;
    }

    public List<BOMAttributeConverterMapper> getBeanAttrList() {
        return beanAttrList;
    }

    public void setBeanAttrList(List<BOMAttributeConverterMapper> beanAttrList) {
        this.beanAttrList = beanAttrList;
    }

    public BOMBeanConvertMapper getParentMapper() {
        return parentMapper;
    }

    public void setParentMapper(BOMBeanConvertMapper parentMapper) {
        this.parentMapper = parentMapper;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Class getCorrespondingClass() {
        return correspondingClass;
    }

    public void setCorrespondingClass(Class correspondingClass) {
        this.correspondingClass = correspondingClass;
    }
}
