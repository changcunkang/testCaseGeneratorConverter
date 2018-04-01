package conversionRequest;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="BLAZ_AP_CU_FORCECARRY")
public class BlazApCuForcecarry {
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
    @Column(name="COURT")
    private String COURT;
    @Column(name="REASON")
    private String REASON;
    @Column(name="REGESTER_DATE")
    private Date REGESTER_DATE;
    @Column(name="END_WAY")
    private String END_WAY;
    @Column(name="CASE_STATUS")
    private String CASE_STATUS;
    @Column(name="END_DATE")
    private Date END_DATE;
    @Column(name="CASE_OBJECT")
    private String CASE_OBJECT;
    @Column(name="CASE_OBJECT_AMOUNT")
    private Integer CASE_OBJECT_AMOUNT;
    @Column(name="HAD_OBJECT")
    private String HAD_OBJECT;
    @Column(name="HAD_OBJECT_AMOUNT")
    private Integer HAD_OBJECT_AMOUNT;
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

    public Integer getCASE_OBJECT_AMOUNT() {
        return CASE_OBJECT_AMOUNT;
    }

    public void setCASE_OBJECT_AMOUNT(Integer CASE_OBJECT_AMOUNT) {
        this.CASE_OBJECT_AMOUNT = CASE_OBJECT_AMOUNT;
    }

    public String getHAD_OBJECT() {
        return HAD_OBJECT;
    }

    public void setHAD_OBJECT(String HAD_OBJECT) {
        this.HAD_OBJECT = HAD_OBJECT;
    }

    public Integer getHAD_OBJECT_AMOUNT() {
        return HAD_OBJECT_AMOUNT;
    }

    public void setHAD_OBJECT_AMOUNT(Integer HAD_OBJECT_AMOUNT) {
        this.HAD_OBJECT_AMOUNT = HAD_OBJECT_AMOUNT;
    }
}
