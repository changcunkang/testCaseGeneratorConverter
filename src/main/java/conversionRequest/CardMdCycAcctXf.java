package conversionRequest;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="CARD_MD_CYC_ACCT_XF")
public class CardMdCycAcctXf {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column
    private Long id;
    @Column
    private Long parent_id;
    @Column(name = "XACCOUNT")
    private String XACCOUNT;
    @Column(name = "MONTH_NBR")
    private Integer MONTH_NBR;
    @Column(name = "CUR_CYCLE_DT")
    private Integer CUR_CYCLE_DT;
    @Column(name = "CUSTR_NBR")
    private String CUSTR_NBR;
    @Column(name = "CONSM_TYPE_CODE")
    private String CONSM_TYPE_CODE;
    @Column(name = "CONSM_TYPE")
    private String CONSM_TYPE;
    @Column(name = "CONSM_CNT")
    private Integer CONSM_CNT;
    @Column(name = "CONSM_AMT")
    private Integer CONSM_AMT;
    @Column(name = "MYETL_DATE")
    private Date MYETL_DATE;

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

    public String getXACCOUNT() {
        return XACCOUNT;
    }

    public void setXACCOUNT(String XACCOUNT) {
        this.XACCOUNT = XACCOUNT;
    }

    public Integer getMONTH_NBR() {
        return MONTH_NBR;
    }

    public void setMONTH_NBR(Integer MONTH_NBR) {
        this.MONTH_NBR = MONTH_NBR;
    }

    public Integer getCUR_CYCLE_DT() {
        return CUR_CYCLE_DT;
    }

    public void setCUR_CYCLE_DT(Integer CUR_CYCLE_DT) {
        this.CUR_CYCLE_DT = CUR_CYCLE_DT;
    }

    public String getCUSTR_NBR() {
        return CUSTR_NBR;
    }

    public void setCUSTR_NBR(String CUSTR_NBR) {
        this.CUSTR_NBR = CUSTR_NBR;
    }

    public String getCONSM_TYPE_CODE() {
        return CONSM_TYPE_CODE;
    }

    public void setCONSM_TYPE_CODE(String CONSM_TYPE_CODE) {
        this.CONSM_TYPE_CODE = CONSM_TYPE_CODE;
    }

    public String getCONSM_TYPE() {
        return CONSM_TYPE;
    }

    public void setCONSM_TYPE(String CONSM_TYPE) {
        this.CONSM_TYPE = CONSM_TYPE;
    }

    public Integer getCONSM_CNT() {
        return CONSM_CNT;
    }

    public void setCONSM_CNT(Integer CONSM_CNT) {
        this.CONSM_CNT = CONSM_CNT;
    }

    public Integer getCONSM_AMT() {
        return CONSM_AMT;
    }

    public void setCONSM_AMT(Integer CONSM_AMT) {
        this.CONSM_AMT = CONSM_AMT;
    }

    public Date getMYETL_DATE() {
        return MYETL_DATE;
    }

    public void setMYETL_DATE(Date MYETL_DATE) {
        this.MYETL_DATE = MYETL_DATE;
    }
}
