package com.sxnd.jingshui.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Product entity. @author MyEclipse Persistence Tools
 */

public class Product implements java.io.Serializable {

	// Fields

	private Integer PId;
	private Producttype producttype;
	private String PName;
	private Integer PUsernumber;
	private String PVolume;
	private String PWate;
	private String PLine;
	private String PSystem;
	private String PYield;
	private String PKpa;
	private String PImg;
	private Integer PKucun;
	private Set orderdetails = new HashSet(0);

	// Constructors

	/** default constructor */
	public Product() {
	}

	/** full constructor */
	public Product(Producttype producttype, String PName, Integer PUsernumber,
			String PVolume, String PWate, String PLine, String PSystem,
			String PYield, String PKpa, String PImg, Integer PKucun,
			Set orderdetails) {
		this.producttype = producttype;
		this.PName = PName;
		this.PUsernumber = PUsernumber;
		this.PVolume = PVolume;
		this.PWate = PWate;
		this.PLine = PLine;
		this.PSystem = PSystem;
		this.PYield = PYield;
		this.PKpa = PKpa;
		this.PImg = PImg;
		this.PKucun = PKucun;
		this.orderdetails = orderdetails;
	}

	// Property accessors

	public Integer getPId() {
		return this.PId;
	}

	public void setPId(Integer PId) {
		this.PId = PId;
	}

	public Producttype getProducttype() {
		return this.producttype;
	}

	public void setProducttype(Producttype producttype) {
		this.producttype = producttype;
	}

	public String getPName() {
		return this.PName;
	}

	public void setPName(String PName) {
		this.PName = PName;
	}

	public Integer getPUsernumber() {
		return this.PUsernumber;
	}

	public void setPUsernumber(Integer PUsernumber) {
		this.PUsernumber = PUsernumber;
	}

	public String getPVolume() {
		return this.PVolume;
	}

	public void setPVolume(String PVolume) {
		this.PVolume = PVolume;
	}

	public String getPWate() {
		return this.PWate;
	}

	public void setPWate(String PWate) {
		this.PWate = PWate;
	}

	public String getPLine() {
		return this.PLine;
	}

	public void setPLine(String PLine) {
		this.PLine = PLine;
	}

	public String getPSystem() {
		return this.PSystem;
	}

	public void setPSystem(String PSystem) {
		this.PSystem = PSystem;
	}

	public String getPYield() {
		return this.PYield;
	}

	public void setPYield(String PYield) {
		this.PYield = PYield;
	}

	public String getPKpa() {
		return this.PKpa;
	}

	public void setPKpa(String PKpa) {
		this.PKpa = PKpa;
	}

	public String getPImg() {
		return this.PImg;
	}

	public void setPImg(String PImg) {
		this.PImg = PImg;
	}

	public Integer getPKucun() {
		return this.PKucun;
	}

	public void setPKucun(Integer PKucun) {
		this.PKucun = PKucun;
	}

	public Set getOrderdetails() {
		return this.orderdetails;
	}

	public void setOrderdetails(Set orderdetails) {
		this.orderdetails = orderdetails;
	}

	
	
}