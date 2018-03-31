package com.cams.blaze.request;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class MonthlyRecordInfo {



	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE)

	@Column
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="parent_id")
    private	 List<ConsumeTypeSet> consumeTypeSet = new ArrayList<ConsumeTypeSet>();

	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="parent_id")
    private	 List<TransRecords> transRecords = new ArrayList<TransRecords>();

	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="parent_id")
    private	 List<InstalmentInfo> instalmentInfo = new ArrayList<InstalmentInfo>();

	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="parent_id")
    private	 List<HighRiskTrans> highRiskTrans = new ArrayList<HighRiskTrans>();

	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinTable(name="mr_udf")
	private	 List<UserDefinedField> userDefinedField = new ArrayList<UserDefinedField>();

	@Column
    private	 Integer relativeCycleNumber;
	@Column
    private	 Integer delinquentCycle;
	@Column
    private	 Double fixCreditLimit;
	@Column
    private	 Double temporaryLimit;
	@Column
    private	 Double billDateFixCreditLimit;
	@Column
    private	 Double billDateTemporaryLimit;
	@Column
    private	 Double cashLimt;
	@Column
    private	 Double balance;
	@Column
    private	 Double mthsOdueAmt;
	@Column
    private	 Double interest;
	@Column
    private	 Double monthlyIncome;
	@Column
    private	 Double dailyBalanceSum;
	@Column
    private	 Double overdraftAmtTot;
	@Column
    private	 Double maxBalance;
	@Column
    private	 Double billInstaledAmt;
	@Column
    private	 Double billPaymentAmt;
	@Column
    private	 String billInstalmentKeys;
	@Column
    private	 String postInstalmentKeys;
	@Column
    private	 String consumerInstalmentKeys;
	@Column
    private	 Double top1TransanctionAmt;
	@Column
    private	 Double top2TransanctionAmt;
	@Column
    private	 Double top3TransanctionAmt;
	@Column
    private	 Double top4TransanctionAmt;
	@Column
    private	 Double top5TransanctionAmt;
	@Column
	private Integer ifApplyAfl;
	@Column
	private Integer ifApplyAtl;
	@Column
	private Integer ifApplyConsInstals;
	@Column
	private Integer ifApplyBillInstals;

	@Column
	private Integer cashAmtOccupiedDays;
	@Column
	private Integer limitUsedDays;

	@Transient
	private List<InstalmentDetail_New> instalmentDetail_New = new ArrayList<InstalmentDetail_New>();

	@Transient
	private List<InstalmentDetail_Old> instalmentDetail_Old = new ArrayList<InstalmentDetail_Old>();

	@Transient
	private List<InstalmentDetail> instalmentDetail = new ArrayList<InstalmentDetail>();

	public List<InstalmentDetail_New> getInstalmentDetail_New() {
		return instalmentDetail_New;
	}

	public void setInstalmentDetail_New(List<InstalmentDetail_New> instalmentDetail_New) {
		this.instalmentDetail_New = instalmentDetail_New;
	}

	public List<InstalmentDetail_Old> getInstalmentDetail_Old() {
		return instalmentDetail_Old;
	}

	public void setInstalmentDetail_Old(List<InstalmentDetail_Old> instalmentDetail_Old) {
		this.instalmentDetail_Old = instalmentDetail_Old;
	}

	public Integer getCashAmtOccupiedDays() {
		return cashAmtOccupiedDays;
	}

	public void setCashAmtOccupiedDays(Integer cashAmtOccupiedDays) {
		this.cashAmtOccupiedDays = cashAmtOccupiedDays;
	}

	public Integer getLimitUsedDays() {
		return limitUsedDays;
	}

	public void setLimitUsedDays(Integer limitUsedDays) {
		this.limitUsedDays = limitUsedDays;
	}

	public Integer getRelativeCycleNumber() {
		return relativeCycleNumber;
	}
	public void setRelativeCycleNumber(Integer relativeCycleNumber) {
		this.relativeCycleNumber = relativeCycleNumber;
	}
	public Integer getDelinquentCycle() {
		return delinquentCycle;
	}
	public void setDelinquentCycle(Integer delinquentCycle) {
		this.delinquentCycle = delinquentCycle;
	}
	public Double getFixCreditLimit() {
		return fixCreditLimit;
	}
	public void setFixCreditLimit(Double fixCreditLimit) {
		this.fixCreditLimit = fixCreditLimit;
	}
	public Double getTemporaryLimit() {
		return temporaryLimit;
	}
	public void setTemporaryLimit(Double temporaryLimit) {
		this.temporaryLimit = temporaryLimit;
	}
	public Double getCashLimt() {
		return cashLimt;
	}
	public void setCashLimt(Double cashLimt) {
		this.cashLimt = cashLimt;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public Double getMthsOdueAmt() {
		return mthsOdueAmt;
	}
	public void setMthsOdueAmt(Double mthsOdueAmt) {
		this.mthsOdueAmt = mthsOdueAmt;
	}
	public Double getInterest() {
		return interest;
	}
	public void setInterest(Double interest) {
		this.interest = interest;
	}
	public Double getMonthlyIncome() {
		return monthlyIncome;
	}
	public void setMonthlyIncome(Double monthlyIncome) {
		this.monthlyIncome = monthlyIncome;
	}	
	public Double getBillDateFixCreditLimit() {
		return billDateFixCreditLimit;
	}
	public void setBillDateFixCreditLimit(Double billDateFixCreditLimit) {
		this.billDateFixCreditLimit = billDateFixCreditLimit;
	}
	public Double getBillDateTemporaryLimit() {
		return billDateTemporaryLimit;
	}
	public void setBillDateTemporaryLimit(Double billDateTemporaryLimit) {
		this.billDateTemporaryLimit = billDateTemporaryLimit;
	}
	public Double getDailyBalanceSum() {
		return dailyBalanceSum;
	}
	public void setDailyBalanceSum(Double dailyBalanceSum) {
		this.dailyBalanceSum = dailyBalanceSum;
	}
	public Double getOverdraftAmtTot() {
		return overdraftAmtTot;
	}
	public void setOverdraftAmtTot(Double overdraftAmtTot) {
		this.overdraftAmtTot = overdraftAmtTot;
	}
	public Double getMaxBalance() {
		return maxBalance;
	}
	public void setMaxBalance(Double maxBalance) {
		this.maxBalance = maxBalance;
	}
	public Double getBillInstaledAmt() {
		return billInstaledAmt;
	}
	public void setBillInstaledAmt(Double billInstaledAmt) {
		this.billInstaledAmt = billInstaledAmt;
	}
	public Double getBillPaymentAmt() {
		return billPaymentAmt;
	}
	public void setBillPaymentAmt(Double billPaymentAmt) {
		this.billPaymentAmt = billPaymentAmt;
	}	
	public String getBillInstalmentKeys() {
		return billInstalmentKeys;
	}
	public void setBillInstalmentKeys(String billInstalmentKeys) {
		this.billInstalmentKeys = billInstalmentKeys;
	}
	public String getPostInstalmentKeys() {
		return postInstalmentKeys;
	}
	public void setPostInstalmentKeys(String postInstalmentKeys) {
		this.postInstalmentKeys = postInstalmentKeys;
	}
	public String getConsumerInstalmentKeys() {
		return consumerInstalmentKeys;
	}
	public void setConsumerInstalmentKeys(String consumerInstalmentKeys) {
		this.consumerInstalmentKeys = consumerInstalmentKeys;
	}
	public Double getTop1TransanctionAmt() {
		return top1TransanctionAmt;
	}
	public void setTop1TransanctionAmt(Double top1TransanctionAmt) {
		this.top1TransanctionAmt = top1TransanctionAmt;
	}
	public Double getTop2TransanctionAmt() {
		return top2TransanctionAmt;
	}
	public void setTop2TransanctionAmt(Double top2TransanctionAmt) {
		this.top2TransanctionAmt = top2TransanctionAmt;
	}
	public Double getTop3TransanctionAmt() {
		return top3TransanctionAmt;
	}
	public void setTop3TransanctionAmt(Double top3TransanctionAmt) {
		this.top3TransanctionAmt = top3TransanctionAmt;
	}
	public Double getTop4TransanctionAmt() {
		return top4TransanctionAmt;
	}
	public void setTop4TransanctionAmt(Double top4TransanctionAmt) {
		this.top4TransanctionAmt = top4TransanctionAmt;
	}
	public Double getTop5TransanctionAmt() {
		return top5TransanctionAmt;
	}
	public void setTop5TransanctionAmt(Double top5TransanctionAmt) {
		this.top5TransanctionAmt = top5TransanctionAmt;
	}
	public List<ConsumeTypeSet> getConsumeTypeSet() {
		return consumeTypeSet;
	}
	public void setConsumeTypeSet(List<ConsumeTypeSet> consumeTypeSet) {
		this.consumeTypeSet = consumeTypeSet;
	}
	public List<HighRiskTrans> getHighRiskTrans() {
		return highRiskTrans;
	}
	public void setHighRiskTrans(List<HighRiskTrans> highRiskTrans) {
		this.highRiskTrans = highRiskTrans;
	}
	public List<InstalmentInfo> getInstalmentInfo() {
		return instalmentInfo;
	}
	public void setInstalmentInfo(List<InstalmentInfo> instalmentInfo) {
		this.instalmentInfo = instalmentInfo;
	}
	public List<TransRecords> getTransRecords() {
		return transRecords;
	}
	public void setTransRecords(List<TransRecords> transRecords) {
		this.transRecords = transRecords;
	}
	public List<UserDefinedField> getUserDefinedField() {
		return userDefinedField;
	}
	public void setUserDefinedField(List<UserDefinedField> userDefinedField) {
		this.userDefinedField = userDefinedField;
	}

	public Integer getIfApplyAfl() {
		return ifApplyAfl;
	}

	public void setIfApplyAfl(Integer ifApplyAfl) {
		this.ifApplyAfl = ifApplyAfl;
	}

	public Integer getIfApplyAtl() {
		return ifApplyAtl;
	}

	public void setIfApplyAtl(Integer ifApplyAtl) {
		this.ifApplyAtl = ifApplyAtl;
	}

	public Integer getIfApplyConsInstals() {
		return ifApplyConsInstals;
	}

	public void setIfApplyConsInstals(Integer ifApplyConsInstals) {
		this.ifApplyConsInstals = ifApplyConsInstals;
	}

	public Integer getIfApplyBillInstals() {
		return ifApplyBillInstals;
	}

	public void setIfApplyBillInstals(Integer ifApplyBillInstals) {
		this.ifApplyBillInstals = ifApplyBillInstals;
	}

	public List<InstalmentDetail> getInstalmentDetail() {
		return instalmentDetail;
	}

	public void setInstalmentDetail(List<InstalmentDetail> instalmentDetail) {
		this.instalmentDetail = instalmentDetail;
	}
	@Column
	private Long parent_id;

	public Long getParent_id() {
		return parent_id;
	}

	public void setParent_id(Long parent_id) {
		this.parent_id = parent_id;
	}
}
