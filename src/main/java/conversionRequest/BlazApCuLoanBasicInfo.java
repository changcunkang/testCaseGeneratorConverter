package conversionRequest;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="BLAZ_AP_CU_LOAN_BASIC_INFO")
public class BlazApCuLoanBasicInfo {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    @Column
    private Long id;
    @Column(name = "P_ID")
    private String P_ID;
    @Column(name = "F_ID")
    private String F_ID;
    @Column(name = "LOAD_STATUS")
    private String LOAD_STATUS;
    @Column(name = "ORGANIZATION_NAME")
    private String ORGANIZATION_NAME;
    @Column(name = "BUSINESS_SN")
    private String BUSINESS_SN;
    @Column(name = "LOAD_TYPE")
    private String LOAD_TYPE;
    @Column(name = "CURRENCY")
    private String CURRENCY;
    @Column(name = "BEG_DATE")
    private Date BEG_DATE;
    @Column(name = "END_DATE")
    private Date END_DATE;
    @Column(name = "LOAD_AMOUNT")
    private Double LOAD_AMOUNT;
    @Column(name = "BONDS_TYPE")
    private String BONDS_TYPE;
    @Column(name = "REPAY_WAY")
    private String REPAY_WAY;
    @Column(name = "LOAD_PERIODS")
    private String LOAD_PERIODS;
    @Column(name = "UPDATE_DATE")
    private Date UPDATE_DATE;
    @Column(name = "FIVE_STYLE")
    private String FIVE_STYLE;
    @Column(name = "BASIC_LOAD_AMOUNT")
    private Double BASIC_LOAD_AMOUNT;
    @Column(name = "REMAIN_LOAD_PERIODS")
    private Integer REMAIN_LOAD_PERIODS;
    @Column(name = "REPAY_AT_MONTH")
    private Double REPAY_AT_MONTH;
    @Column(name = "NEED_REPAY_DATE")
    private Date NEED_REPAY_DATE;
    @Column(name = "REPAYED_AT_MONTH")
    private Double REPAYED_AT_MONTH;
    @Column(name = "LAST_REPAY_DATE")
    private Date LAST_REPAY_DATE;
    @Column(name = "OVERDUE_PERIODS")
    private Integer OVERDUE_PERIODS;
    @Column(name = "OVERDUE_AMOUNT")
    private Double OVERDUE_AMOUNT;
    @Column(name = "OVERDUE_3160_AMOUNT")
    private Double OVERDUE_3160_AMOUNT;
    @Column(name = "OVERDUE_6190_AMOUNT")
    private Double OVERDUE_6190_AMOUNT;
    @Column(name = "OVERDUE_91180_AMOUNT")
    private Double OVERDUE_91180_AMOUNT;
    @Column(name = "OVERDUE_180_AMOUNT")
    private Double OVERDUE_180_AMOUNT;
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

    public String getLOAD_STATUS() {
        return LOAD_STATUS;
    }

    public void setLOAD_STATUS(String LOAD_STATUS) {
        this.LOAD_STATUS = LOAD_STATUS;
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

    public String getLOAD_TYPE() {
        return LOAD_TYPE;
    }

    public void setLOAD_TYPE(String LOAD_TYPE) {
        this.LOAD_TYPE = LOAD_TYPE;
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

    public Date getEND_DATE() {
        return END_DATE;
    }

    public void setEND_DATE(Date END_DATE) {
        this.END_DATE = END_DATE;
    }

    public Double getLOAD_AMOUNT() {
        return LOAD_AMOUNT;
    }

    public void setLOAD_AMOUNT(Double LOAD_AMOUNT) {
        this.LOAD_AMOUNT = LOAD_AMOUNT;
    }

    public String getBONDS_TYPE() {
        return BONDS_TYPE;
    }

    public void setBONDS_TYPE(String BONDS_TYPE) {
        this.BONDS_TYPE = BONDS_TYPE;
    }

    public String getREPAY_WAY() {
        return REPAY_WAY;
    }

    public void setREPAY_WAY(String REPAY_WAY) {
        this.REPAY_WAY = REPAY_WAY;
    }

    public String getLOAD_PERIODS() {
        return LOAD_PERIODS;
    }

    public void setLOAD_PERIODS(String LOAD_PERIODS) {
        this.LOAD_PERIODS = LOAD_PERIODS;
    }

    public Date getUPDATE_DATE() {
        return UPDATE_DATE;
    }

    public void setUPDATE_DATE(Date UPDATE_DATE) {
        this.UPDATE_DATE = UPDATE_DATE;
    }

    public String getFIVE_STYLE() {
        return FIVE_STYLE;
    }

    public void setFIVE_STYLE(String FIVE_STYLE) {
        this.FIVE_STYLE = FIVE_STYLE;
    }

    public Double getBASIC_LOAD_AMOUNT() {
        return BASIC_LOAD_AMOUNT;
    }

    public void setBASIC_LOAD_AMOUNT(Double BASIC_LOAD_AMOUNT) {
        this.BASIC_LOAD_AMOUNT = BASIC_LOAD_AMOUNT;
    }

    public Integer getREMAIN_LOAD_PERIODS() {
        return REMAIN_LOAD_PERIODS;
    }

    public void setREMAIN_LOAD_PERIODS(Integer REMAIN_LOAD_PERIODS) {
        this.REMAIN_LOAD_PERIODS = REMAIN_LOAD_PERIODS;
    }

    public Double getREPAY_AT_MONTH() {
        return REPAY_AT_MONTH;
    }

    public void setREPAY_AT_MONTH(Double REPAY_AT_MONTH) {
        this.REPAY_AT_MONTH = REPAY_AT_MONTH;
    }

    public Date getNEED_REPAY_DATE() {
        return NEED_REPAY_DATE;
    }

    public void setNEED_REPAY_DATE(Date NEED_REPAY_DATE) {
        this.NEED_REPAY_DATE = NEED_REPAY_DATE;
    }

    public Double getREPAYED_AT_MONTH() {
        return REPAYED_AT_MONTH;
    }

    public void setREPAYED_AT_MONTH(Double REPAYED_AT_MONTH) {
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

    public Double getOVERDUE_AMOUNT() {
        return OVERDUE_AMOUNT;
    }

    public void setOVERDUE_AMOUNT(Double OVERDUE_AMOUNT) {
        this.OVERDUE_AMOUNT = OVERDUE_AMOUNT;
    }

    public Double getOVERDUE_3160_AMOUNT() {
        return OVERDUE_3160_AMOUNT;
    }

    public void setOVERDUE_3160_AMOUNT(Double OVERDUE_3160_AMOUNT) {
        this.OVERDUE_3160_AMOUNT = OVERDUE_3160_AMOUNT;
    }

    public Double getOVERDUE_6190_AMOUNT() {
        return OVERDUE_6190_AMOUNT;
    }

    public void setOVERDUE_6190_AMOUNT(Double OVERDUE_6190_AMOUNT) {
        this.OVERDUE_6190_AMOUNT = OVERDUE_6190_AMOUNT;
    }

    public Double getOVERDUE_91180_AMOUNT() {
        return OVERDUE_91180_AMOUNT;
    }

    public void setOVERDUE_91180_AMOUNT(Double OVERDUE_91180_AMOUNT) {
        this.OVERDUE_91180_AMOUNT = OVERDUE_91180_AMOUNT;
    }

    public Double getOVERDUE_180_AMOUNT() {
        return OVERDUE_180_AMOUNT;
    }

    public void setOVERDUE_180_AMOUNT(Double OVERDUE_180_AMOUNT) {
        this.OVERDUE_180_AMOUNT = OVERDUE_180_AMOUNT;
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
