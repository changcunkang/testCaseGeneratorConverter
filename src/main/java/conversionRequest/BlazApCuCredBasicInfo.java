package conversionRequest;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="BLAZ_AP_CU_CRED_BASIC_INFO")
public class BlazApCuCredBasicInfo {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    @Column
    private Long id;
    @Column(name = "P_ID")
    private String P_ID;
    @Column(name = "F_ID")
    private String F_ID;
    @Column(name = "CREDIT_STATUS")
    private String CREDIT_STATUS;
    @Column(name = "ORGANIZATION_NAME")
    private String ORGANIZATION_NAME;
    @Column(name = "BUSINESS_SN")
    private String BUSINESS_SN;
    @Column(name = "CURRENCY")
    private String CURRENCY;
    @Column(name = "BEG_DATE")
    private Date BEG_DATE;
    @Column(name = "EXTENSION")
    private Integer EXTENSION;
    @Column(name = "BONDS_TYPE")
    private String BONDS_TYPE;
    @Column(name = "UPDATE_DATE")
    private Date UPDATE_DATE;
    @Column(name = "EXTENSION_SHARE")
    private Integer EXTENSION_SHARE;
    @Column(name = "USED_AMOUNT")
    private Integer USED_AMOUNT;
    @Column(name = "LAST_6MONTH_AVG")
    private Integer LAST_6MONTH_AVG;
    @Column(name = "MAX_USED_AMOUNT")
    private Integer MAX_USED_AMOUNT;
    @Column(name = "BILL_DATE")
    private Date BILL_DATE;
    @Column(name = "REPAY_AT_MONTH")
    private Integer REPAY_AT_MONTH;
    @Column(name = "REPAYED_AT_MONTH")
    private Integer REPAYED_AT_MONTH;
    @Column(name = "LAST_REPAY_DATE")
    private Date LAST_REPAY_DATE;
    @Column(name = "OVERDUE_PERIODS")
    private Integer OVERDUE_PERIODS;
    @Column(name = "OVERDUE_AMOUNT")
    private Integer OVERDUE_AMOUNT;
    @Column(name = "BEG_YEAR_MONTH")
    private String BEG_YEAR_MONTH;
    @Column(name = "END_YEAR_MONTH")
    private String END_YEAR_MONTH;
    @Column(name = "MONTH_24STATUS")
    private String MONTH_24STATUS;
    @Column
    private Long parent_id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParent_id() {
        return parent_id;
    }

    public void setParent_id(Long parent_id) {
        this.parent_id = parent_id;
    }

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

    public Integer getUSED_AMOUNT() {
        return USED_AMOUNT;
    }

    public void setUSED_AMOUNT(Integer USED_AMOUNT) {
        this.USED_AMOUNT = USED_AMOUNT;
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

    public Integer getREPAY_AT_MONTH() {
        return REPAY_AT_MONTH;
    }

    public void setREPAY_AT_MONTH(Integer REPAY_AT_MONTH) {
        this.REPAY_AT_MONTH = REPAY_AT_MONTH;
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

    public Integer getOVERDUE_PERIODS() {
        return OVERDUE_PERIODS;
    }

    public void setOVERDUE_PERIODS(Integer OVERDUE_PERIODS) {
        this.OVERDUE_PERIODS = OVERDUE_PERIODS;
    }

    public Integer getOVERDUE_AMOUNT() {
        return OVERDUE_AMOUNT;
    }

    public void setOVERDUE_AMOUNT(Integer OVERDUE_AMOUNT) {
        this.OVERDUE_AMOUNT = OVERDUE_AMOUNT;
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
