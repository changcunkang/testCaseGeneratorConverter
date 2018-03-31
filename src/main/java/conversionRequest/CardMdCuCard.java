package conversionRequest;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="CARD_MD_CU_CARD")
public class CardMdCuCard {

    private String CARD_NBR;
    private Integer CYCLE_NBR;
    private String APP_JDAY;
    private String APP_SEQ;
    private String MICROFILM;
    private Integer ACCT_DAY_OPENED;
    private String CARD_ID;
    private Integer FIRST_ACTIVE_DAY;
    private Integer FIRST_CASH;
    private Integer FIRST_POS;
    private Integer PRODUCT;
    private String PRODUCT_DESC;
    private String XACCOUNT;
    private String CUSTR_NBR;
    private String MASTER_NBR;
    private String CHANNEL;
    private Integer CARDHOLDER;
    private String CANCL_CODE;
    private Integer ACTIVE_DAY;
    private Integer MAILER_1ST;
    private Integer LAST_POS;
    private Integer LAST_CASH;
    private Integer FIRST_OPOS;
    private Integer FIRST_OCASH;
    private Integer LAST_OPOS;
    private Integer LAST_OCASH;
    private Integer ACT_FLAG;
    private Integer LAST_TDAY;
    private Integer LAST_TDAYS;
    private Integer CARD_EFF_FLAG;
    private Integer ISSUE_DAY;
    private Integer MONTH_NBR;
    private Date MYETL_DATE;

    public String getCARD_NBR() {
        return CARD_NBR;
    }

    public void setCARD_NBR(String CARD_NBR) {
        this.CARD_NBR = CARD_NBR;
    }

    public Integer getCYCLE_NBR() {
        return CYCLE_NBR;
    }

    public void setCYCLE_NBR(Integer CYCLE_NBR) {
        this.CYCLE_NBR = CYCLE_NBR;
    }

    public String getAPP_JDAY() {
        return APP_JDAY;
    }

    public void setAPP_JDAY(String APP_JDAY) {
        this.APP_JDAY = APP_JDAY;
    }

    public String getAPP_SEQ() {
        return APP_SEQ;
    }

    public void setAPP_SEQ(String APP_SEQ) {
        this.APP_SEQ = APP_SEQ;
    }

    public String getMICROFILM() {
        return MICROFILM;
    }

    public void setMICROFILM(String MICROFILM) {
        this.MICROFILM = MICROFILM;
    }

    public Integer getACCT_DAY_OPENED() {
        return ACCT_DAY_OPENED;
    }

    public void setACCT_DAY_OPENED(Integer ACCT_DAY_OPENED) {
        this.ACCT_DAY_OPENED = ACCT_DAY_OPENED;
    }

    public String getCARD_ID() {
        return CARD_ID;
    }

    public void setCARD_ID(String CARD_ID) {
        this.CARD_ID = CARD_ID;
    }

    public Integer getFIRST_ACTIVE_DAY() {
        return FIRST_ACTIVE_DAY;
    }

    public void setFIRST_ACTIVE_DAY(Integer FIRST_ACTIVE_DAY) {
        this.FIRST_ACTIVE_DAY = FIRST_ACTIVE_DAY;
    }

    public Integer getFIRST_CASH() {
        return FIRST_CASH;
    }

    public void setFIRST_CASH(Integer FIRST_CASH) {
        this.FIRST_CASH = FIRST_CASH;
    }

    public Integer getFIRST_POS() {
        return FIRST_POS;
    }

    public void setFIRST_POS(Integer FIRST_POS) {
        this.FIRST_POS = FIRST_POS;
    }

    public Integer getPRODUCT() {
        return PRODUCT;
    }

    public void setPRODUCT(Integer PRODUCT) {
        this.PRODUCT = PRODUCT;
    }

    public String getPRODUCT_DESC() {
        return PRODUCT_DESC;
    }

    public void setPRODUCT_DESC(String PRODUCT_DESC) {
        this.PRODUCT_DESC = PRODUCT_DESC;
    }

    public String getXACCOUNT() {
        return XACCOUNT;
    }

    public void setXACCOUNT(String XACCOUNT) {
        this.XACCOUNT = XACCOUNT;
    }

    public String getCUSTR_NBR() {
        return CUSTR_NBR;
    }

    public void setCUSTR_NBR(String CUSTR_NBR) {
        this.CUSTR_NBR = CUSTR_NBR;
    }

    public String getMASTER_NBR() {
        return MASTER_NBR;
    }

    public void setMASTER_NBR(String MASTER_NBR) {
        this.MASTER_NBR = MASTER_NBR;
    }

    public String getCHANNEL() {
        return CHANNEL;
    }

    public void setCHANNEL(String CHANNEL) {
        this.CHANNEL = CHANNEL;
    }

    public Integer getCARDHOLDER() {
        return CARDHOLDER;
    }

    public void setCARDHOLDER(Integer CARDHOLDER) {
        this.CARDHOLDER = CARDHOLDER;
    }

    public String getCANCL_CODE() {
        return CANCL_CODE;
    }

    public void setCANCL_CODE(String CANCL_CODE) {
        this.CANCL_CODE = CANCL_CODE;
    }

    public Integer getACTIVE_DAY() {
        return ACTIVE_DAY;
    }

    public void setACTIVE_DAY(Integer ACTIVE_DAY) {
        this.ACTIVE_DAY = ACTIVE_DAY;
    }

    public Integer getMAILER_1ST() {
        return MAILER_1ST;
    }

    public void setMAILER_1ST(Integer MAILER_1ST) {
        this.MAILER_1ST = MAILER_1ST;
    }

    public Integer getLAST_POS() {
        return LAST_POS;
    }

    public void setLAST_POS(Integer LAST_POS) {
        this.LAST_POS = LAST_POS;
    }

    public Integer getLAST_CASH() {
        return LAST_CASH;
    }

    public void setLAST_CASH(Integer LAST_CASH) {
        this.LAST_CASH = LAST_CASH;
    }

    public Integer getFIRST_OPOS() {
        return FIRST_OPOS;
    }

    public void setFIRST_OPOS(Integer FIRST_OPOS) {
        this.FIRST_OPOS = FIRST_OPOS;
    }

    public Integer getFIRST_OCASH() {
        return FIRST_OCASH;
    }

    public void setFIRST_OCASH(Integer FIRST_OCASH) {
        this.FIRST_OCASH = FIRST_OCASH;
    }

    public Integer getLAST_OPOS() {
        return LAST_OPOS;
    }

    public void setLAST_OPOS(Integer LAST_OPOS) {
        this.LAST_OPOS = LAST_OPOS;
    }

    public Integer getLAST_OCASH() {
        return LAST_OCASH;
    }

    public void setLAST_OCASH(Integer LAST_OCASH) {
        this.LAST_OCASH = LAST_OCASH;
    }

    public Integer getACT_FLAG() {
        return ACT_FLAG;
    }

    public void setACT_FLAG(Integer ACT_FLAG) {
        this.ACT_FLAG = ACT_FLAG;
    }

    public Integer getLAST_TDAY() {
        return LAST_TDAY;
    }

    public void setLAST_TDAY(Integer LAST_TDAY) {
        this.LAST_TDAY = LAST_TDAY;
    }

    public Integer getLAST_TDAYS() {
        return LAST_TDAYS;
    }

    public void setLAST_TDAYS(Integer LAST_TDAYS) {
        this.LAST_TDAYS = LAST_TDAYS;
    }

    public Integer getCARD_EFF_FLAG() {
        return CARD_EFF_FLAG;
    }

    public void setCARD_EFF_FLAG(Integer CARD_EFF_FLAG) {
        this.CARD_EFF_FLAG = CARD_EFF_FLAG;
    }

    public Integer getISSUE_DAY() {
        return ISSUE_DAY;
    }

    public void setISSUE_DAY(Integer ISSUE_DAY) {
        this.ISSUE_DAY = ISSUE_DAY;
    }

    public Integer getMONTH_NBR() {
        return MONTH_NBR;
    }

    public void setMONTH_NBR(Integer MONTH_NBR) {
        this.MONTH_NBR = MONTH_NBR;
    }

    public Date getMYETL_DATE() {
        return MYETL_DATE;
    }

    public void setMYETL_DATE(Date MYETL_DATE) {
        this.MYETL_DATE = MYETL_DATE;
    }
}
