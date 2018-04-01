package conversionRequest;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="BLAZ_AP_CU_ASSET_DETAIL")
public class BlazApCuAssetDetail {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    @Column
    private Long id;
    @Column(name = "P_ID")
    private String P_ID;
    @Column(name = "F_ID")
    private String F_ID;
    @Column(name = "SN")
    private String SN;
    @Column(name = "ASSET_MANAGE_COMPANY")
    private String ASSET_MANAGE_COMPANY;
    @Column(name = "RECIPIENT_DATE")
    private Date RECIPIENT_DATE;
    @Column(name = "RECIPIENT_AMOUNT")
    private Integer RECIPIENT_AMOUNT;
    @Column(name = "LAST_REPAY_DATE")
    private Date LAST_REPAY_DATE;
    @Column(name = "REMAIN")
    private Integer REMAIN;
    @Column
    private Long parent_id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParent_id() {
        return parent_id;
    }

    public void setParent_id(Long parent_id) {
        this.parent_id = parent_id;
    }

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
