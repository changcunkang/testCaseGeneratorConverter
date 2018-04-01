package conversionRequest;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="BLAZ_AP_CU_HOUSEPROVIDENT")
public class BlazApCuHouseprovident {
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
    @Column(name="LOCATION")
    private String LOCATION;
    @Column(name="PAY_DATE")
    private Date PAY_DATE;
    @Column(name="FIRST_PAY_MONTH")
    private String FIRST_PAY_MONTH;
    @Column(name="END_PAY_DATE")
    private String END_PAY_DATE;
    @Column(name="PAY_STATUS")
    private String PAY_STATUS;
    @Column(name="PAY_PER_MONTH")
    private Double PAY_PER_MONTH;
    @Column(name="SINGLE_RATE")
    private Double SINGLE_RATE;
    @Column(name="COMPANY_RATE")
    private Double COMPANY_RATE;
    @Column(name="COMPANY")
    private String COMPANY;
    @Column(name="NEWS_UPDATE_DATE")
    private Date NEWS_UPDATE_DATE;
    @Column(name="parent_id")
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

    public String getLOCATION() {
        return LOCATION;
    }

    public void setLOCATION(String LOCATION) {
        this.LOCATION = LOCATION;
    }

    public Date getPAY_DATE() {
        return PAY_DATE;
    }

    public void setPAY_DATE(Date PAY_DATE) {
        this.PAY_DATE = PAY_DATE;
    }

    public String getFIRST_PAY_MONTH() {
        return FIRST_PAY_MONTH;
    }

    public void setFIRST_PAY_MONTH(String FIRST_PAY_MONTH) {
        this.FIRST_PAY_MONTH = FIRST_PAY_MONTH;
    }

    public String getEND_PAY_DATE() {
        return END_PAY_DATE;
    }

    public void setEND_PAY_DATE(String END_PAY_DATE) {
        this.END_PAY_DATE = END_PAY_DATE;
    }

    public String getPAY_STATUS() {
        return PAY_STATUS;
    }

    public void setPAY_STATUS(String PAY_STATUS) {
        this.PAY_STATUS = PAY_STATUS;
    }

    public Double getPAY_PER_MONTH() {
        return PAY_PER_MONTH;
    }

    public void setPAY_PER_MONTH(Double PAY_PER_MONTH) {
        this.PAY_PER_MONTH = PAY_PER_MONTH;
    }

    public Double getSINGLE_RATE() {
        return SINGLE_RATE;
    }

    public void setSINGLE_RATE(Double SINGLE_RATE) {
        this.SINGLE_RATE = SINGLE_RATE;
    }

    public Double getCOMPANY_RATE() {
        return COMPANY_RATE;
    }

    public void setCOMPANY_RATE(Double COMPANY_RATE) {
        this.COMPANY_RATE = COMPANY_RATE;
    }

    public String getCOMPANY() {
        return COMPANY;
    }

    public void setCOMPANY(String COMPANY) {
        this.COMPANY = COMPANY;
    }

    public Date getNEWS_UPDATE_DATE() {
        return NEWS_UPDATE_DATE;
    }

    public void setNEWS_UPDATE_DATE(Date NEWS_UPDATE_DATE) {
        this.NEWS_UPDATE_DATE = NEWS_UPDATE_DATE;
    }
}
