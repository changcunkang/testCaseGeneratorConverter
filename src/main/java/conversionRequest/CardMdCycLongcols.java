package conversionRequest;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="CARD_MD_CYC_LONGCOLS")
public class CardMdCycLongcols {
    private String XACCOUNT;
    private String CARD_NBR;
    private String PROD_CD;
    private String PROD_TYPE;
    private String CUSTR_NBR;
    private Integer MONTH_NBR;
    private Integer CYCLE_NBR;
    private Integer FQ_TYPE;
    private String ID;
    private Date MYETL_DATE;

    public String getXACCOUNT() {
        return XACCOUNT;
    }

    public void setXACCOUNT(String XACCOUNT) {
        this.XACCOUNT = XACCOUNT;
    }

    public String getCARD_NBR() {
        return CARD_NBR;
    }

    public void setCARD_NBR(String CARD_NBR) {
        this.CARD_NBR = CARD_NBR;
    }

    public String getPROD_CD() {
        return PROD_CD;
    }

    public void setPROD_CD(String PROD_CD) {
        this.PROD_CD = PROD_CD;
    }

    public String getPROD_TYPE() {
        return PROD_TYPE;
    }

    public void setPROD_TYPE(String PROD_TYPE) {
        this.PROD_TYPE = PROD_TYPE;
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

    public Integer getFQ_TYPE() {
        return FQ_TYPE;
    }

    public void setFQ_TYPE(Integer FQ_TYPE) {
        this.FQ_TYPE = FQ_TYPE;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Date getMYETL_DATE() {
        return MYETL_DATE;
    }

    public void setMYETL_DATE(Date MYETL_DATE) {
        this.MYETL_DATE = MYETL_DATE;
    }
}
