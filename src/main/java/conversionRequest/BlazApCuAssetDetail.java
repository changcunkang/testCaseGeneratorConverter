package conversionRequest;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="BLAZ_AP_CU_ASSET_DETAIL")
public class BlazApCuAssetDetail {

    private String P_ID;
    private String F_ID;
    private String SN;
    private String ASSET_MANAGE_COMPANY;
    private Date RECIPIENT_DATE;
    private Integer RECIPIENT_AMOUNT;
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

    public String getASSET_MANAGE_COMPANY() {
        return ASSET_MANAGE_COMPANY;
    }

    public void setASSET_MANAGE_COMPANY(String ASSET_MANAGE_COMPANY) {
        this.ASSET_MANAGE_COMPANY = ASSET_MANAGE_COMPANY;
    }

    public Date getRECIPIENT_DATE() {
        return RECIPIENT_DATE;
    }

    public void setRECIPIENT_DATE(Date RECIPIENT_DATE) {
        this.RECIPIENT_DATE = RECIPIENT_DATE;
    }

    public Integer getRECIPIENT_AMOUNT() {
        return RECIPIENT_AMOUNT;
    }

    public void setRECIPIENT_AMOUNT(Integer RECIPIENT_AMOUNT) {
        this.RECIPIENT_AMOUNT = RECIPIENT_AMOUNT;
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
