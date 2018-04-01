package conversionRequest;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="BLAZ_AP_CYC_ACCT_STAT")
public class BlazApCycAcctState {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    @Column
    private Long id;
    @Column
    private Long parent_id;
    @Column(name="XACCOUNT")
    private String XACCOUNT;
    @Column(name="CATEGORY")
    private Integer CATEGORY;
    @Column(name="BlAZ_PROD_CD")
    private String BlAZ_PROD_CD;
    @Column(name="CUSTR_NBR")
    private String CUSTR_NBR;
    @Column(name="MONTH_NBR")
    private Integer MONTH_NBR;
    @Column(name="CYCLE_NBR")
    private Integer CYCLE_NBR;
    @Column(name="MTHS_ODUE")
    private Integer MTHS_ODUE;
    @Column(name="MAX_LIMIT")
    private Integer MAX_LIMIT;
    @Column(name="MAX_TEMP_LIMIT")
    private Integer MAX_TEMP_LIMIT;
    @Column(name="CRED_LIMIT")
    private Integer CRED_LIMIT;
    @Column(name="TEMP_LIMIT")
    private Integer TEMP_LIMIT;
    @Column(name="MAX_CASH_LIMIT")
    private Integer MAX_CASH_LIMIT;
    @Column(name="STM_BALNCE")
    private Integer STM_BALNCE;
    @Column(name="ODUE_AMT")
    private Integer ODUE_AMT;
    @Column(name="STM_BALORI")
    private Integer STM_BALORI;
    @Column(name="INCOME")
    private Integer INCOME;
    @Column(name="CUR_BAL_SUM")
    private Integer CUR_BAL_SUM;
    @Column(name="RECVBL_DEBT")
    private Integer RECVBL_DEBT;
    @Column(name="CUR_LIMIT_SUM")
    private Integer CUR_LIMIT_SUM;
    @Column(name="MAX_CUR_BAL")
    private Integer MAX_CUR_BAL;
    @Column(name="FQ_ZD_INSTL")
    private Integer FQ_ZD_INSTL;
    @Column(name="PAYMT_CLRD")
    private Integer PAYMT_CLRD;
    @Column(name="CONSM_AMT_TOP_1")
    private Integer CONSM_AMT_TOP_1;
    @Column(name="CONSM_AMT_TOP_2")
    private Integer CONSM_AMT_TOP_2;
    @Column(name="CONSM_AMT_TOP_3")
    private Integer CONSM_AMT_TOP_3;
    @Column(name="CONSM_AMT_TOP_4")
    private Integer CONSM_AMT_TOP_4;
    @Column(name="CONSM_AMT_TOP_5")
    private Integer CONSM_AMT_TOP_5;
    @Column(name="IS_ADJ_LIMIT_INCYC")
    private Integer IS_ADJ_LIMIT_INCYC;
    @Column(name="IS_ADJ_TMP_LIMIT_INCYC")
    private Integer IS_ADJ_TMP_LIMIT_INCYC;
    @Column(name="IS_XFFQ_INCYC")
    private Integer IS_XFFQ_INCYC;
    @Column(name="IS_ZDFQ_INCYC")
    private Integer IS_ZDFQ_INCYC;
    @Column(name="INP_CASH_AMT")
    private Integer INP_CASH_AMT;
    @Column(name="INT_AMT")
    private Integer INT_AMT;
    @Column(name="DAYS_LIMIT_USED")
    private Integer DAYS_LIMIT_USED;
    @Column(name="MYETL_DATE")
    private Date MYETL_DATE;

    @OneToMany(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
    @JoinColumn(name="parent_id")
    private List<CardMdCycLongcols> cardMdCycLongcols=new ArrayList<conversionRequest.CardMdCycLongcols>();
    @OneToMany(cascade =CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "parent_id")
    private List<CardMdCycAcctXf> cardMdCycAcctXf=new ArrayList<CardMdCycAcctXf>();
    @OneToMany(cascade =CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "parent_id")
    private List<CardMdCycAcctJy> cardMdCycAcctJy=new ArrayList<CardMdCycAcctJy>();
    @OneToMany(cascade =CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "parent_id")
    private List<CardMdCycAcctFq> cardMdCycAcctFq=new ArrayList<CardMdCycAcctFq>();
    @OneToMany(cascade =CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "parent_id")
    private List<CardMdCycAcctHdevn> cardMdCycAcctHdevn=new ArrayList<CardMdCycAcctHdevn>();

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

    public Integer getSTM_BALNCE() {
        return STM_BALNCE;
    }

    public void setSTM_BALNCE(Integer STM_BALNCE) {
        this.STM_BALNCE = STM_BALNCE;
    }

    public Integer getODUE_AMT() {
        return ODUE_AMT;
    }

    public void setODUE_AMT(Integer ODUE_AMT) {
        this.ODUE_AMT = ODUE_AMT;
    }

    public Integer getSTM_BALORI() {
        return STM_BALORI;
    }

    public void setSTM_BALORI(Integer STM_BALORI) {
        this.STM_BALORI = STM_BALORI;
    }

    public Integer getINCOME() {
        return INCOME;
    }

    public void setINCOME(Integer INCOME) {
        this.INCOME = INCOME;
    }

    public Integer getCUR_BAL_SUM() {
        return CUR_BAL_SUM;
    }

    public void setCUR_BAL_SUM(Integer CUR_BAL_SUM) {
        this.CUR_BAL_SUM = CUR_BAL_SUM;
    }

    public Integer getRECVBL_DEBT() {
        return RECVBL_DEBT;
    }

    public void setRECVBL_DEBT(Integer RECVBL_DEBT) {
        this.RECVBL_DEBT = RECVBL_DEBT;
    }

    public Integer getCUR_LIMIT_SUM() {
        return CUR_LIMIT_SUM;
    }

    public void setCUR_LIMIT_SUM(Integer CUR_LIMIT_SUM) {
        this.CUR_LIMIT_SUM = CUR_LIMIT_SUM;
    }

    public Integer getMAX_CUR_BAL() {
        return MAX_CUR_BAL;
    }

    public void setMAX_CUR_BAL(Integer MAX_CUR_BAL) {
        this.MAX_CUR_BAL = MAX_CUR_BAL;
    }

    public Integer getFQ_ZD_INSTL() {
        return FQ_ZD_INSTL;
    }

    public void setFQ_ZD_INSTL(Integer FQ_ZD_INSTL) {
        this.FQ_ZD_INSTL = FQ_ZD_INSTL;
    }

    public Integer getPAYMT_CLRD() {
        return PAYMT_CLRD;
    }

    public void setPAYMT_CLRD(Integer PAYMT_CLRD) {
        this.PAYMT_CLRD = PAYMT_CLRD;
    }

    public Integer getCONSM_AMT_TOP_1() {
        return CONSM_AMT_TOP_1;
    }

    public void setCONSM_AMT_TOP_1(Integer CONSM_AMT_TOP_1) {
        this.CONSM_AMT_TOP_1 = CONSM_AMT_TOP_1;
    }

    public Integer getCONSM_AMT_TOP_2() {
        return CONSM_AMT_TOP_2;
    }

    public void setCONSM_AMT_TOP_2(Integer CONSM_AMT_TOP_2) {
        this.CONSM_AMT_TOP_2 = CONSM_AMT_TOP_2;
    }

    public Integer getCONSM_AMT_TOP_3() {
        return CONSM_AMT_TOP_3;
    }

    public void setCONSM_AMT_TOP_3(Integer CONSM_AMT_TOP_3) {
        this.CONSM_AMT_TOP_3 = CONSM_AMT_TOP_3;
    }

    public Integer getCONSM_AMT_TOP_4() {
        return CONSM_AMT_TOP_4;
    }

    public void setCONSM_AMT_TOP_4(Integer CONSM_AMT_TOP_4) {
        this.CONSM_AMT_TOP_4 = CONSM_AMT_TOP_4;
    }

    public Integer getCONSM_AMT_TOP_5() {
        return CONSM_AMT_TOP_5;
    }

    public void setCONSM_AMT_TOP_5(Integer CONSM_AMT_TOP_5) {
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

    public Integer getINP_CASH_AMT() {
        return INP_CASH_AMT;
    }

    public void setINP_CASH_AMT(Integer INP_CASH_AMT) {
        this.INP_CASH_AMT = INP_CASH_AMT;
    }

    public Integer getINT_AMT() {
        return INT_AMT;
    }

    public void setINT_AMT(Integer INT_AMT) {
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

    public List<CardMdCycLongcols> getCardMdCycLongcols() {
        return cardMdCycLongcols;
    }

    public void setCardMdCycLongcols(List<CardMdCycLongcols> cardMdCycLongcols) {
        this.cardMdCycLongcols = cardMdCycLongcols;
    }

    public List<CardMdCycAcctXf> getCardMdCycAcctXf() {
        return cardMdCycAcctXf;
    }

    public void setCardMdCycAcctXf(List<CardMdCycAcctXf> cardMdCycAcctXf) {
        this.cardMdCycAcctXf = cardMdCycAcctXf;
    }

    public List<CardMdCycAcctJy> getCardMdCycAcctJy() {
        return cardMdCycAcctJy;
    }

    public void setCardMdCycAcctJy(List<CardMdCycAcctJy> cardMdCycAcctJy) {
        this.cardMdCycAcctJy = cardMdCycAcctJy;
    }

    public List<CardMdCycAcctFq> getCardMdCycAcctFq() {
        return cardMdCycAcctFq;
    }

    public void setCardMdCycAcctFq(List<CardMdCycAcctFq> cardMdCycAcctFq) {
        this.cardMdCycAcctFq = cardMdCycAcctFq;
    }

    public List<CardMdCycAcctHdevn> getCardMdCycAcctHdevn() {
        return cardMdCycAcctHdevn;
    }

    public void setCardMdCycAcctHdevn(List<CardMdCycAcctHdevn> cardMdCycAcctHdevn) {
        this.cardMdCycAcctHdevn = cardMdCycAcctHdevn;
    }
}
