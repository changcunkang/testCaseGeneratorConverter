package conversionRequest;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="BLAZ_AP_CU_ACCT")
public class BlazApCuAcct {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    @Column
    private Long id;
    @Column(name="XACCOUNT")
    private String XACCOUNT;
    @Column(name="CATEGORY")
    private Integer CATEGORY;
    @Column(name="CUSTR_NBR")
    private String CUSTR_NBR;
    @Column(name="BlAZ_PROD_CD")
    private String BlAZ_PROD_CD;
    @Column(name="MONTH_NBR")
    private Integer MONTH_NBR;
    @Column(name="CYCLE_NBR")
    private Integer CYCLE_NBR;
    @Column(name="CLOSE_CODE")
    private String CLOSE_CODE;
    @Column(name="QUERY_AMT")
    private Integer QUERY_AMT;
    @Column(name="STMT_ODUE_120")
    private String STMT_ODUE_120;
    @Column(name="E_STMT_ODUE_120")
    private String E_STMT_ODUE_120;
    @Column(name="TLMT_END")
    private Integer TLMT_END;
    @Column(name="FIRST_CASH")
    private Date FIRST_CASH;
    @Column(name="FIRST_POS")
    private Date FIRST_POS;
    @Column(name="DAY_OPENED")
    private Date DAY_OPENED;
    @Column(name="APMA_CRED_LIMIT")
    private Integer APMA_CRED_LIMIT;
    @Column(name="FIRST_ACTIVE_DAY")
    private Date FIRST_ACTIVE_DAY;
    @Column(name="ACCT_MOB_MTH")
    private Integer ACCT_MOB_MTH;
    @Column(name="IS_FRT_ODUE_XFFQ")
    private Integer IS_FRT_ODUE_XFFQ;
    @Column(name="IS_FRT_ODUE_DXFQ")
    private Integer IS_FRT_ODUE_DXFQ;
    @Column(name="CRED_LIMIT")
    private Integer CRED_LIMIT;
    @Column(name="TEMP_LIMIT")
    private Integer TEMP_LIMIT;
    @Column(name="CASH_ADVCE")
    private Integer CASH_ADVCE;
    @Column(name="CUR_BAL")
    private Integer CUR_BAL;
    @Column(name="ODUE_AMT")
    private Integer ODUE_AMT;
    @Column(name="MTHS_ODUE")
    private Integer MTHS_ODUE;
    @Column(name="FQ_ZD_INSTL")
    private Integer FQ_ZD_INSTL;
    @Column(name="PAYMT_CLRD")
    private Integer PAYMT_CLRD;
    @Column(name="MYETL_DATE")
    private Date MYETL_DATE;
    @Column
    private  Long parent_id;

    @OneToOne(cascade = CascadeType.ALL)
    private List<CardMdHsAcctFq> cardMdHsAcctFq=new ArrayList<CardMdHsAcctFq>();
    @OneToMany(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
    @JoinColumn(name="parent_id")
    private List<BlazApHsAcctChgs> blazApHsAcctChgs=new ArrayList<BlazApHsAcctChgs>();
    @OneToMany(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
    @JoinColumn(name="parent_id")
    private List<CardMdCuCard> cardMdCuCard=new ArrayList<CardMdCuCard>();
    @OneToMany(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
    @JoinColumn(name="parent_id")
    private List<BlazApCycAcctState> blazApCycAcctState=new ArrayList<BlazApCycAcctState>();

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

    public Integer getCATEGORY() {
        return CATEGORY;
    }

    public void setCATEGORY(Integer CATEGORY) {
        this.CATEGORY = CATEGORY;
    }

    public String getCUSTR_NBR() {
        return CUSTR_NBR;
    }

    public void setCUSTR_NBR(String CUSTR_NBR) {
        this.CUSTR_NBR = CUSTR_NBR;
    }

    public String getBlAZ_PROD_CD() {
        return BlAZ_PROD_CD;
    }

    public void setBlAZ_PROD_CD(String blAZ_PROD_CD) {
        BlAZ_PROD_CD = blAZ_PROD_CD;
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

    public String getCLOSE_CODE() {
        return CLOSE_CODE;
    }

    public void setCLOSE_CODE(String CLOSE_CODE) {
        this.CLOSE_CODE = CLOSE_CODE;
    }

    public Integer getQUERY_AMT() {
        return QUERY_AMT;
    }

    public void setQUERY_AMT(Integer QUERY_AMT) {
        this.QUERY_AMT = QUERY_AMT;
    }

    public String getSTMT_ODUE_120() {
        return STMT_ODUE_120;
    }

    public void setSTMT_ODUE_120(String STMT_ODUE_120) {
        this.STMT_ODUE_120 = STMT_ODUE_120;
    }

    public String getE_STMT_ODUE_120() {
        return E_STMT_ODUE_120;
    }

    public void setE_STMT_ODUE_120(String e_STMT_ODUE_120) {
        E_STMT_ODUE_120 = e_STMT_ODUE_120;
    }

    public Integer getTLMT_END() {
        return TLMT_END;
    }

    public void setTLMT_END(Integer TLMT_END) {
        this.TLMT_END = TLMT_END;
    }

    public Date getFIRST_CASH() {
        return FIRST_CASH;
    }

    public void setFIRST_CASH(Date FIRST_CASH) {
        this.FIRST_CASH = FIRST_CASH;
    }

    public Date getFIRST_POS() {
        return FIRST_POS;
    }

    public void setFIRST_POS(Date FIRST_POS) {
        this.FIRST_POS = FIRST_POS;
    }

    public Date getDAY_OPENED() {
        return DAY_OPENED;
    }

    public void setDAY_OPENED(Date DAY_OPENED) {
        this.DAY_OPENED = DAY_OPENED;
    }

    public Integer getAPMA_CRED_LIMIT() {
        return APMA_CRED_LIMIT;
    }

    public void setAPMA_CRED_LIMIT(Integer APMA_CRED_LIMIT) {
        this.APMA_CRED_LIMIT = APMA_CRED_LIMIT;
    }

    public Date getFIRST_ACTIVE_DAY() {
        return FIRST_ACTIVE_DAY;
    }

    public void setFIRST_ACTIVE_DAY(Date FIRST_ACTIVE_DAY) {
        this.FIRST_ACTIVE_DAY = FIRST_ACTIVE_DAY;
    }

    public Integer getACCT_MOB_MTH() {
        return ACCT_MOB_MTH;
    }

    public void setACCT_MOB_MTH(Integer ACCT_MOB_MTH) {
        this.ACCT_MOB_MTH = ACCT_MOB_MTH;
    }

    public Integer getIS_FRT_ODUE_XFFQ() {
        return IS_FRT_ODUE_XFFQ;
    }

    public void setIS_FRT_ODUE_XFFQ(Integer IS_FRT_ODUE_XFFQ) {
        this.IS_FRT_ODUE_XFFQ = IS_FRT_ODUE_XFFQ;
    }

    public Integer getIS_FRT_ODUE_DXFQ() {
        return IS_FRT_ODUE_DXFQ;
    }

    public void setIS_FRT_ODUE_DXFQ(Integer IS_FRT_ODUE_DXFQ) {
        this.IS_FRT_ODUE_DXFQ = IS_FRT_ODUE_DXFQ;
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

    public Integer getCASH_ADVCE() {
        return CASH_ADVCE;
    }

    public void setCASH_ADVCE(Integer CASH_ADVCE) {
        this.CASH_ADVCE = CASH_ADVCE;
    }

    public Integer getCUR_BAL() {
        return CUR_BAL;
    }

    public void setCUR_BAL(Integer CUR_BAL) {
        this.CUR_BAL = CUR_BAL;
    }

    public Integer getODUE_AMT() {
        return ODUE_AMT;
    }

    public void setODUE_AMT(Integer ODUE_AMT) {
        this.ODUE_AMT = ODUE_AMT;
    }

    public Integer getMTHS_ODUE() {
        return MTHS_ODUE;
    }

    public void setMTHS_ODUE(Integer MTHS_ODUE) {
        this.MTHS_ODUE = MTHS_ODUE;
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

    public Date getMYETL_DATE() {
        return MYETL_DATE;
    }

    public void setMYETL_DATE(Date MYETL_DATE) {
        this.MYETL_DATE = MYETL_DATE;
    }

    public List<CardMdHsAcctFq> getCardMdHsAcctFq() {
        return cardMdHsAcctFq;
    }

    public void setCardMdHsAcctFq(List<CardMdHsAcctFq> cardMdHsAcctFq) {
        this.cardMdHsAcctFq = cardMdHsAcctFq;
    }

    public List<BlazApHsAcctChgs> getBlazApHsAcctChgs() {
        return blazApHsAcctChgs;
    }

    public void setBlazApHsAcctChgs(List<BlazApHsAcctChgs> blazApHsAcctChgs) {
        this.blazApHsAcctChgs = blazApHsAcctChgs;
    }

    public List<CardMdCuCard> getCardMdCuCard() {
        return cardMdCuCard;
    }

    public void setCardMdCuCard(List<CardMdCuCard> cardMdCuCard) {
        this.cardMdCuCard = cardMdCuCard;
    }

    public List<BlazApCycAcctState> getBlazApCycAcctState() {
        return blazApCycAcctState;
    }

    public void setBlazApCycAcctState(List<BlazApCycAcctState> blazApCycAcctState) {
        this.blazApCycAcctState = blazApCycAcctState;
    }
}
