package conversionRequest;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="CARD_MD_CYC_ACCT_HDEVN")
public class CardMdCycAcctHdevn {
    private String XACCOUNT;
    private Integer MONTH_NBR;
    private Integer CUR_CYCLE_DT;
    private String CUSTR_NBR;
    private String TRANS_TYPE_CODE;
    private String TRANS_TYPE;
    private Integer TRANS_CNT;
    private Integer TRANS_AMT;
    private Date MYETL_DATE;

    public String getXACCOUNT() {
        return XACCOUNT;
    }

    public void setXACCOUNT(String XACCOUNT) {
        this.XACCOUNT = XACCOUNT;
    }

    public Integer getMONTH_NBR() {
        return MONTH_NBR;
    }

    public void setMONTH_NBR(Integer MONTH_NBR) {
        this.MONTH_NBR = MONTH_NBR;
    }

    public Integer getCUR_CYCLE_DT() {
        return CUR_CYCLE_DT;
    }

    public void setCUR_CYCLE_DT(Integer CUR_CYCLE_DT) {
        this.CUR_CYCLE_DT = CUR_CYCLE_DT;
    }

    public String getCUSTR_NBR() {
        return CUSTR_NBR;
    }

    public void setCUSTR_NBR(String CUSTR_NBR) {
        this.CUSTR_NBR = CUSTR_NBR;
    }

    public String getTRANS_TYPE_CODE() {
        return TRANS_TYPE_CODE;
    }

    public void setTRANS_TYPE_CODE(String TRANS_TYPE_CODE) {
        this.TRANS_TYPE_CODE = TRANS_TYPE_CODE;
    }

    public String getTRANS_TYPE() {
        return TRANS_TYPE;
    }

    public void setTRANS_TYPE(String TRANS_TYPE) {
        this.TRANS_TYPE = TRANS_TYPE;
    }

    public Integer getTRANS_CNT() {
        return TRANS_CNT;
    }

    public void setTRANS_CNT(Integer TRANS_CNT) {
        this.TRANS_CNT = TRANS_CNT;
    }

    public Integer getTRANS_AMT() {
        return TRANS_AMT;
    }

    public void setTRANS_AMT(Integer TRANS_AMT) {
        this.TRANS_AMT = TRANS_AMT;
    }

    public Date getMYETL_DATE() {
        return MYETL_DATE;
    }

    public void setMYETL_DATE(Date MYETL_DATE) {
        this.MYETL_DATE = MYETL_DATE;
    }
}
