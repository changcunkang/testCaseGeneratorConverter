package conversionRequest;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="BLAZ_AP_CYC_ACCT_STAT")
public class BlazApCycAcctState {

    private String XACCOUNT;
    private Integer CATEGORY;
    private String BlAZ_PROD_CD;
    private String CUSTR_NBR;
    private Integer MONTH_NBR;
    private Integer CYCLE_NBR;
    private Integer MTHS_ODUE;
    private Integer MAX_LIMIT;
    private Integer MAX_TEMP_LIMIT;
    private Integer CRED_LIMIT;
    private Integer TEMP_LIMIT;
    private Integer MAX_CASH_LIMIT;
    private Double STM_BALNCE;
    private Double ODUE_AMT;
    private Double STM_BALORI;
    private Double INCOME;
    private Double CUR_BAL_SUM;
    private Double RECVBL_DEBT;
    private Double CUR_LIMIT_SUM;
    private Double MAX_CUR_BAL;
    private Double FQ_ZD_INSTL;
    private Double PAYMT_CLRD;
    private Double CONSM_AMT_TOP_1;
    private Double CONSM_AMT_TOP_2;
    private Double CONSM_AMT_TOP_3;
    private Double CONSM_AMT_TOP_4;
    private Double CONSM_AMT_TOP_5;
    private Integer IS_ADJ_LIMIT_INCYC;
    private Integer IS_ADJ_TMP_LIMIT_INCYC;
    private Integer IS_XFFQ_INCYC;
    private Integer IS_ZDFQ_INCYC;

    private Double INP_CASH_AMT;
    private Double INT_AMT;
    private Integer DAYS_LIMIT_USED;
    private Date MYETL_DATE;

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

    public String getBlAZ_PROD_CD() {
        return BlAZ_PROD_CD;
    }

    public void setBlAZ_PROD_CD(String blAZ_PROD_CD) {
        BlAZ_PROD_CD = blAZ_PROD_CD;
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

    public Integer getCYCLE_NBR() {
        return CYCLE_NBR;
    }

    public void setCYCLE_NBR(Integer CYCLE_NBR) {
        this.CYCLE_NBR = CYCLE_NBR;
    }

    public Integer getMTHS_ODUE() {
        return MTHS_ODUE;
    }

    public void setMTHS_ODUE(Integer MTHS_ODUE) {
        this.MTHS_ODUE = MTHS_ODUE;
    }

    public Integer getMAX_LIMIT() {
        return MAX_LIMIT;
    }

    public void setMAX_LIMIT(Integer MAX_LIMIT) {
        this.MAX_LIMIT = MAX_LIMIT;
    }

    public Integer getMAX_TEMP_LIMIT() {
        return MAX_TEMP_LIMIT;
    }

    public void setMAX_TEMP_LIMIT(Integer MAX_TEMP_LIMIT) {
        this.MAX_TEMP_LIMIT = MAX_TEMP_LIMIT;
    }

    public Integer getCRED_LIMIT() {
        return CRED_LIMIT;
    }

    public void setCRED_LIMIT(Integer CRED_LIMIT) {
        this.CRED_LIMIT = CRED_LIMIT;
    }

    public Integer getTEMP_LIMIT() {
        return TEMP_LIMIT;
    }

    public void setTEMP_LIMIT(Integer TEMP_LIMIT) {
        this.TEMP_LIMIT = TEMP_LIMIT;
    }

    public Integer getMAX_CASH_LIMIT() {
        return MAX_CASH_LIMIT;
    }

    public void setMAX_CASH_LIMIT(Integer MAX_CASH_LIMIT) {
        this.MAX_CASH_LIMIT = MAX_CASH_LIMIT;
    }

    public Double getSTM_BALNCE() {
        return STM_BALNCE;
    }

    public void setSTM_BALNCE(Double STM_BALNCE) {
        this.STM_BALNCE = STM_BALNCE;
    }

    public Double getODUE_AMT() {
        return ODUE_AMT;
    }

    public void setODUE_AMT(Double ODUE_AMT) {
        this.ODUE_AMT = ODUE_AMT;
    }

    public Double getSTM_BALORI() {
        return STM_BALORI;
    }

    public void setSTM_BALORI(Double STM_BALORI) {
        this.STM_BALORI = STM_BALORI;
    }

    public Double getINCOME() {
        return INCOME;
    }

    public void setINCOME(Double INCOME) {
        this.INCOME = INCOME;
    }

    public Double getCUR_BAL_SUM() {
        return CUR_BAL_SUM;
    }

    public void setCUR_BAL_SUM(Double CUR_BAL_SUM) {
        this.CUR_BAL_SUM = CUR_BAL_SUM;
    }

    public Double getRECVBL_DEBT() {
        return RECVBL_DEBT;
    }

    public void setRECVBL_DEBT(Double RECVBL_DEBT) {
        this.RECVBL_DEBT = RECVBL_DEBT;
    }

    public Double getCUR_LIMIT_SUM() {
        return CUR_LIMIT_SUM;
    }

    public void setCUR_LIMIT_SUM(Double CUR_LIMIT_SUM) {
        this.CUR_LIMIT_SUM = CUR_LIMIT_SUM;
    }

    public Double getMAX_CUR_BAL() {
        return MAX_CUR_BAL;
    }

    public void setMAX_CUR_BAL(Double MAX_CUR_BAL) {
        this.MAX_CUR_BAL = MAX_CUR_BAL;
    }

    public Double getFQ_ZD_INSTL() {
        return FQ_ZD_INSTL;
    }

    public void setFQ_ZD_INSTL(Double FQ_ZD_INSTL) {
        this.FQ_ZD_INSTL = FQ_ZD_INSTL;
    }

    public Double getPAYMT_CLRD() {
        return PAYMT_CLRD;
    }

    public void setPAYMT_CLRD(Double PAYMT_CLRD) {
        this.PAYMT_CLRD = PAYMT_CLRD;
    }

    public Double getCONSM_AMT_TOP_1() {
        return CONSM_AMT_TOP_1;
    }

    public void setCONSM_AMT_TOP_1(Double CONSM_AMT_TOP_1) {
        this.CONSM_AMT_TOP_1 = CONSM_AMT_TOP_1;
    }

    public Double getCONSM_AMT_TOP_2() {
        return CONSM_AMT_TOP_2;
    }

    public void setCONSM_AMT_TOP_2(Double CONSM_AMT_TOP_2) {
        this.CONSM_AMT_TOP_2 = CONSM_AMT_TOP_2;
    }

    public Double getCONSM_AMT_TOP_3() {
        return CONSM_AMT_TOP_3;
    }

    public void setCONSM_AMT_TOP_3(Double CONSM_AMT_TOP_3) {
        this.CONSM_AMT_TOP_3 = CONSM_AMT_TOP_3;
    }

    public Double getCONSM_AMT_TOP_4() {
        return CONSM_AMT_TOP_4;
    }

    public void setCONSM_AMT_TOP_4(Double CONSM_AMT_TOP_4) {
        this.CONSM_AMT_TOP_4 = CONSM_AMT_TOP_4;
    }

    public Double getCONSM_AMT_TOP_5() {
        return CONSM_AMT_TOP_5;
    }

    public void setCONSM_AMT_TOP_5(Double CONSM_AMT_TOP_5) {
        this.CONSM_AMT_TOP_5 = CONSM_AMT_TOP_5;
    }

    public Integer getIS_ADJ_LIMIT_INCYC() {
        return IS_ADJ_LIMIT_INCYC;
    }

    public void setIS_ADJ_LIMIT_INCYC(Integer IS_ADJ_LIMIT_INCYC) {
        this.IS_ADJ_LIMIT_INCYC = IS_ADJ_LIMIT_INCYC;
    }

    public Integer getIS_ADJ_TMP_LIMIT_INCYC() {
        return IS_ADJ_TMP_LIMIT_INCYC;
    }

    public void setIS_ADJ_TMP_LIMIT_INCYC(Integer IS_ADJ_TMP_LIMIT_INCYC) {
        this.IS_ADJ_TMP_LIMIT_INCYC = IS_ADJ_TMP_LIMIT_INCYC;
    }

    public Integer getIS_XFFQ_INCYC() {
        return IS_XFFQ_INCYC;
    }

    public void setIS_XFFQ_INCYC(Integer IS_XFFQ_INCYC) {
        this.IS_XFFQ_INCYC = IS_XFFQ_INCYC;
    }

    public Integer getIS_ZDFQ_INCYC() {
        return IS_ZDFQ_INCYC;
    }

    public void setIS_ZDFQ_INCYC(Integer IS_ZDFQ_INCYC) {
        this.IS_ZDFQ_INCYC = IS_ZDFQ_INCYC;
    }

    public Double getINP_CASH_AMT() {
        return INP_CASH_AMT;
    }

    public void setINP_CASH_AMT(Double INP_CASH_AMT) {
        this.INP_CASH_AMT = INP_CASH_AMT;
    }

    public Double getINT_AMT() {
        return INT_AMT;
    }

    public void setINT_AMT(Double INT_AMT) {
        this.INT_AMT = INT_AMT;
    }

    public Integer getDAYS_LIMIT_USED() {
        return DAYS_LIMIT_USED;
    }

    public void setDAYS_LIMIT_USED(Integer DAYS_LIMIT_USED) {
        this.DAYS_LIMIT_USED = DAYS_LIMIT_USED;
    }

    public Date getMYETL_DATE() {
        return MYETL_DATE;
    }

    public void setMYETL_DATE(Date MYETL_DATE) {
        this.MYETL_DATE = MYETL_DATE;
    }
}
