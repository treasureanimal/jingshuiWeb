package com.sxnd.jingshui.entity;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Productcasetype entity. @author MyEclipse Persistence Tools
 */

public class Productcasetype implements java.io.Serializable {

	// Fields

	private Integer pctId;
	private String pctName;
	private Set productcases = new HashSet(0);

	// Constructors

	/** default constructor */
	public Productcasetype() {
	}

	/** full constructor */
	public Productcasetype(String pctName, Set productcases) {
		this.pctName = pctName;
		this.productcases = productcases;
	}

	// Property accessors

	public Integer getPctId() {
		return this.pctId;
	}

	public void setPctId(Integer pctId) {
		this.pctId = pctId;
	}

	public String getPctName() {
		return this.pctName;
	}

	public void setPctName(String pctName) {
		this.pctName = pctName;
	}

	public Set getProductcases() {
		return this.productcases;
	}

	public void setProductcases(Set productcases) {
		this.productcases = productcases;
	}

}