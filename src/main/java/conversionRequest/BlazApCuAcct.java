package conversionRequest;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="BLAZ_AP_CU_ACCT")
public class BlazApCuAcct {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    @Column
    private Long id;
    @Column(name="XACCOUNT")
    private String XACCOUNT;
    @Column(name="CATEGORY")
    private Integer CATEGORY;
    @Column(name="CUSTR_NBR")
    private String CUSTR_NBR;
    @Column(name="BlAZ_PROD_CD")
    private String BlAZ_PROD_CD;
    @Column(name="MONTH_NBR")
    private Integer MONTH_NBR;
    @Column(name="CYCLE_NBR")
    private Integer CYCLE_NBR;
    @Column(name="CLOSE_CODE")
    private String CLOSE_CODE;
    @Column(name="QUERY_AMT")
    private Integer QUERY_AMT;
    @Column(name="STMT_ODUE_120")
    private String STMT_ODUE_120;
    @Column(name="E_STMT_ODUE_120")
    private String E_STMT_ODUE_120;
    @Column(name="TLMT_END")
    private Integer TLMT_END;
    @Column(name="FIRST_CASH")
    private Date FIRST_CASH;
    @Column(name="FIRST_POS")
    private Date FIRST_POS;
    @Column(name="DAY_OPENED")
    private Date DAY_OPENED;
    @Column(name="APMA_CRED_LIMIT")
    private Integer APMA_CRED_LIMIT;
    @Column(name="FIRST_ACTIVE_DAY")
    private Date FIRST_ACTIVE_DAY;
    @Column(name="ACCT_MOB_MTH")
    private Integer ACCT_MOB_MTH;
    @Column(name="IS_FRT_ODUE_XFFQ")
    private Integer IS_FRT_ODUE_XFFQ;
    @Column(name="IS_FRT_ODUE_DXFQ")
    private Integer IS_FRT_ODUE_DXFQ;
    @Column(name="CRED_LIMIT")
    private Integer CRED_LIMIT;
    @Column(name="TEMP_LIMIT")
    private Integer TEMP_LIMIT;
    @Column(name="CASH_ADVCE")
    private Integer CASH_ADVCE;
    @Column(name="CUR_BAL")
    private Integer CUR_BAL;
    @Column(name="ODUE_AMT")
    private Integer ODUE_AMT;
    @Column(name="MTHS_ODUE")
    private Integer MTHS_ODUE;
    @Column(name="FQ_ZD_INSTL")
    private Integer FQ_ZD_INSTL;
    @Column(name="PAYMT_CLRD")
    private Integer PAYMT_CLRD;
    @Column(name="MYETL_DATE")
    private Date MYETL_DATE;

    @OneToOne(cascade = CascadeType.ALL)
    private List<CardMdHsAcctFq> cardMdHsAcctFq=new ArrayList<CardMdHsAcctFq>();
    @OneToMany(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
    @JoinColumn(name="parent_id")
    private List<BlazApHsAcctChgs> blazApHsAcctChgs=new ArrayList<BlazApHsAcctChgs>();
    @OneToMany(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
    @JoinColumn(name="parent_id")
    private List<CardMdCuCard> cardMdCuCard=new ArrayList<CardMdCuCard>();
    @OneToMany(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
    @JoinColumn(name="parent_id")
    private List<BlazApCycAcctState> blazApCycAcctState=new ArrayList<BlazApCycAcctState>();

}
