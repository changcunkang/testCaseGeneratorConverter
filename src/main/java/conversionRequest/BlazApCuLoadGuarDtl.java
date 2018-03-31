package conversionRequest;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="BLAZ_AP_CU_LOAD_GUAR_DTL")
public class BlazApCuLoadGuarDtl {
    private String P_ID;
    private String F_ID;
    private String SN;
    private String ORGANIZATION;
    private Double CONTRACT_AMOUNT;
    private Date ISSUE_DATE;
    private Date END_DATE;
    private Double BONDS_AMOUNT;
    private Double BASIC_AMOUNT;
    private String FIVE_STYLE;
    private Date NEED_REPAY_DATE;

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

    public Date getEND_DATE() {
        return END_DATE;
    }

    public void setEND_DATE(Date END_DATE) {
        this.END_DATE = END_DATE;
    }

    public Double getBONDS_AMOUNT() {
        return BONDS_AMOUNT;
    }

    public void setBONDS_AMOUNT(Double BONDS_AMOUNT) {
        this.BONDS_AMOUNT = BONDS_AMOUNT;
    }

    public Double getBASIC_AMOUNT() {
        return BASIC_AMOUNT;
    }

    public void setBASIC_AMOUNT(Double BASIC_AMOUNT) {
        this.BASIC_AMOUNT = BASIC_AMOUNT;
    }

    public String getFIVE_STYLE() {
        return FIVE_STYLE;
    }

    public void setFIVE_STYLE(String FIVE_STYLE) {
        this.FIVE_STYLE = FIVE_STYLE;
    }

    public Date getNEED_REPAY_DATE() {
        return NEED_REPAY_DATE;
    }

    public void setNEED_REPAY_DATE(Date NEED_REPAY_DATE) {
        this.NEED_REPAY_DATE = NEED_REPAY_DATE;
    }
}
