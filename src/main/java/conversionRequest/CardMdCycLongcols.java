package conversionRequest;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="CARD_MD_CYC_LONGCOLS")
public class CardMdCycLongcols {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    @Column(name ="XACCOUNT")
    private Long id;
    @Column
    private Long parent_id;
    @Column(name ="XACCOUNT")
    private String XACCOUNT;
    @Column(name ="CARD_NBR")
    private String CARD_NBR;
    @Column(name ="PROD_CD")
    private String PROD_CD;
    @Column(name ="PROD_TYPE")
    private String PROD_TYPE;
    @Column(name ="CUSTR_NBR")
    private String CUSTR_NBR;
    @Column(name ="MONTH_NBR")
    private Integer MONTH_NBR;
    @Column(name ="CYCLE_NBR")
    private Integer CYCLE_NBR;
    @Column(name ="FQ_TYPE")
    private Integer FQ_TYPE;
    @Column(name ="MYETL_DATE")
    private Date MYETL_DATE;
    @Column(name = "ID")
    private String ID;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
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

    public String getCARD_NBR() {
        return CARD_NBR;
    }

    public void setCARD_NBR(String CARD_NBR) {
        this.CARD_NBR = CARD_NBR;
    }

    public String getPROD_CD() {
        return PROD_CD;
    }

    public void setPROD_CD(String PROD_CD) {
        this.PROD_CD = PROD_CD;
    }

    public String getPROD_TYPE() {
        return PROD_TYPE;
    }

    public void setPROD_TYPE(String PROD_TYPE) {
        this.PROD_TYPE = PROD_TYPE;
    }

    public String getCUSTR_NBR() {
        return CUSTR_NBR;
    }

    public void setCUSTR_NBR(String CUSTR_NBR) {
        this.CUSTR_NBR = CUSTR_NBR;
    }

    public Integer getMONTH_NBR() {
        return MONTH_NBR;
    }

    public void setMONTH_NBR(Integer MONTH_NBR) {
        this.MONTH_NBR = MONTH_NBR;
    }

    public Integer getCYCLE_NBR() {
        return CYCLE_NBR;
    }

    public void setCYCLE_NBR(Integer CYCLE_NBR) {
        this.CYCLE_NBR = CYCLE_NBR;
    }

    public Integer getFQ_TYPE() {
        return FQ_TYPE;
    }

    public void setFQ_TYPE(Integer FQ_TYPE) {
        this.FQ_TYPE = FQ_TYPE;
    }

    public Date getMYETL_DATE() {
        return MYETL_DATE;
    }

    public void setMYETL_DATE(Date MYETL_DATE) {
        this.MYETL_DATE = MYETL_DATE;
    }
}
