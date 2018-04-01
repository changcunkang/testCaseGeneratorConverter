package conversionRequest;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="BLAZ_AP_CU_PUNISH")
public class BlazApCuPunish {
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
    @Column(name="PUNISH_CONTENT")
    private String PUNISH_CONTENT;
    @Column(name="PUNISH_AMOUNT")
    private String PUNISH_AMOUNT;
    @Column(name="EFFECTIVE_DATE")
    private Date EFFECTIVE_DATE;
    @Column(name="END_DATE")
    private Date END_DATE;
    @Column(name="RECONSIDER_RESULT")
    private String RECONSIDER_RESULT;
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
