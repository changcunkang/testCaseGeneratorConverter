package conversionRequest;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="BLAZ_AP_CU_SPECIAL_TRADE")
public class BlazApCuSpecialTrade {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    @Column
    private Long id;
    @Column(name = "P_ID")
    private String P_ID;
    @Column(name = "F_ID")
    private String F_ID;
    @Column(name = "SPECIAL_TRADE_TYPE")
    private String SPECIAL_TRADE_TYPE;
    @Column(name = "HAPPEN_DATE")
    private Date HAPPEN_DATE;
    @Column(name = "CHANGE_MONTHS")
    private Integer CHANGE_MONTHS;
    @Column(name = "CHANGE_AMOUNT")
    private Integer CHANGE_AMOUNT;
    @Column(name = "DETAIL")
    private String DETAIL;
    @Column(name = "REPORT_ID")
    private String REPORT_ID;
    @Column
    private Long parent_id;

    public Long getId() {
        return id;
    }

    public Long getParent_id() {
        return parent_id;
    }

    public void setParent_id(Long parent_id) {
        this.parent_id = parent_id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getSPECIAL_TRADE_TYPE() {
        return SPECIAL_TRADE_TYPE;
    }

    public void setSPECIAL_TRADE_TYPE(String SPECIAL_TRADE_TYPE) {
        this.SPECIAL_TRADE_TYPE = SPECIAL_TRADE_TYPE;
    }

    public Date getHAPPEN_DATE() {
        return HAPPEN_DATE;
    }

    public void setHAPPEN_DATE(Date HAPPEN_DATE) {
        this.HAPPEN_DATE = HAPPEN_DATE;
    }

    public Integer getCHANGE_MONTHS() {
        return CHANGE_MONTHS;
    }

    public void setCHANGE_MONTHS(Integer CHANGE_MONTHS) {
        this.CHANGE_MONTHS = CHANGE_MONTHS;
    }

    public Integer getCHANGE_AMOUNT() {
        return CHANGE_AMOUNT;
    }

    public void setCHANGE_AMOUNT(Integer CHANGE_AMOUNT) {
        this.CHANGE_AMOUNT = CHANGE_AMOUNT;
    }

    public String getDETAIL() {
        return DETAIL;
    }

    public void setDETAIL(String DETAIL) {
        this.DETAIL = DETAIL;
    }

    public String getREPORT_ID() {
        return REPORT_ID;
    }

    public void setREPORT_ID(String REPORT_ID) {
        this.REPORT_ID = REPORT_ID;
    }
}
