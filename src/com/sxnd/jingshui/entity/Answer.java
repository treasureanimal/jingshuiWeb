package com.sxnd.jingshui.entity;

import java.sql.Timestamp;
import java.util.Date;

/**
 * Answer entity. @author MyEclipse Persistence Tools
 */

public class Answer implements java.io.Serializable {

	// Fields

	private Integer AId;
	private Question question;
	private String AContent;
	private Date ADate;

	// Constructors

	/** default constructor */
	public Answer() {
	}

	/** full constructor */
	public Answer(Question question, String AContent, Date ADate) {
		this.question = question;
		this.AContent = AContent;
		this.ADate = ADate;
	}

	// Property accessors

	public Integer getAId() {
		return this.AId;
	}

	public void setAId(Integer AId) {
		this.AId = AId;
	}

	public Question getQuestion() {
		return this.question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public String getAContent() {
		return this.AContent;
	}

	public void setAContent(String AContent) {
		this.AContent = AContent;
	}

	public Date getADate() {
		return this.ADate;
	}

	public void setADate(Date ADate) {
		this.ADate = ADate;
	}

}