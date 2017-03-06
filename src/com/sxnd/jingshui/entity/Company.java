package com.sxnd.jingshui.entity;

import java.math.BigDecimal;

/**
 * Company entity. @author MyEclipse Persistence Tools
 */

public class Company implements java.io.Serializable {

	// Fields

	private Integer CId;
	private String CFzlc;
	private String CGsjz;
	private String CGywm;
	private String CName;
	private String CQgphone;
	private String CPhone;
	private String CFax;
	private String CMpbilephone;
	private String CEmail;
	private String CWebsite;
	private String CAddress;
	private String CImg;

	// Constructors

	/** default constructor */
	public Company() {
	}

	/** full constructor */
	public Company(String CFzlc, String CGsjz, String CGywm, String CName,
			String CQgphone, String CPhone, String CFax, String CMpbilephone,
			String CEmail, String CWebsite, String CAddress, String CImg) {
		this.CFzlc = CFzlc;
		this.CGsjz = CGsjz;
		this.CGywm = CGywm;
		this.CName = CName;
		this.CQgphone = CQgphone;
		this.CPhone = CPhone;
		this.CFax = CFax;
		this.CMpbilephone = CMpbilephone;
		this.CEmail = CEmail;
		this.CWebsite = CWebsite;
		this.CAddress = CAddress;
		this.CImg = CImg;
	}

	// Property accessors

	public Integer getCId() {
		return this.CId;
	}

	public void setCId(Integer CId) {
		this.CId = CId;
	}

	public String getCFzlc() {
		return this.CFzlc;
	}

	public void setCFzlc(String CFzlc) {
		this.CFzlc = CFzlc;
	}

	public String getCGsjz() {
		return this.CGsjz;
	}

	public void setCGsjz(String CGsjz) {
		this.CGsjz = CGsjz;
	}

	public String getCGywm() {
		return this.CGywm;
	}

	public void setCGywm(String CGywm) {
		this.CGywm = CGywm;
	}

	public String getCName() {
		return this.CName;
	}

	public void setCName(String CName) {
		this.CName = CName;
	}

	public String getCQgphone() {
		return this.CQgphone;
	}

	public void setCQgphone(String CQgphone) {
		this.CQgphone = CQgphone;
	}

	public String getCPhone() {
		return this.CPhone;
	}

	public void setCPhone(String CPhone) {
		this.CPhone = CPhone;
	}

	public String getCFax() {
		return this.CFax;
	}

	public void setCFax(String CFax) {
		this.CFax = CFax;
	}

	public String getCMpbilephone() {
		return this.CMpbilephone;
	}

	public void setCMpbilephone(String CMpbilephone) {
		this.CMpbilephone = CMpbilephone;
	}

	public String getCEmail() {
		return this.CEmail;
	}

	public void setCEmail(String CEmail) {
		this.CEmail = CEmail;
	}

	public String getCWebsite() {
		return this.CWebsite;
	}

	public void setCWebsite(String CWebsite) {
		this.CWebsite = CWebsite;
	}

	public String getCAddress() {
		return this.CAddress;
	}

	public void setCAddress(String CAddress) {
		this.CAddress = CAddress;
	}

	public String getCImg() {
		return this.CImg;
	}

	public void setCImg(String CImg) {
		this.CImg = CImg;
	}

}