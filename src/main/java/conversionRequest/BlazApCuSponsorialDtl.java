package conversionRequest;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="BLAZ_AP_CU_SPONSORIAL_DTL")
public class BlazApCuSponsorialDtl {
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
    @Column(name = "SPONSORIAL_ORGANIZATION")
    private String SPONSORIAL_ORGANIZATION;
    @Column(name = "REPLACE_REPAY_DATE")
    private Date REPLACE_REPAY_DATE;
    @Column(name = "REPLACE_REPAY_SUM")
    private Integer REPLACE_REPAY_SUM;
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
