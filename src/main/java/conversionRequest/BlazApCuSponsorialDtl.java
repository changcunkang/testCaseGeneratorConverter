package conversionRequest;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="BLAZ_AP_CU_SPONSORIAL_DTL")
public class BlazApCuSponsorialDtl {

    private String P_ID;
    private String F_ID;
    private String SN;
    private String SPONSORIAL_ORGANIZATION;
    private Date REPLACE_REPAY_DATE;
    private Integer REPLACE_REPAY_SUM;
    private Date LAST_REPAY_DATE;
    private Integer REMAIN;

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

    public String getSPONSORIAL_ORGANIZATION() {
        return SPONSORIAL_ORGANIZATION;
    }

    public void setSPONSORIAL_ORGANIZATION(String SPONSORIAL_ORGANIZATION) {
        this.SPONSORIAL_ORGANIZATION = SPONSORIAL_ORGANIZATION;
    }

    public Date getREPLACE_REPAY_DATE() {
        return REPLACE_REPAY_DATE;
    }

    public void setREPLACE_REPAY_DATE(Date REPLACE_REPAY_DATE) {
        this.REPLACE_REPAY_DATE = REPLACE_REPAY_DATE;
    }

    public Integer getREPLACE_REPAY_SUM() {
        return REPLACE_REPAY_SUM;
    }

    public void setREPLACE_REPAY_SUM(Integer REPLACE_REPAY_SUM) {
        this.REPLACE_REPAY_SUM = REPLACE_REPAY_SUM;
    }

    public Date getLAST_REPAY_DATE() {
        return LAST_REPAY_DATE;
    }

    public void setLAST_REPAY_DATE(Date LAST_REPAY_DATE) {
        this.LAST_REPAY_DATE = LAST_REPAY_DATE;
    }

    public Integer getREMAIN() {
        return REMAIN;
    }

    public void setREMAIN(Integer REMAIN) {
        this.REMAIN = REMAIN;
    }
}
