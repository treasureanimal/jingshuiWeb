package com.sxnd.jingshui.entity;


import java.util.HashSet;
import java.util.Set;

/**
 * Producttype entity. @author MyEclipse Persistence Tools
 */

public class Producttype implements java.io.Serializable {

	// Fields

	private Integer ptId;
	private String ptName;
	private String ptImg;
	private Set products = new HashSet(0);

	// Constructors

	/** default constructor */
	public Producttype() {
	}

	/** full constructor */
	public Producttype(String ptName, String ptImg, Set products) {
		this.ptName = ptName;
		this.ptImg = ptImg;
		this.products = products;
	}

	// Property accessors

	public Integer getPtId() {
		return this.ptId;
	}

	public void setPtId(Integer ptId) {
		this.ptId = ptId;
	}

	public String getPtName() {
		return this.ptName;
	}

	public void setPtName(String ptName) {
		this.ptName = ptName;
	}

	public String getPtImg() {
		return this.ptImg;
	}

	public void setPtImg(String ptImg) {
		this.ptImg = ptImg;
	}

	public Set getProducts() {
		return this.products;
	}

	public void setProducts(Set products) {
		this.products = products;
	}

}