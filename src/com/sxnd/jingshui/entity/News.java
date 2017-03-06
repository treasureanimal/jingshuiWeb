package com.sxnd.jingshui.entity;

import java.sql.Timestamp;
import java.util.Date;

/**
 * News entity. @author MyEclipse Persistence Tools
 */

public class News implements java.io.Serializable {

	// Fields

	private Integer NId;
	private String NWriter;
	private String NTitle;
	private String NContent;
	private String NImg;
	private Date NDate;

	// Constructors

	/** default constructor */
	public News() {
	}

	/** full constructor */
	public News(String NWriter, String NTitle, String NContent, String NImg,
			Date NDate) {
		this.NWriter = NWriter;
		this.NTitle = NTitle;
		this.NContent = NContent;
		this.NImg = NImg;
		this.NDate = NDate;
	}

	// Property accessors

	public Integer getNId() {
		return this.NId;
	}

	public void setNId(Integer NId) {
		this.NId = NId;
	}

	public String getNWriter() {
		return this.NWriter;
	}

	public void setNWriter(String NWriter) {
		this.NWriter = NWriter;
	}

	public String getNTitle() {
		return this.NTitle;
	}

	public void setNTitle(String NTitle) {
		this.NTitle = NTitle;
	}

	public String getNContent() {
		return this.NContent;
	}

	public void setNContent(String NContent) {
		this.NContent = NContent;
	}

	public String getNImg() {
		return this.NImg;
	}

	public void setNImg(String NImg) {
		this.NImg = NImg;
	}

	public Date getNDate() {
		return this.NDate;
	}

	public void setNDate(Date NDate) {
		this.NDate = NDate;
	}

	@Override
	public String toString() {
		return "News [NId=" + NId + "]";
	}
	
	  
}