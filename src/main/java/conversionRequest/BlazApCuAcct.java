package conversionRequest;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="BLAZ_AP_CU_ACCT")
public class BlazApCuAcct {

    private String XACCOUNT;
    private Integer CATEGORY;
    private String CUSTR_NBR;
    private String BlAZ_PROD_CD;
    private Integer MONTH_NBR;
    private Integer CYCLE_NBR;
    private String CLOSE_CODE;
    private Double QUERY_AMT;
    private String STMT_ODUE_120;
    private String E_STMT_ODUE_120;
    private Integer TLMT_END;
    private Integer FIRST_CASH;
    private Integer FIRST_POS;
    private Integer DAY_OPENED;
    private Integer APMA_CRED_LIMIT;
    private Integer FIRST_ACTIVE_DAY;
    private Integer ACCT_MOB_MTH;
    private Integer IS_FRT_ODUE_XFFQ;
    private Integer IS_FRT_ODUE_DXFQ;
    private Integer CRED_LIMIT;
    private Integer TEMP_LIMIT;
    private Integer CASH_ADVCE;
    private Double CUR_BAL;
    private Double ODUE_AMT;
    private Integer MTHS_ODUE;
    private Double FQ_ZD_INSTL;
    private Double PAYMT_CLRD;
    private Date MYETL_DATE;


    private List<CardMdCycAcctFq> cardMdCycAcctFq=new ArrayList<CardMdCycAcctFq>();
    private List<CardMdCycAcctHdevn> cardMdCycAcctHdevn=new ArrayList<CardMdCycAcctHdevn>();
    private List<CardMdCycAcctJy> cardMdCycAcctJy=new ArrayList<CardMdCycAcctJy>();
    private List<CardMdCycAcctXf> cardMdCycAcctXf=new ArrayList<CardMdCycAcctXf>();
    private List<CardMdCycLongcols> cardMdCycLongcols=new ArrayList<CardMdCycLongcols>();
    private List<CardMdHsAcctFq> cardMdHsAcctFq=new ArrayList<CardMdHsAcctFq>();
    private List<BlazApHsAcctChgs> blazApHsAcctChgs=new ArrayList<BlazApHsAcctChgs>();
    private List<BlazApCycAcctState> blazApCycAcctState=new ArrayList<BlazApCycAcctState>();

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

    public Double getQUERY_AMT() {
        return QUERY_AMT;
    }

    public void setQUERY_AMT(Double QUERY_AMT) {
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

    public Integer getDAY_OPENED() {
        return DAY_OPENED;
    }

    public void setDAY_OPENED(Integer DAY_OPENED) {
        this.DAY_OPENED = DAY_OPENED;
    }

    public Integer getAPMA_CRED_LIMIT() {
        return APMA_CRED_LIMIT;
    }

    public void setAPMA_CRED_LIMIT(Integer APMA_CRED_LIMIT) {
        this.APMA_CRED_LIMIT = APMA_CRED_LIMIT;
    }

    public Integer getFIRST_ACTIVE_DAY() {
        return FIRST_ACTIVE_DAY;
    }

    public void setFIRST_ACTIVE_DAY(Integer FIRST_ACTIVE_DAY) {
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

    public Double getCUR_BAL() {
        return CUR_BAL;
    }

    public void setCUR_BAL(Double CUR_BAL) {
        this.CUR_BAL = CUR_BAL;
    }

    public Double getODUE_AMT() {
        return ODUE_AMT;
    }

    public void setODUE_AMT(Double ODUE_AMT) {
        this.ODUE_AMT = ODUE_AMT;
    }

    public Integer getMTHS_ODUE() {
        return MTHS_ODUE;
    }

    public void setMTHS_ODUE(Integer MTHS_ODUE) {
        this.MTHS_ODUE = MTHS_ODUE;
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

    public Date getMYETL_DATE() {
        return MYETL_DATE;
    }

    public void setMYETL_DATE(Date MYETL_DATE) {
        this.MYETL_DATE = MYETL_DATE;
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

    public List<CardMdCycAcctJy> getCardMdCycAcctJy() {
        return cardMdCycAcctJy;
    }

    public void setCardMdCycAcctJy(List<CardMdCycAcctJy> cardMdCycAcctJy) {
        this.cardMdCycAcctJy = cardMdCycAcctJy;
    }

    public List<CardMdCycAcctXf> getCardMdCycAcctXf() {
        return cardMdCycAcctXf;
    }

    public void setCardMdCycAcctXf(List<CardMdCycAcctXf> cardMdCycAcctXf) {
        this.cardMdCycAcctXf = cardMdCycAcctXf;
    }

    public List<CardMdCycLongcols> getCardMdCycLongcols() {
        return cardMdCycLongcols;
    }

    public void setCardMdCycLongcols(List<CardMdCycLongcols> cardMdCycLongcols) {
        this.cardMdCycLongcols = cardMdCycLongcols;
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

    public List<BlazApCycAcctState> getBlazApCycAcctState() {
        return blazApCycAcctState;
    }

    public void setBlazApCycAcctState(List<BlazApCycAcctState> blazApCycAcctState) {
        this.blazApCycAcctState = blazApCycAcctState;
    }
}
