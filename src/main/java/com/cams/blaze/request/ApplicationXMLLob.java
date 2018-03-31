package com.cams.blaze.request;

import com.cams.blaze.response.DecisionResponse;
import com.cams.blaze.response.MessageList;
import com.cams.blaze.response.ProcessingHistory;

import javax.persistence.*;
import java.util.Date;

@Entity
public class ApplicationXMLLob {


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

	@Lob
	private String responseStr;

	public String getResponseStr() {
		return responseStr;
	}

	public void setResponseStr(String responseStr) {
		this.responseStr = responseStr;
	}
}
