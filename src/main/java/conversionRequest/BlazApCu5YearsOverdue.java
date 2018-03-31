package conversionRequest;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="BLAZ_AP_CU_5YEARS_OVERDUE")
public class BlazApCu5YearsOverdue {

    private String P_ID;
    private String F_ID;
    private String OVERDUE_MONTH;
    private Integer OVERDUE_MONTHS;
    private Double OVERDUE_AMOUNT;
    private String REPORT_ID;

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

    public Double getOVERDUE_AMOUNT() {
        return OVERDUE_AMOUNT;
    }

    public void setOVERDUE_AMOUNT(Double OVERDUE_AMOUNT) {
        this.OVERDUE_AMOUNT = OVERDUE_AMOUNT;
    }

    public String getREPORT_ID() {
        return REPORT_ID;
    }

    public void setREPORT_ID(String REPORT_ID) {
        this.REPORT_ID = REPORT_ID;
    }
}
