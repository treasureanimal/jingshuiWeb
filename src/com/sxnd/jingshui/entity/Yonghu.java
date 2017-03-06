package com.sxnd.jingshui.entity;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Yonghu entity. @author MyEclipse Persistence Tools
 */

public class Yonghu implements java.io.Serializable {

	// Fields

	private Integer yhid;
	private String yhpwd;
	private String yhname;
	private String yhemail;
	private String yhimg;
	private String yhphone;
	private String yhaddress;
	private Integer isadmin;
	private String yhsex;
	private Set questions = new HashSet(0);
	private Set orderinfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public Yonghu() {
	}

	/** minimal constructor */
	public Yonghu(String yhpwd, String yhname, String yhemail, String yhphone,
			String yhaddress, Integer isadmin, String yhsex) {
		this.yhpwd = yhpwd;
		this.yhname = yhname;
		this.yhemail = yhemail;
		this.yhphone = yhphone;
		this.yhaddress = yhaddress;
		this.isadmin = isadmin;
		this.yhsex = yhsex;
	}

	/** full constructor */
	public Yonghu(String yhpwd, String yhname, String yhemail, String yhimg,
			String yhphone, String yhaddress, Integer isadmin, String yhsex,
			Set questions, Set orderinfos) {
		this.yhpwd = yhpwd;
		this.yhname = yhname;
		this.yhemail = yhemail;
		this.yhimg = yhimg;
		this.yhphone = yhphone;
		this.yhaddress = yhaddress;
		this.isadmin = isadmin;
		this.yhsex = yhsex;
		this.questions = questions;
		this.orderinfos = orderinfos;
	}

	// Property accessors

	public Integer getYhid() {
		return this.yhid;
	}

	public void setYhid(Integer yhid) {
		this.yhid = yhid;
	}

	public String getYhpwd() {
		return this.yhpwd;
	}

	public void setYhpwd(String yhpwd) {
		this.yhpwd = yhpwd;
	}

	public String getYhname() {
		return this.yhname;
	}

	public void setYhname(String yhname) {
		this.yhname = yhname;
	}

	public String getYhemail() {
		return this.yhemail;
	}

	public void setYhemail(String yhemail) {
		this.yhemail = yhemail;
	}

	public String getYhimg() {
		return this.yhimg;
	}

	public void setYhimg(String yhimg) {
		this.yhimg = yhimg;
	}

	public String getYhphone() {
		return this.yhphone;
	}

	public void setYhphone(String yhphone) {
		this.yhphone = yhphone;
	}

	public String getYhaddress() {
		return this.yhaddress;
	}

	public void setYhaddress(String yhaddress) {
		this.yhaddress = yhaddress;
	}

	public Integer getIsadmin() {
		return this.isadmin;
	}

	public void setIsadmin(Integer isadmin) {
		this.isadmin = isadmin;
	}

	public String getYhsex() {
		return this.yhsex;
	}

	public void setYhsex(String yhsex) {
		this.yhsex = yhsex;
	}

	public Set getQuestions() {
		return this.questions;
	}

	public void setQuestions(Set questions) {
		this.questions = questions;
	}

	public Set getOrderinfos() {
		return this.orderinfos;
	}

	public void setOrderinfos(Set orderinfos) {
		this.orderinfos = orderinfos;
	}

}