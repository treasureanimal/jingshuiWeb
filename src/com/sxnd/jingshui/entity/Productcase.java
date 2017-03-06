package com.sxnd.jingshui.entity;

import java.math.BigDecimal;

/**
 * Productcase entity. @author MyEclipse Persistence Tools
 */

public class Productcase implements java.io.Serializable {

	// Fields

	private Integer pcId;
	private Productcasetype productcasetype;
	private String pcName;
	private String pcImg;

	// Constructors

	/** default constructor */
	public Productcase() {
	}

	/** full constructor */
	public Productcase(Productcasetype productcasetype, String pcName,
			String pcImg) {
		this.productcasetype = productcasetype;
		this.pcName = pcName;
		this.pcImg = pcImg;
	}

	// Property accessors

	public Integer getPcId() {
		return this.pcId;
	}

	public void setPcId(Integer pcId) {
		this.pcId = pcId;
	}

	public Productcasetype getProductcasetype() {
		return this.productcasetype;
	}

	public void setProductcasetype(Productcasetype productcasetype) {
		this.productcasetype = productcasetype;
	}

	public String getPcName() {
		return this.pcName;
	}

	public void setPcName(String pcName) {
		this.pcName = pcName;
	}

	public String getPcImg() {
		return this.pcImg;
	}

	public void setPcImg(String pcImg) {
		this.pcImg = pcImg;
	}

}