package conversionRequest;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="BLAZ_AP_CU_HOUSEPROVIDENT")
public class BlazeApCuHouseprovident {
    private String P_ID;
    private String F_ID;
    private String SN;
    private String LOCATION;
    private Date PAY_DATE;
    private String FIRST_PAY_MONTH;
    private String END_PAY_DATE;
    private String PAY_STATUS;
    private Integer PAY_PER_MONTH;
    private Integer SINGLE_RATE;
    private Integer COMPANY_RATE;
    private String COMPANY;
    private Date NEWS_UPDATE_DATE;

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

    public String getSN() {
        return SN;
    }

    public void setSN(String SN) {
        this.SN = SN;
    }

    public String getLOCATION() {
        return LOCATION;
    }

    public void setLOCATION(String LOCATION) {
        this.LOCATION = LOCATION;
    }

    public Date getPAY_DATE() {
        return PAY_DATE;
    }

    public void setPAY_DATE(Date PAY_DATE) {
        this.PAY_DATE = PAY_DATE;
    }

    public String getFIRST_PAY_MONTH() {
        return FIRST_PAY_MONTH;
    }

    public void setFIRST_PAY_MONTH(String FIRST_PAY_MONTH) {
        this.FIRST_PAY_MONTH = FIRST_PAY_MONTH;
    }

    public String getEND_PAY_DATE() {
        return END_PAY_DATE;
    }

    public void setEND_PAY_DATE(String END_PAY_DATE) {
        this.END_PAY_DATE = END_PAY_DATE;
    }

    public String getPAY_STATUS() {
        return PAY_STATUS;
    }

    public void setPAY_STATUS(String PAY_STATUS) {
        this.PAY_STATUS = PAY_STATUS;
    }

    public Integer getPAY_PER_MONTH() {
        return PAY_PER_MONTH;
    }

    public void setPAY_PER_MONTH(Integer PAY_PER_MONTH) {
        this.PAY_PER_MONTH = PAY_PER_MONTH;
    }

    public Integer getSINGLE_RATE() {
        return SINGLE_RATE;
    }

    public void setSINGLE_RATE(Integer SINGLE_RATE) {
        this.SINGLE_RATE = SINGLE_RATE;
    }

    public Integer getCOMPANY_RATE() {
        return COMPANY_RATE;
    }

    public void setCOMPANY_RATE(Integer COMPANY_RATE) {
        this.COMPANY_RATE = COMPANY_RATE;
    }

    public String getCOMPANY() {
        return COMPANY;
    }

    public void setCOMPANY(String COMPANY) {
        this.COMPANY = COMPANY;
    }

    public Date getNEWS_UPDATE_DATE() {
        return NEWS_UPDATE_DATE;
    }

    public void setNEWS_UPDATE_DATE(Date NEWS_UPDATE_DATE) {
        this.NEWS_UPDATE_DATE = NEWS_UPDATE_DATE;
    }
}
