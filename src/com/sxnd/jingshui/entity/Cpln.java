package com.sxnd.jingshui.entity;

import java.math.BigDecimal;

/**
 * Cpln entity. @author MyEclipse Persistence Tools
 */

public class Cpln implements java.io.Serializable {

	// Fields

	private Integer cplnId;
	private String cplnName;
	private String cplnContent;

	// Constructors

	/** default constructor */
	public Cpln() {
	}

	/** full constructor */
	public Cpln(String cplnName, String cplnContent) {
		this.cplnName = cplnName;
		this.cplnContent = cplnContent;
	}

	// Property accessors

	public Integer getCplnId() {
		return this.cplnId;
	}

	public void setCplnId(Integer cplnId) {
		this.cplnId = cplnId;
	}

	public String getCplnName() {
		return this.cplnName;
	}

	public void setCplnName(String cplnName) {
		this.cplnName = cplnName;
	}

	public String getCplnContent() {
		return this.cplnContent;
	}

	public void setCplnContent(String cplnContent) {
		this.cplnContent = cplnContent;
	}

}