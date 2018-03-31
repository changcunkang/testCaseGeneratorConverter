package com.cams.blaze.request;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Loancard {
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
	private List<SpecialTrade> specialTrade = new ArrayList<SpecialTrade>();
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	private List<OverdueRecord> overdueRecord = new ArrayList<OverdueRecord>();
	@Column
	private String state;
	@Column
	private String cue;
	@Column
	private String financeOrg;
	@Column
	private String account;
	@Column
	private String currency;
	@Column
	private Date openDate;
	@Column
	private Double creditLimitAmount;
	@Column
	private String guaranteeType;
	@Column
	private Date stateEndDate;
	@Column
	private Double shareCreditLimitAmount;
	@Column
	private Double usedCreditLimitAmount;
	@Column
	private Double latest6MonthUsedAvgAmount;
	@Column
	private Double usedHighestAmount;
	@Column
	private Integer scheduledPaymentDate;
	@Column
	private Double scheduledPaymentAmount;
	@Column
	private Double actualPaymentAmount;
	@Column
	private Date recentPayDate;
	@Column
	private Integer currOverdueCyc;
	@Column
	private Double currOverdueAmount;
	@Column
	private String beginMonth;
	@Column
	private String endMonth;
	@Column
	private String latest24State;
	@Column
	private String latest24StateNum;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCue() {
		return cue;
	}
	public void setCue(String cue) {
		this.cue = cue;
	}
	public String getFinanceOrg() {
		return financeOrg;
	}
	public void setFinanceOrg(String financeOrg) {
		this.financeOrg = financeOrg;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public Date getOpenDate() {
		return openDate;
	}
	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}
	public Double getCreditLimitAmount() {
		return creditLimitAmount;
	}
	public void setCreditLimitAmount(Double creditLimitAmount) {
		this.creditLimitAmount = creditLimitAmount;
	}
	public String getGuaranteeType() {
		return guaranteeType;
	}
	public void setGuaranteeType(String guaranteeType) {
		this.guaranteeType = guaranteeType;
	}
	public Date getStateEndDate() {
		return stateEndDate;
	}
	public void setStateEndDate(Date stateEndDate) {
		this.stateEndDate = stateEndDate;
	}
	public Double getShareCreditLimitAmount() {
		return shareCreditLimitAmount;
	}
	public void setShareCreditLimitAmount(Double shareCreditLimitAmount) {
		this.shareCreditLimitAmount = shareCreditLimitAmount;
	}
	public Double getUsedCreditLimitAmount() {
		return usedCreditLimitAmount;
	}
	public void setUsedCreditLimitAmount(Double usedCreditLimitAmount) {
		this.usedCreditLimitAmount = usedCreditLimitAmount;
	}
	public Double getLatest6MonthUsedAvgAmount() {
		return latest6MonthUsedAvgAmount;
	}
	public void setLatest6MonthUsedAvgAmount(Double latest6MonthUsedAvgAmount) {
		this.latest6MonthUsedAvgAmount = latest6MonthUsedAvgAmount;
	}
	public Double getUsedHighestAmount() {
		return usedHighestAmount;
	}
	public void setUsedHighestAmount(Double usedHighestAmount) {
		this.usedHighestAmount = usedHighestAmount;
	}
	public Integer getScheduledPaymentDate() {
		return scheduledPaymentDate;
	}
	public void setScheduledPaymentDate(Integer scheduledPaymentDate) {
		this.scheduledPaymentDate = scheduledPaymentDate;
	}
	public Double getScheduledPaymentAmount() {
		return scheduledPaymentAmount;
	}
	public void setScheduledPaymentAmount(Double scheduledPaymentAmount) {
		this.scheduledPaymentAmount = scheduledPaymentAmount;
	}
	public Double getActualPaymentAmount() {
		return actualPaymentAmount;
	}
	public void setActualPaymentAmount(Double actualPaymentAmount) {
		this.actualPaymentAmount = actualPaymentAmount;
	}
	public Date getRecentPayDate() {
		return recentPayDate;
	}
	public void setRecentPayDate(Date recentPayDate) {
		this.recentPayDate = recentPayDate;
	}
	public Integer getCurrOverdueCyc() {
		return currOverdueCyc;
	}
	public void setCurrOverdueCyc(Integer currOverdueCyc) {
		this.currOverdueCyc = currOverdueCyc;
	}
	public Double getCurrOverdueAmount() {
		return currOverdueAmount;
	}
	public void setCurrOverdueAmount(Double currOverdueAmount) {
		this.currOverdueAmount = currOverdueAmount;
	}
	public String getBeginMonth() {
		return beginMonth;
	}
	public void setBeginMonth(String beginMonth) {
		this.beginMonth = beginMonth;
	}
	public String getEndMonth() {
		return endMonth;
	}
	public void setEndMonth(String endMonth) {
		this.endMonth = endMonth;
	}
	public String getLatest24State() {
		return latest24State;
	}
	public void setLatest24State(String latest24State) {
		this.latest24State = latest24State;
	}
	public String getLatest24StateNum() {
		return latest24StateNum;
	}
	public void setLatest24StateNum(String latest24StateNum) {
		this.latest24StateNum = latest24StateNum;
	}
	public List<OverdueRecord> getOverdueRecord() {
		return overdueRecord;
	}
	public void setOverdueRecord(List<OverdueRecord> overdueRecord) {
		this.overdueRecord = overdueRecord;
	}
	public List<SpecialTrade> getSpecialTrade() {
		return specialTrade;
	}
	public void setSpecialTrade(List<SpecialTrade> specialTrade) {
		this.specialTrade = specialTrade;
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
