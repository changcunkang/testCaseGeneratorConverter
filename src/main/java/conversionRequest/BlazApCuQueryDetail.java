package conversionRequest;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="BLAZ_AP_CU_QUERY_DETAIL")
public class BlazApCuQueryDetail {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    @Column
    private Long id;
    @Column(name = "P_ID")
    private String P_ID;
    @Column(name = "REPORT_ID")
    private String REPORT_ID;
    @Column(name = "SN")
    private String SN;
    @Column(name = "QUERY_DATE")
    private Date QUERY_DATE;
    @Column(name = "QUERY_USER")
    private String QUERY_USER;
    @Column(name = "QUERY_REASON")
    private String QUERY_REASON;
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

    public String getREPORT_ID() {
        return REPORT_ID;
    }

    public void setREPORT_ID(String REPORT_ID) {
        this.REPORT_ID = REPORT_ID;
    }

    public String getSN() {
        return SN;
    }

    public void setSN(String SN) {
        this.SN = SN;
    }

    public Date getQUERY_DATE() {
        return QUERY_DATE;
    }

    public void setQUERY_DATE(Date QUERY_DATE) {
        this.QUERY_DATE = QUERY_DATE;
    }

    public String getQUERY_USER() {
        return QUERY_USER;
    }

    public void setQUERY_USER(String QUERY_USER) {
        this.QUERY_USER = QUERY_USER;
    }

    public String getQUERY_REASON() {
        return QUERY_REASON;
    }

    public void setQUERY_REASON(String QUERY_REASON) {
        this.QUERY_REASON = QUERY_REASON;
    }
}
