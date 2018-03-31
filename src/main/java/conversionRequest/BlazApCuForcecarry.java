package conversionRequest;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="BLAZ_AP_CU_FORCECARRY")
public class BlazApCuForcecarry {

    private String P_ID;
    private String F_ID;
    private String SN;
    private String COURT;
    private String REASON;
    private Date REGESTER_DATE;
    private String END_WAY;
    private String CASE_STATUS;
    private Date END_DATE;
    private String CASE_OBJECT;
    private Double CASE_OBJECT_AMOUNT;
    private String HAD_OBJECT;
    private Double HAD_OBJECT_AMOUNT;

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

    public String getCOURT() {
        return COURT;
    }

    public void setCOURT(String COURT) {
        this.COURT = COURT;
    }

    public String getREASON() {
        return REASON;
    }

    public void setREASON(String REASON) {
        this.REASON = REASON;
    }

    public Date getREGESTER_DATE() {
        return REGESTER_DATE;
    }

    public void setREGESTER_DATE(Date REGESTER_DATE) {
        this.REGESTER_DATE = REGESTER_DATE;
    }

    public String getEND_WAY() {
        return END_WAY;
    }

    public void setEND_WAY(String END_WAY) {
        this.END_WAY = END_WAY;
    }

    public String getCASE_STATUS() {
        return CASE_STATUS;
    }

    public void setCASE_STATUS(String CASE_STATUS) {
        this.CASE_STATUS = CASE_STATUS;
    }

    public Date getEND_DATE() {
        return END_DATE;
    }

    public void setEND_DATE(Date END_DATE) {
        this.END_DATE = END_DATE;
    }

    public String getCASE_OBJECT() {
        return CASE_OBJECT;
    }

    public void setCASE_OBJECT(String CASE_OBJECT) {
        this.CASE_OBJECT = CASE_OBJECT;
    }

    public Double getCASE_OBJECT_AMOUNT() {
        return CASE_OBJECT_AMOUNT;
    }

    public void setCASE_OBJECT_AMOUNT(Double CASE_OBJECT_AMOUNT) {
        this.CASE_OBJECT_AMOUNT = CASE_OBJECT_AMOUNT;
    }

    public String getHAD_OBJECT() {
        return HAD_OBJECT;
    }

    public void setHAD_OBJECT(String HAD_OBJECT) {
        this.HAD_OBJECT = HAD_OBJECT;
    }

    public Double getHAD_OBJECT_AMOUNT() {
        return HAD_OBJECT_AMOUNT;
    }

    public void setHAD_OBJECT_AMOUNT(Double HAD_OBJECT_AMOUNT) {
        this.HAD_OBJECT_AMOUNT = HAD_OBJECT_AMOUNT;
    }
}
