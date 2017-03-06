package com.sxnd.jingshui.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Question entity. @author MyEclipse Persistence Tools
 */

public class Question implements java.io.Serializable {

	// Fields

	private Integer QId;
	private Yonghu yonghu;
	private String QContent;
	private Integer QStatus;
	private Date QDate;
	private Set answers = new HashSet(0);

	// Constructors

	/** default constructor */
	public Question() {
	}

	/** minimal constructor */
	public Question(Integer QStatus) {
		this.QStatus = QStatus;
	}

	/** full constructor */
	public Question(Yonghu yonghu, String QContent, Integer QStatus,
			Date QDate, Set answers) {
		this.yonghu = yonghu;
		this.QContent = QContent;
		this.QStatus = QStatus;
		this.QDate = QDate;
		this.answers = answers;
	}

	// Property accessors

	public Integer getQId() {
		return this.QId;
	}

	public void setQId(Integer QId) {
		this.QId = QId;
	}

	public Yonghu getYonghu() {
		return this.yonghu;
	}

	public void setYonghu(Yonghu yonghu) {
		this.yonghu = yonghu;
	}

	public String getQContent() {
		return this.QContent;
	}

	public void setQContent(String QContent) {
		this.QContent = QContent;
	}

	public Integer getQStatus() {
		return this.QStatus;
	}

	public void setQStatus(Integer QStatus) {
		this.QStatus = QStatus;
	}

	public Date getQDate() {
		return this.QDate;
	}

	public void setQDate(Date QDate) {
		this.QDate = QDate;
	}

	public Set getAnswers() {
		return this.answers;
	}

	public void setAnswers(Set answers) {
		this.answers = answers;
	}

}