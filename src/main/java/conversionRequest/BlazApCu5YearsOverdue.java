package conversionRequest;

import javax.persistence.*;

@Entity
@Table(name="BLAZ_AP_CU_5YEARS_OVERDUE")
public class BlazApCu5YearsOverdue {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    @Column
    private Long id;
    @Column(name="P_ID")
    private String P_ID;
    @Column(name="F_ID")
    private String F_ID;
    @Column(name="OVERDUE_MONTH")
    private String OVERDUE_MONTH;
    @Column(name="OVERDUE_MONTHS")
    private Integer OVERDUE_MONTHS;
    @Column(name="OVERDUE_AMOUNT")
    private Integer OVERDUE_AMOUNT;
    @Column(name="REPORT_ID")
    private String REPORT_ID;
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

    public String getOVERDUE_MONTH() {
        return OVERDUE_MONTH;
    }

    public void setOVERDUE_MONTH(String OVERDUE_MONTH) {
        this.OVERDUE_MONTH = OVERDUE_MONTH;
    }

    public Integer getOVERDUE_MONTHS() {
        return OVERDUE_MONTHS;
    }

    public void setOVERDUE_MONTHS(Integer OVERDUE_MONTHS) {
        this.OVERDUE_MONTHS = OVERDUE_MONTHS;
    }

    public Integer getOVERDUE_AMOUNT() {
        return OVERDUE_AMOUNT;
    }

    public void setOVERDUE_AMOUNT(Integer OVERDUE_AMOUNT) {
        this.OVERDUE_AMOUNT = OVERDUE_AMOUNT;
    }

    public String getREPORT_ID() {
        return REPORT_ID;
    }

    public void setREPORT_ID(String REPORT_ID) {
        this.REPORT_ID = REPORT_ID;
    }
}
