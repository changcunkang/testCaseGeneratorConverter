package conversionRequest;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="BLAZ_AP_HS_ACCT_CHGS")
public class BlazApHsAcctChgs {
    private String CUSTR_NBR;
    private String XACCOUNT;
    private Integer CATEGORY;
    private Integer APP_LIMIT_DATE;
    private String APP_LIMIT_CH;
    private Integer APP_LIMIT;
    private Integer APP_LIMIT_RLT;
    private String CHGA_TYPE;
    private String LIMIT_CHWAY;
    private Integer LIMIT_T;
    private Date CHGA_DATE;
    private Integer CHGA_AFTER_VALUE;
    private Integer CHGA_BEG_DT;
    private Date CHGA_END_DT;
    private Integer CHGA_BEFOR_VALUE;
    private Date MYETL_DATE;

    public String getCUSTR_NBR() {
        return CUSTR_NBR;
    }

    public void setCUSTR_NBR(String CUSTR_NBR) {
        this.CUSTR_NBR = CUSTR_NBR;
    }

    public String getXACCOUNT() {
        return XACCOUNT;
    }

    public void setXACCOUNT(String XACCOUNT) {
        this.XACCOUNT = XACCOUNT;
    }

    public Integer getCATEGORY() {
        return CATEGORY;
    }

    public void setCATEGORY(Integer CATEGORY) {
        this.CATEGORY = CATEGORY;
    }

    public Integer getAPP_LIMIT_DATE() {
        return APP_LIMIT_DATE;
    }

    public void setAPP_LIMIT_DATE(Integer APP_LIMIT_DATE) {
        this.APP_LIMIT_DATE = APP_LIMIT_DATE;
    }

    public String getAPP_LIMIT_CH() {
        return APP_LIMIT_CH;
    }

    public void setAPP_LIMIT_CH(String APP_LIMIT_CH) {
        this.APP_LIMIT_CH = APP_LIMIT_CH;
    }

    public Integer getAPP_LIMIT() {
        return APP_LIMIT;
    }

    public void setAPP_LIMIT(Integer APP_LIMIT) {
        this.APP_LIMIT = APP_LIMIT;
    }

    public Integer getAPP_LIMIT_RLT() {
        return APP_LIMIT_RLT;
    }

    public void setAPP_LIMIT_RLT(Integer APP_LIMIT_RLT) {
        this.APP_LIMIT_RLT = APP_LIMIT_RLT;
    }

    public String getCHGA_TYPE() {
        return CHGA_TYPE;
    }

    public void setCHGA_TYPE(String CHGA_TYPE) {
        this.CHGA_TYPE = CHGA_TYPE;
    }

    public String getLIMIT_CHWAY() {
        return LIMIT_CHWAY;
    }

    public void setLIMIT_CHWAY(String LIMIT_CHWAY) {
        this.LIMIT_CHWAY = LIMIT_CHWAY;
    }

    public Integer getLIMIT_T() {
        return LIMIT_T;
    }

    public void setLIMIT_T(Integer LIMIT_T) {
        this.LIMIT_T = LIMIT_T;
    }

    public Date getCHGA_DATE() {
        return CHGA_DATE;
    }

    public void setCHGA_DATE(Date CHGA_DATE) {
        this.CHGA_DATE = CHGA_DATE;
    }

    public Integer getCHGA_AFTER_VALUE() {
        return CHGA_AFTER_VALUE;
    }

    public void setCHGA_AFTER_VALUE(Integer CHGA_AFTER_VALUE) {
        this.CHGA_AFTER_VALUE = CHGA_AFTER_VALUE;
    }

    public Integer getCHGA_BEG_DT() {
        return CHGA_BEG_DT;
    }

    public void setCHGA_BEG_DT(Integer CHGA_BEG_DT) {
        this.CHGA_BEG_DT = CHGA_BEG_DT;
    }

    public Date getCHGA_END_DT() {
        return CHGA_END_DT;
    }

    public void setCHGA_END_DT(Date CHGA_END_DT) {
        this.CHGA_END_DT = CHGA_END_DT;
    }

    public Integer getCHGA_BEFOR_VALUE() {
        return CHGA_BEFOR_VALUE;
    }

    public void setCHGA_BEFOR_VALUE(Integer CHGA_BEFOR_VALUE) {
        this.CHGA_BEFOR_VALUE = CHGA_BEFOR_VALUE;
    }

    public Date getMYETL_DATE() {
        return MYETL_DATE;
    }

    public void setMYETL_DATE(Date MYETL_DATE) {
        this.MYETL_DATE = MYETL_DATE;
    }
}
