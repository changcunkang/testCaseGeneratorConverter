package conversionRequest;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="CARD_MD_HS_ACCT_FQ")
public class CardMdHsAcctFq {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    @Column
    private Long id;
    @Column(name = "XACCOUNT")
    private String XACCOUNT;
    @Column(name = "CUSTR_NBR")
    private String CUSTR_NBR;
    @Column(name = "MONTH_NBR")
    private Integer MONTH_NBR;
    @Column(name = "CATEGORY")
    private Integer CATEGORY;
    @Column(name = "CUR_CYCLE_DT")
    private Integer CUR_CYCLE_DT;
    @Column(name = "FQ_TYPE_CODE")
    private String FQ_TYPE_CODE;
    @Column(name = "FQ_TYPE")
    private String FQ_TYPE;
    @Column(name = "CURR_AMORT_PPL")
    private Integer CURR_AMORT_PPL;
    @Column(name = "AMORT_PPL")
    private Integer AMORT_PPL;
    @Column(name = "UNAMORT_PPL")
    private Integer UNAMORT_PPL;
    @Column(name = "CURR_AMORT_FEE")
    private Integer CURR_AMORT_FEE;
    @Column(name = "AMORT_FEE")
    private Integer AMORT_FEE;
    @Column(name = "UNAMORT_FEE")
    private Integer UNAMORT_FEE;
    @Column(name = "UNAMORT_NBR_MTHS")
    private Integer UNAMORT_NBR_MTHS;
    @Column(name = "AMORT_NBR_MTHS")
    private Integer AMORT_NBR_MTHS;
    @Column(name = "CURR_APP_NBR_MTHS")
    private Integer CURR_APP_NBR_MTHS;
    @Column(name = "CURR_APP_AMT")
    private Integer CURR_APP_AMT;
    @Column(name = "CURR_MAX_NBR_MTHS")
    private Integer CURR_MAX_NBR_MTHS;
    @Column(name = "MYETL_DATE")
    private Date MYETL_DATE;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Integer getMONTH_NBR() {
        return MONTH_NBR;
    }

    public void setMONTH_NBR(Integer MONTH_NBR) {
        this.MONTH_NBR = MONTH_NBR;
    }

    public Integer getCATEGORY() {
        return CATEGORY;
    }

    public void setCATEGORY(Integer CATEGORY) {
        this.CATEGORY = CATEGORY;
    }

    public Integer getCUR_CYCLE_DT() {
        return CUR_CYCLE_DT;
    }

    public void setCUR_CYCLE_DT(Integer CUR_CYCLE_DT) {
        this.CUR_CYCLE_DT = CUR_CYCLE_DT;
    }

    public String getFQ_TYPE_CODE() {
        return FQ_TYPE_CODE;
    }

    public void setFQ_TYPE_CODE(String FQ_TYPE_CODE) {
        this.FQ_TYPE_CODE = FQ_TYPE_CODE;
    }

    public String getFQ_TYPE() {
        return FQ_TYPE;
    }

    public void setFQ_TYPE(String FQ_TYPE) {
        this.FQ_TYPE = FQ_TYPE;
    }

    public Integer getCURR_AMORT_PPL() {
        return CURR_AMORT_PPL;
    }

    public void setCURR_AMORT_PPL(Integer CURR_AMORT_PPL) {
        this.CURR_AMORT_PPL = CURR_AMORT_PPL;
    }

    public Integer getAMORT_PPL() {
        return AMORT_PPL;
    }

    public void setAMORT_PPL(Integer AMORT_PPL) {
        this.AMORT_PPL = AMORT_PPL;
    }

    public Integer getUNAMORT_PPL() {
        return UNAMORT_PPL;
    }

    public void setUNAMORT_PPL(Integer UNAMORT_PPL) {
        this.UNAMORT_PPL = UNAMORT_PPL;
    }

    public Integer getCURR_AMORT_FEE() {
        return CURR_AMORT_FEE;
    }

    public void setCURR_AMORT_FEE(Integer CURR_AMORT_FEE) {
        this.CURR_AMORT_FEE = CURR_AMORT_FEE;
    }

    public Integer getAMORT_FEE() {
        return AMORT_FEE;
    }

    public void setAMORT_FEE(Integer AMORT_FEE) {
        this.AMORT_FEE = AMORT_FEE;
    }

    public Integer getUNAMORT_FEE() {
        return UNAMORT_FEE;
    }

    public void setUNAMORT_FEE(Integer UNAMORT_FEE) {
        this.UNAMORT_FEE = UNAMORT_FEE;
    }

    public Integer getUNAMORT_NBR_MTHS() {
        return UNAMORT_NBR_MTHS;
    }

    public void setUNAMORT_NBR_MTHS(Integer UNAMORT_NBR_MTHS) {
        this.UNAMORT_NBR_MTHS = UNAMORT_NBR_MTHS;
    }

    public Integer getAMORT_NBR_MTHS() {
        return AMORT_NBR_MTHS;
    }

    public void setAMORT_NBR_MTHS(Integer AMORT_NBR_MTHS) {
        this.AMORT_NBR_MTHS = AMORT_NBR_MTHS;
    }

    public Integer getCURR_APP_NBR_MTHS() {
        return CURR_APP_NBR_MTHS;
    }

    public void setCURR_APP_NBR_MTHS(Integer CURR_APP_NBR_MTHS) {
        this.CURR_APP_NBR_MTHS = CURR_APP_NBR_MTHS;
    }

    public Integer getCURR_APP_AMT() {
        return CURR_APP_AMT;
    }

    public void setCURR_APP_AMT(Integer CURR_APP_AMT) {
        this.CURR_APP_AMT = CURR_APP_AMT;
    }

    public Integer getCURR_MAX_NBR_MTHS() {
        return CURR_MAX_NBR_MTHS;
    }

    public void setCURR_MAX_NBR_MTHS(Integer CURR_MAX_NBR_MTHS) {
        this.CURR_MAX_NBR_MTHS = CURR_MAX_NBR_MTHS;
    }

    public Date getMYETL_DATE() {
        return MYETL_DATE;
    }

    public void setMYETL_DATE(Date MYETL_DATE) {
        this.MYETL_DATE = MYETL_DATE;
    }
}
