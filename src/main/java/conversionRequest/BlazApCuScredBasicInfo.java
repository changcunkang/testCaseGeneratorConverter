package conversionRequest;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="BLAZ_AP_CU_SCRED_BASIC_INFO")
public class BlazApCuScredBasicInfo {
    private String P_ID;
    private String F_ID;
    private String CREDIT_STATUS;
    private String ORGANIZATION_NAME;
    private String BUSINESS_SN;
    private String CURRENCY;
    private Date BEG_DATE;
    private Integer EXTENSION;
    private String BONDS_TYPE;
    private Date UPDATE_DATE;
    private Integer EXTENSION_SHARE;
    private Integer REMAIN;
    private Integer LAST_6MONTH_AVG;
    private Integer MAX_USED_AMOUNT;
    private Date BILL_DATE;
    private Integer REPAYED_AT_MONTH;
    private Date LAST_REPAY_DATE;
    private Integer OVERDUE_180D_AMOUNT;
    private String BEG_YEAR_MONTH;
    private String END_YEAR_MONTH;
    private String MONTH_24STATUS;

    public String getP_ID() {
        return P_ID;
    }

    public void setP_ID(String p_ID) {
        P_ID = p_ID;
    }

    public String getF_ID() {
        return F_ID;
    }

    public void setF_ID(String f_ID) {
        F_ID = f_ID;
    }

    public String getCREDIT_STATUS() {
        return CREDIT_STATUS;
    }

    public void setCREDIT_STATUS(String CREDIT_STATUS) {
        this.CREDIT_STATUS = CREDIT_STATUS;
    }

    public String getORGANIZATION_NAME() {
        return ORGANIZATION_NAME;
    }

    public void setORGANIZATION_NAME(String ORGANIZATION_NAME) {
        this.ORGANIZATION_NAME = ORGANIZATION_NAME;
    }

    public String getBUSINESS_SN() {
        return BUSINESS_SN;
    }

    public void setBUSINESS_SN(String BUSINESS_SN) {
        this.BUSINESS_SN = BUSINESS_SN;
    }

    public String getCURRENCY() {
        return CURRENCY;
    }

    public void setCURRENCY(String CURRENCY) {
        this.CURRENCY = CURRENCY;
    }

    public Date getBEG_DATE() {
        return BEG_DATE;
    }

    public void setBEG_DATE(Date BEG_DATE) {
        this.BEG_DATE = BEG_DATE;
    }

    public Integer getEXTENSION() {
        return EXTENSION;
    }

    public void setEXTENSION(Integer EXTENSION) {
        this.EXTENSION = EXTENSION;
    }

    public String getBONDS_TYPE() {
        return BONDS_TYPE;
    }

    public void setBONDS_TYPE(String BONDS_TYPE) {
        this.BONDS_TYPE = BONDS_TYPE;
    }

    public Date getUPDATE_DATE() {
        return UPDATE_DATE;
    }

    public void setUPDATE_DATE(Date UPDATE_DATE) {
        this.UPDATE_DATE = UPDATE_DATE;
    }

    public Integer getEXTENSION_SHARE() {
        return EXTENSION_SHARE;
    }

    public void setEXTENSION_SHARE(Integer EXTENSION_SHARE) {
        this.EXTENSION_SHARE = EXTENSION_SHARE;
    }

    public Integer getREMAIN() {
        return REMAIN;
    }

    public void setREMAIN(Integer REMAIN) {
        this.REMAIN = REMAIN;
    }

    public Integer getLAST_6MONTH_AVG() {
        return LAST_6MONTH_AVG;
    }

    public void setLAST_6MONTH_AVG(Integer LAST_6MONTH_AVG) {
        this.LAST_6MONTH_AVG = LAST_6MONTH_AVG;
    }

    public Integer getMAX_USED_AMOUNT() {
        return MAX_USED_AMOUNT;
    }

    public void setMAX_USED_AMOUNT(Integer MAX_USED_AMOUNT) {
        this.MAX_USED_AMOUNT = MAX_USED_AMOUNT;
    }

    public Date getBILL_DATE() {
        return BILL_DATE;
    }

    public void setBILL_DATE(Date BILL_DATE) {
        this.BILL_DATE = BILL_DATE;
    }

    public Integer getREPAYED_AT_MONTH() {
        return REPAYED_AT_MONTH;
    }

    public void setREPAYED_AT_MONTH(Integer REPAYED_AT_MONTH) {
        this.REPAYED_AT_MONTH = REPAYED_AT_MONTH;
    }

    public Date getLAST_REPAY_DATE() {
        return LAST_REPAY_DATE;
    }

    public void setLAST_REPAY_DATE(Date LAST_REPAY_DATE) {
        this.LAST_REPAY_DATE = LAST_REPAY_DATE;
    }

    public Integer getOVERDUE_180D_AMOUNT() {
        return OVERDUE_180D_AMOUNT;
    }

    public void setOVERDUE_180D_AMOUNT(Integer OVERDUE_180D_AMOUNT) {
        this.OVERDUE_180D_AMOUNT = OVERDUE_180D_AMOUNT;
    }

    public String getBEG_YEAR_MONTH() {
        return BEG_YEAR_MONTH;
    }

    public void setBEG_YEAR_MONTH(String BEG_YEAR_MONTH) {
        this.BEG_YEAR_MONTH = BEG_YEAR_MONTH;
    }

    public String getEND_YEAR_MONTH() {
        return END_YEAR_MONTH;
    }

    public void setEND_YEAR_MONTH(String END_YEAR_MONTH) {
        this.END_YEAR_MONTH = END_YEAR_MONTH;
    }

    public String getMONTH_24STATUS() {
        return MONTH_24STATUS;
    }

    public void setMONTH_24STATUS(String MONTH_24STATUS) {
        this.MONTH_24STATUS = MONTH_24STATUS;
    }
}
