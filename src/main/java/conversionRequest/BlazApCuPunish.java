package conversionRequest;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="BLAZ_AP_CU_PUNISH")
public class BlazApCuPunish {

    private String P_ID;
    private String F_ID;
    private String SN;
    private String ORGANIZATION;
    private String PUNISH_CONTENT;
    private String PUNISH_AMOUNT;
    private Date EFFECTIVE_DATE;
    private Date END_DATE;
    private String RECONSIDER_RESULT;

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

    public String getPUNISH_CONTENT() {
        return PUNISH_CONTENT;
    }

    public void setPUNISH_CONTENT(String PUNISH_CONTENT) {
        this.PUNISH_CONTENT = PUNISH_CONTENT;
    }

    public String getPUNISH_AMOUNT() {
        return PUNISH_AMOUNT;
    }

    public void setPUNISH_AMOUNT(String PUNISH_AMOUNT) {
        this.PUNISH_AMOUNT = PUNISH_AMOUNT;
    }

    public Date getEFFECTIVE_DATE() {
        return EFFECTIVE_DATE;
    }

    public void setEFFECTIVE_DATE(Date EFFECTIVE_DATE) {
        this.EFFECTIVE_DATE = EFFECTIVE_DATE;
    }

    public Date getEND_DATE() {
        return END_DATE;
    }

    public void setEND_DATE(Date END_DATE) {
        this.END_DATE = END_DATE;
    }

    public String getRECONSIDER_RESULT() {
        return RECONSIDER_RESULT;
    }

    public void setRECONSIDER_RESULT(String RECONSIDER_RESULT) {
        this.RECONSIDER_RESULT = RECONSIDER_RESULT;
    }
}
