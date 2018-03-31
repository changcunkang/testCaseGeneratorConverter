package conversionRequest;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="BLAZ_AP_CU_PROD")
public class BlazApCuProd {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    @Column
    private Long id;
    @Column(name="PROD_CD")
    private String PROD_CD;
    @Column(name="PROD_TYPE")
    private String PROD_TYPE;
    @Column(name="PROD_NAME")
    private String PROD_NAME;
    @Column(name="CYCLE_NBR")
    private Integer CYCLE_NBR;
    @Column(name="MONTH_NBR")
    private Integer MONTH_NBR;
    @Column(name="CUSTR_NBR")
    private String CUSTR_NBR;
    @Column(name="CHANNEL")
    private String CHANNEL;
    @Column(name="MYETL_DATE")
    private Date MYETL_DATE;
    @Column
    private Long parent_id;


    @OneToMany(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
    @JoinColumn(name="parent_id")
    private List<BlazApCuAcct> blazApCuAcct=new ArrayList<BlazApCuAcct>();

    public List<BlazApCuAcct> getBlazApCuAcct() {
        return blazApCuAcct;
    }

    public void setBlazApCuAcct(List<BlazApCuAcct> blazApCuAcct) {
        this.blazApCuAcct = blazApCuAcct;
    }

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

    public String getPROD_NAME() {
        return PROD_NAME;
    }

    public void setPROD_NAME(String PROD_NAME) {
        this.PROD_NAME = PROD_NAME;
    }

    public Integer getCYCLE_NBR() {
        return CYCLE_NBR;
    }

    public void setCYCLE_NBR(Integer CYCLE_NBR) {
        this.CYCLE_NBR = CYCLE_NBR;
    }

    public Integer getMONTH_NBR() {
        return MONTH_NBR;
    }

    public void setMONTH_NBR(Integer MONTH_NBR) {
        this.MONTH_NBR = MONTH_NBR;
    }

    public String getCUSTR_NBR() {
        return CUSTR_NBR;
    }

    public void setCUSTR_NBR(String CUSTR_NBR) {
        this.CUSTR_NBR = CUSTR_NBR;
    }

    public String getCHANNEL() {
        return CHANNEL;
    }

    public void setCHANNEL(String CHANNEL) {
        this.CHANNEL = CHANNEL;
    }

    public Date getMYETL_DATE() {
        return MYETL_DATE;
    }

    public void setMYETL_DATE(Date MYETL_DATE) {
        this.MYETL_DATE = MYETL_DATE;
    }
}
