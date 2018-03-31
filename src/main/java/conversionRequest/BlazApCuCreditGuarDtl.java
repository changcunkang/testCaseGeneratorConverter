package conversionRequest;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="BLAZ_AP_CU_CREDIT_GUAR_DTL")
public class BlazApCuCreditGuarDtl {
    private String P_ID;
    private String F_ID;
    private String SN;
    private String ORGANIZATION;
    private Double CONTRACT_AMOUNT;
    private Date ISSUE_DATE;
    private Double BONDS_AMOUNT;
    private Double USED_AMOUNT;
    private Date BILL_DATE;

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

    public String getORGANIZATION() {
        return ORGANIZATION;
    }

    public void setORGANIZATION(String ORGANIZATION) {
        this.ORGANIZATION = ORGANIZATION;
    }

    public Double getCONTRACT_AMOUNT() {
        return CONTRACT_AMOUNT;
    }

    public void setCONTRACT_AMOUNT(Double CONTRACT_AMOUNT) {
        this.CONTRACT_AMOUNT = CONTRACT_AMOUNT;
    }

    public Date getISSUE_DATE() {
        return ISSUE_DATE;
    }

    public void setISSUE_DATE(Date ISSUE_DATE) {
        this.ISSUE_DATE = ISSUE_DATE;
    }

    public Double getBONDS_AMOUNT() {
        return BONDS_AMOUNT;
    }

    public void setBONDS_AMOUNT(Double BONDS_AMOUNT) {
        this.BONDS_AMOUNT = BONDS_AMOUNT;
    }

    public Double getUSED_AMOUNT() {
        return USED_AMOUNT;
    }

    public void setUSED_AMOUNT(Double USED_AMOUNT) {
        this.USED_AMOUNT = USED_AMOUNT;
    }

    public Date getBILL_DATE() {
        return BILL_DATE;
    }

    public void setBILL_DATE(Date BILL_DATE) {
        this.BILL_DATE = BILL_DATE;
    }
}
