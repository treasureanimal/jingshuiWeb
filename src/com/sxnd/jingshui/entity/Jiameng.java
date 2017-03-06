package com.sxnd.jingshui.entity;

import java.math.BigDecimal;

/**
 * Jiameng entity. @author MyEclipse Persistence Tools
 */

public class Jiameng implements java.io.Serializable {

	// Fields

	private Integer jmId;
	private String jmTj;
	private String jmYs;

	// Constructors

	/** default constructor */
	public Jiameng() {
	}

	/** full constructor */
	public Jiameng(String jmTj, String jmYs) {
		this.jmTj = jmTj;
		this.jmYs = jmYs;
	}

	// Property accessors

	public Integer getJmId() {
		return this.jmId;
	}

	public void setJmId(Integer jmId) {
		this.jmId = jmId;
	}

	public String getJmTj() {
		return this.jmTj;
	}

	public void setJmTj(String jmTj) {
		this.jmTj = jmTj;
	}

	public String getJmYs() {
		return this.jmYs;
	}

	public void setJmYs(String jmYs) {
		this.jmYs = jmYs;
	}

}