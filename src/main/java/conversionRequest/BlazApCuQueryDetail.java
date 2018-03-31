package conversionRequest;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="BLAZ_AP_CU_QUERY_DETAIL")
public class BlazApCuQueryDetail {
    private String P_ID;
    private String REPORT_ID;
    private String SN;
    private String QUERY_DATE;
    private String QUERY_USER;
    private String QUERY_REASON;

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

    public String getQUERY_DATE() {
        return QUERY_DATE;
    }

    public void setQUERY_DATE(String QUERY_DATE) {
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
