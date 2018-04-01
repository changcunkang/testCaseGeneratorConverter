package conversionRequest;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="BLAZ_AP_CU_CUSTR")
public class BlazApCuCustr {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    @Column
    private Long id;
    @Column(name="CUSTR_NBR")
    private String CUSTR_NBR;
    @Column(name="RACE_CODE")
    private String RACE_CODE;
    @Column(name="CUSTR_TYPE_CODE")
    private String CUSTR_TYPE_CODE;
    @Column(name="TACTI_RAND_1")
    private Integer TACTI_RAND_1;
    @Column(name="TACTI_RAND_2")
    private Integer TACTI_RAND_2;
    @Column(name="TACTI_RAND_3")
    private Integer TACTI_RAND_3;
    @Column(name="TACTI_RAND_4")
    private Integer TACTI_RAND_4;
    @Column(name="TACTI_RAND_5")
    private Integer TACTI_RAND_5;
    @Column(name="TACTI_RAND_6")
    private Integer TACTI_RAND_6;
    @Column(name="TACTI_RAND_7")
    private Integer TACTI_RAND_7;
    @Column(name="TACTI_RAND_8")
    private Integer TACTI_RAND_8;
    @Column(name="TACTI_RAND_9")
    private Integer TACTI_RAND_9;
    @Column(name="TACTI_RAND_10")
    private Integer TACTI_RAND_10;
    @Column(name="TACTI_RAND_11")
    private Integer TACTI_RAND_11;
    @Column(name="TACTI_RAND_12")
    private Integer TACTI_RAND_12;
    @Column(name="TACTI_RAND_13")
    private Integer TACTI_RAND_13;
    @Column(name="TACTI_RAND_14")
    private Integer TACTI_RAND_14;
    @Column(name="TACTI_RAND_15")
    private Integer TACTI_RAND_15;
    @Column(name="TACTI_RAND_16")
    private Integer TACTI_RAND_16;
    @Column(name="TACTI_RAND_17")
    private Integer TACTI_RAND_17;
    @Column(name="TACTI_RAND_18")
    private Integer TACTI_RAND_18;
    @Column(name="TACTI_RAND_19")
    private Integer TACTI_RAND_19;
    @Column(name="TACTI_RAND_20")
    private Integer TACTI_RAND_20;
    @Column(name="COMP_NAME")
    private String COMP_NAME;
    @Column(name="FIRST_APP_PBC_SCORE")
    private Integer FIRST_APP_PBC_SCORE;
    @Column(name="LATEST_APP_PBC_SCORE")
    private Integer LATEST_APP_PBC_SCORE;
    @Column(name="INCOME_ANN")
    private Integer INCOME_ANN;
    @Column(name="INNER_GJJ_FUND_BASE")
    private Integer INNER_GJJ_FUND_BASE;
    @Column(name="EDUCA_DES")
    private String EDUCA_DES;
    @Column(name="GENDER")
    private String GENDER;
    @Column(name="DAY_BIRTH")
    private Integer DAY_BIRTH;
    @Column(name="HOME_DES")
    private String HOME_DES;
    @Column(name="YR_IN_COMP")
    private Integer YR_IN_COMP;
    @Column(name="CYCLE_NBR")
    private Integer CYCLE_NBR;
    @Column(name="MO_PHONE_FLAG")
    private Integer MO_PHONE_FLAG;
    @Column(name="IS_SUSCBL_CUSTR")
    private String IS_SUSCBL_CUSTR;
    @Column(name="IS_MARGIN_CUSTR")
    private String IS_MARGIN_CUSTR;
    @Column(name="CAP_COST_COEF")
    private Integer CAP_COST_COEF;
    @Column(name="IS_FRAUD_CUSTR")
    private Integer IS_FRAUD_CUSTR;
    @Column(name="IMPT_MSG_TIPS_12MTH")
    private String IMPT_MSG_TIPS_12MTH;
    @Column(name="CREDIT_1000_12MTH")
    private String CREDIT_1000_12MTH;
    @Column(name="TENGXUN_SCORE_12MTH")
    private String TENGXUN_SCORE_12MTH;
    @Column(name="CUSTR_REF")
    private String CUSTR_REF;
    @Column(name="PNOTE_12MTH")
    private String PNOTE_12MTH;
    @Column(name="MO_PHONE")
    private String MO_PHONE;
    @Column(name="MYETL_DATE")
    private Date MYETL_DATE;
    @Column(name="MONTH_NBR")
    private Integer MONTH_NBR;

    @OneToMany(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
    @JoinColumn(name="parent_id")
    private List<BlazApCuProd> blazApCuProd=new ArrayList<conversionRequest.BlazApCuProd>();
    @OneToOne(cascade = CascadeType.ALL)
    private BlazApCuPbocBasicInfo blazApCuPbocBasicInfo=new BlazApCuPbocBasicInfo();

    public BlazApCuPbocBasicInfo getBlazApCuPbocBasicInfo() {
        return blazApCuPbocBasicInfo;
    }

    public void setBlazApCuPbocBasicInfo(BlazApCuPbocBasicInfo blazApCuPbocBasicInfo) {
        this.blazApCuPbocBasicInfo = blazApCuPbocBasicInfo;
    }

    public List<BlazApCuProd> getBlazApCuProd() {
        return blazApCuProd;
    }

    public void setBlazApCuProd(List<BlazApCuProd> blazApCuProd) {
        this.blazApCuProd = blazApCuProd;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getCUSTR_NBR() {
        return CUSTR_NBR;
    }

    public void setCUSTR_NBR(String CUSTR_NBR) {
        this.CUSTR_NBR = CUSTR_NBR;
    }

    public String getRACE_CODE() {
        return RACE_CODE;
    }

    public void setRACE_CODE(String RACE_CODE) {
        this.RACE_CODE = RACE_CODE;
    }

    public String getCUSTR_TYPE_CODE() {
        return CUSTR_TYPE_CODE;
    }

    public void setCUSTR_TYPE_CODE(String CUSTR_TYPE_CODE) {
        this.CUSTR_TYPE_CODE = CUSTR_TYPE_CODE;
    }

    public Integer getTACTI_RAND_1() {
        return TACTI_RAND_1;
    }

    public void setTACTI_RAND_1(Integer TACTI_RAND_1) {
        this.TACTI_RAND_1 = TACTI_RAND_1;
    }

    public Integer getTACTI_RAND_2() {
        return TACTI_RAND_2;
    }

    public void setTACTI_RAND_2(Integer TACTI_RAND_2) {
        this.TACTI_RAND_2 = TACTI_RAND_2;
    }

    public Integer getTACTI_RAND_3() {
        return TACTI_RAND_3;
    }

    public void setTACTI_RAND_3(Integer TACTI_RAND_3) {
        this.TACTI_RAND_3 = TACTI_RAND_3;
    }

    public Integer getTACTI_RAND_4() {
        return TACTI_RAND_4;
    }

    public void setTACTI_RAND_4(Integer TACTI_RAND_4) {
        this.TACTI_RAND_4 = TACTI_RAND_4;
    }

    public Integer getTACTI_RAND_5() {
        return TACTI_RAND_5;
    }

    public void setTACTI_RAND_5(Integer TACTI_RAND_5) {
        this.TACTI_RAND_5 = TACTI_RAND_5;
    }

    public Integer getTACTI_RAND_6() {
        return TACTI_RAND_6;
    }

    public void setTACTI_RAND_6(Integer TACTI_RAND_6) {
        this.TACTI_RAND_6 = TACTI_RAND_6;
    }

    public Integer getTACTI_RAND_7() {
        return TACTI_RAND_7;
    }

    public void setTACTI_RAND_7(Integer TACTI_RAND_7) {
        this.TACTI_RAND_7 = TACTI_RAND_7;
    }

    public Integer getTACTI_RAND_8() {
        return TACTI_RAND_8;
    }

    public void setTACTI_RAND_8(Integer TACTI_RAND_8) {
        this.TACTI_RAND_8 = TACTI_RAND_8;
    }

    public Integer getTACTI_RAND_9() {
        return TACTI_RAND_9;
    }

    public void setTACTI_RAND_9(Integer TACTI_RAND_9) {
        this.TACTI_RAND_9 = TACTI_RAND_9;
    }

    public Integer getTACTI_RAND_10() {
        return TACTI_RAND_10;
    }

    public void setTACTI_RAND_10(Integer TACTI_RAND_10) {
        this.TACTI_RAND_10 = TACTI_RAND_10;
    }

    public Integer getTACTI_RAND_11() {
        return TACTI_RAND_11;
    }

    public void setTACTI_RAND_11(Integer TACTI_RAND_11) {
        this.TACTI_RAND_11 = TACTI_RAND_11;
    }

    public Integer getTACTI_RAND_12() {
        return TACTI_RAND_12;
    }

    public void setTACTI_RAND_12(Integer TACTI_RAND_12) {
        this.TACTI_RAND_12 = TACTI_RAND_12;
    }

    public Integer getTACTI_RAND_13() {
        return TACTI_RAND_13;
    }

    public void setTACTI_RAND_13(Integer TACTI_RAND_13) {
        this.TACTI_RAND_13 = TACTI_RAND_13;
    }

    public Integer getTACTI_RAND_14() {
        return TACTI_RAND_14;
    }

    public void setTACTI_RAND_14(Integer TACTI_RAND_14) {
        this.TACTI_RAND_14 = TACTI_RAND_14;
    }

    public Integer getTACTI_RAND_15() {
        return TACTI_RAND_15;
    }

    public void setTACTI_RAND_15(Integer TACTI_RAND_15) {
        this.TACTI_RAND_15 = TACTI_RAND_15;
    }

    public Integer getTACTI_RAND_16() {
        return TACTI_RAND_16;
    }

    public void setTACTI_RAND_16(Integer TACTI_RAND_16) {
        this.TACTI_RAND_16 = TACTI_RAND_16;
    }

    public Integer getTACTI_RAND_17() {
        return TACTI_RAND_17;
    }

    public void setTACTI_RAND_17(Integer TACTI_RAND_17) {
        this.TACTI_RAND_17 = TACTI_RAND_17;
    }

    public Integer getTACTI_RAND_18() {
        return TACTI_RAND_18;
    }

    public void setTACTI_RAND_18(Integer TACTI_RAND_18) {
        this.TACTI_RAND_18 = TACTI_RAND_18;
    }

    public Integer getTACTI_RAND_19() {
        return TACTI_RAND_19;
    }

    public void setTACTI_RAND_19(Integer TACTI_RAND_19) {
        this.TACTI_RAND_19 = TACTI_RAND_19;
    }

    public Integer getTACTI_RAND_20() {
        return TACTI_RAND_20;
    }

    public void setTACTI_RAND_20(Integer TACTI_RAND_20) {
        this.TACTI_RAND_20 = TACTI_RAND_20;
    }

    public String getCOMP_NAME() {
        return COMP_NAME;
    }

    public void setCOMP_NAME(String COMP_NAME) {
        this.COMP_NAME = COMP_NAME;
    }

    public Integer getFIRST_APP_PBC_SCORE() {
        return FIRST_APP_PBC_SCORE;
    }

    public void setFIRST_APP_PBC_SCORE(Integer FIRST_APP_PBC_SCORE) {
        this.FIRST_APP_PBC_SCORE = FIRST_APP_PBC_SCORE;
    }

    public Integer getLATEST_APP_PBC_SCORE() {
        return LATEST_APP_PBC_SCORE;
    }

    public void setLATEST_APP_PBC_SCORE(Integer LATEST_APP_PBC_SCORE) {
        this.LATEST_APP_PBC_SCORE = LATEST_APP_PBC_SCORE;
    }

    public Integer getINCOME_ANN() {
        return INCOME_ANN;
    }

    public void setINCOME_ANN(Integer INCOME_ANN) {
        this.INCOME_ANN = INCOME_ANN;
    }

    public Integer getINNER_GJJ_FUND_BASE() {
        return INNER_GJJ_FUND_BASE;
    }

    public void setINNER_GJJ_FUND_BASE(Integer INNER_GJJ_FUND_BASE) {
        this.INNER_GJJ_FUND_BASE = INNER_GJJ_FUND_BASE;
    }

    public String getEDUCA_DES() {
        return EDUCA_DES;
    }

    public void setEDUCA_DES(String EDUCA_DES) {
        this.EDUCA_DES = EDUCA_DES;
    }

    public String getGENDER() {
        return GENDER;
    }

    public void setGENDER(String GENDER) {
        this.GENDER = GENDER;
    }

    public Integer getDAY_BIRTH() {
        return DAY_BIRTH;
    }

    public void setDAY_BIRTH(Integer DAY_BIRTH) {
        this.DAY_BIRTH = DAY_BIRTH;
    }

    public String getHOME_DES() {
        return HOME_DES;
    }

    public void setHOME_DES(String HOME_DES) {
        this.HOME_DES = HOME_DES;
    }

    public Integer getYR_IN_COMP() {
        return YR_IN_COMP;
    }

    public void setYR_IN_COMP(Integer YR_IN_COMP) {
        this.YR_IN_COMP = YR_IN_COMP;
    }

    public Integer getCYCLE_NBR() {
        return CYCLE_NBR;
    }

    public void setCYCLE_NBR(Integer CYCLE_NBR) {
        this.CYCLE_NBR = CYCLE_NBR;
    }

    public Integer getMO_PHONE_FLAG() {
        return MO_PHONE_FLAG;
    }

    public void setMO_PHONE_FLAG(Integer MO_PHONE_FLAG) {
        this.MO_PHONE_FLAG = MO_PHONE_FLAG;
    }

    public String getIS_SUSCBL_CUSTR() {
        return IS_SUSCBL_CUSTR;
    }

    public void setIS_SUSCBL_CUSTR(String IS_SUSCBL_CUSTR) {
        this.IS_SUSCBL_CUSTR = IS_SUSCBL_CUSTR;
    }

    public String getIS_MARGIN_CUSTR() {
        return IS_MARGIN_CUSTR;
    }

    public void setIS_MARGIN_CUSTR(String IS_MARGIN_CUSTR) {
        this.IS_MARGIN_CUSTR = IS_MARGIN_CUSTR;
    }

    public Integer getCAP_COST_COEF() {
        return CAP_COST_COEF;
    }

    public void setCAP_COST_COEF(Integer CAP_COST_COEF) {
        this.CAP_COST_COEF = CAP_COST_COEF;
    }

    public Integer getIS_FRAUD_CUSTR() {
        return IS_FRAUD_CUSTR;
    }

    public void setIS_FRAUD_CUSTR(Integer IS_FRAUD_CUSTR) {
        this.IS_FRAUD_CUSTR = IS_FRAUD_CUSTR;
    }

    public String getIMPT_MSG_TIPS_12MTH() {
        return IMPT_MSG_TIPS_12MTH;
    }

    public void setIMPT_MSG_TIPS_12MTH(String IMPT_MSG_TIPS_12MTH) {
        this.IMPT_MSG_TIPS_12MTH = IMPT_MSG_TIPS_12MTH;
    }

    public String getCREDIT_1000_12MTH() {
        return CREDIT_1000_12MTH;
    }

    public void setCREDIT_1000_12MTH(String CREDIT_1000_12MTH) {
        this.CREDIT_1000_12MTH = CREDIT_1000_12MTH;
    }

    public String getTENGXUN_SCORE_12MTH() {
        return TENGXUN_SCORE_12MTH;
    }

    public void setTENGXUN_SCORE_12MTH(String TENGXUN_SCORE_12MTH) {
        this.TENGXUN_SCORE_12MTH = TENGXUN_SCORE_12MTH;
    }

    public String getCUSTR_REF() {
        return CUSTR_REF;
    }

    public void setCUSTR_REF(String CUSTR_REF) {
        this.CUSTR_REF = CUSTR_REF;
    }

    public String getPNOTE_12MTH() {
        return PNOTE_12MTH;
    }

    public void setPNOTE_12MTH(String PNOTE_12MTH) {
        this.PNOTE_12MTH = PNOTE_12MTH;
    }

    public String getMO_PHONE() {
        return MO_PHONE;
    }

    public void setMO_PHONE(String MO_PHONE) {
        this.MO_PHONE = MO_PHONE;
    }

    public Date getMYETL_DATE() {
        return MYETL_DATE;
    }

    public void setMYETL_DATE(Date MYETL_DATE) {
        this.MYETL_DATE = MYETL_DATE;
    }

    public Integer getMONTH_NBR() {
        return MONTH_NBR;
    }

    public void setMONTH_NBR(Integer MONTH_NBR) {
        this.MONTH_NBR = MONTH_NBR;
    }
}
