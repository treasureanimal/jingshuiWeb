package com.sxnd.jingshui.entity;

import java.sql.Timestamp;

/**
 * Hydt entity. @author MyEclipse Persistence Tools
 */

public class Hydt implements java.io.Serializable {

	// Fields

	private Integer HId;
	private String HTitle;
	private String HImg;
	private Timestamp HDate;
	private String HContent;

	// Constructors

	/** default constructor */
	public Hydt() {
	}

	/** full constructor */
	public Hydt(String HTitle, String HImg, Timestamp HDate, String HContent) {
		this.HTitle = HTitle;
		this.HImg = HImg;
		this.HDate = HDate;
		this.HContent = HContent;
	}

	// Property accessors

	public Integer getHId() {
		return this.HId;
	}

	public void setHId(Integer HId) {
		this.HId = HId;
	}

	public String getHTitle() {
		return this.HTitle;
	}

	public void setHTitle(String HTitle) {
		this.HTitle = HTitle;
	}

	public String getHImg() {
		return this.HImg;
	}

	public void setHImg(String HImg) {
		this.HImg = HImg;
	}

	public Timestamp getHDate() {
		return this.HDate;
	}

	public void setHDate(Timestamp HDate) {
		this.HDate = HDate;
	}

	public String getHContent() {
		return this.HContent;
	}

	public void setHContent(String HContent) {
		this.HContent = HContent;
	}

	@Override
	public String toString() {
		return "Hydt [HContent=" + HContent + ", HDate=" + HDate + ", HId="
				+ HId + ", HImg=" + HImg + ", HTitle=" + HTitle + "]";
	}

}