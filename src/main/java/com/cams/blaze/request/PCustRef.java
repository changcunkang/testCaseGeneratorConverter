package com.cams.blaze.request;

import javax.persistence.*;
import java.util.Date;

@Entity
public class PCustRef {
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE)

	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	@Column
	private Date pDate;
	@Column
	private String custRef;

	public Date getpDate() {
		return pDate;
	}

	public void setpDate(Date pDate) {
		this.pDate = pDate;
	}

	public String getCustRef() {
		return custRef;
	}
	public void setCustRef(String custRef) {
		this.custRef = custRef;
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
