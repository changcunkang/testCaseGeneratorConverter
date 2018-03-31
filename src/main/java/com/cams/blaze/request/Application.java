package com.cams.blaze.request;

import com.cams.blaze.response.DecisionResponse;
import com.cams.blaze.response.MessageList;
import com.cams.blaze.response.ProcessingHistory;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Application {


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


	/**客户层信息*/
	@OneToOne(cascade = CascadeType.ALL, fetch=FetchType.LAZY)
	private Customer customer = new Customer();
	/**输出响应*/
	//@OneToOne(cascade = CascadeType.ALL)
	@OneToOne(cascade = CascadeType.ALL, fetch=FetchType.LAZY)
	private DecisionResponse decisionResponse = new DecisionResponse();
	/**处理历史*/
	//@OneToOne(cascade = CascadeType.ALL)
	@OneToOne(cascade = CascadeType.ALL, fetch=FetchType.LAZY)
	private ProcessingHistory processingHistory = new ProcessingHistory();
	/**消息列表*/
	//@OneToOne(cascade = CascadeType.ALL)
	@OneToOne(cascade = CascadeType.ALL, fetch=FetchType.LAZY)
	private MessageList messageList = new MessageList();
	/**入口点*/
	@Column
	private String entryPoint;
	/**外部debug开关*/
	@Column
	private Boolean debugModel;
	/**业务日期*/
	@Column
	private Date businessDate;
	/**调用类型(实时，批量)*/
	@Column
	private String callType;

	@Lob
	private String responseStr;

	public String getResponseStr() {
		return responseStr;
	}

	public void setResponseStr(String responseStr) {
		this.responseStr = responseStr;
	}

	public ProcessingHistory getProcessingHistory() {
		return processingHistory;
	}

	public void setProcessingHistory(ProcessingHistory processingHistory) {
		this.processingHistory = processingHistory;
	}

	public MessageList getMessageList() {
		return messageList;
	}

	public void setMessageList(MessageList messageList) {
		this.messageList = messageList;
	}

	public DecisionResponse getDecisionResponse() {
		return decisionResponse;
	}

	public void setDecisionResponse(DecisionResponse decisionResponse) {
		this.decisionResponse = decisionResponse;
	}

	public Date getBusinessDate() {
		return businessDate;
	}

	public void setBusinessDate(Date businessDate) {
		this.businessDate = businessDate;
	}

	public String getEntryPoint() {
		return entryPoint;
	}

	public void setEntryPoint(String entryPoint) {
		this.entryPoint = entryPoint;
	}

	public String getCallType() {
		return callType;
	}

	public void setCallType(String callType) {
		this.callType = callType;
	}

	public Boolean getDebugModel() {
		return debugModel;
	}

	public void setDebugModel(Boolean debugModel) {
		this.debugModel = debugModel;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
