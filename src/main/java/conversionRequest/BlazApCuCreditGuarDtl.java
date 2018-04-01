package conversionRequest;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="BLAZ_AP_CU_CREDIT_GUAR_DTL")
public class BlazApCuCreditGuarDtl {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    @Column
    private Long id;
    @Column(name="P_ID")
    private String P_ID;
    @Column(name="F_ID")
    private String F_ID;
    @Column(name="SN")
    private String SN;
    @Column(name="ORGANIZATION")
    private String ORGANIZATION;
    @Column(name="CONTRACT_AMOUNT")
    private Integer CONTRACT_AMOUNT;
    @Column(name="ISSUE_DATE")
    private Date ISSUE_DATE;
    @Column(name="BONDS_AMOUNT")
    private Integer BONDS_AMOUNT;
    @Column(name="USED_AMOUNT")
    private Integer USED_AMOUNT;
    @Column(name="BILL_DATE")
    private Date BILL_DATE;
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

    public String getORGANIZATION() {
        return ORGANIZATION;
    }

    public void setORGANIZATION(String ORGANIZATION) {
        this.ORGANIZATION = ORGANIZATION;
    }

    public Integer getCONTRACT_AMOUNT() {
        return CONTRACT_AMOUNT;
    }

    public void setCONTRACT_AMOUNT(Integer CONTRACT_AMOUNT) {
        this.CONTRACT_AMOUNT = CONTRACT_AMOUNT;
    }

    public Date getISSUE_DATE() {
        return ISSUE_DATE;
    }

    public void setISSUE_DATE(Date ISSUE_DATE) {
        this.ISSUE_DATE = ISSUE_DATE;
    }

    public Integer getBONDS_AMOUNT() {
        return BONDS_AMOUNT;
    }

    public void setBONDS_AMOUNT(Integer BONDS_AMOUNT) {
        this.BONDS_AMOUNT = BONDS_AMOUNT;
    }

    public Integer getUSED_AMOUNT() {
        return USED_AMOUNT;
    }

    public void setUSED_AMOUNT(Integer USED_AMOUNT) {
        this.USED_AMOUNT = USED_AMOUNT;
    }

    public Date getBILL_DATE() {
        return BILL_DATE;
    }

    public void setBILL_DATE(Date BILL_DATE) {
        this.BILL_DATE = BILL_DATE;
    }
}
