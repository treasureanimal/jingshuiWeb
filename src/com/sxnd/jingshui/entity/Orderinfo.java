package com.sxnd.jingshui.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Orderinfo entity. @author MyEclipse Persistence Tools
 */

public class Orderinfo implements java.io.Serializable {

	// Fields

	private Integer oiid;
	private Yonghu yonghu;
	private Integer total;
	private String oiaddress;
	private String oiname;
	private String oiphone;
	private Date oidate;
	private Set orderdetails = new HashSet(0);

	// Constructors

	/** default constructor */
	public Orderinfo() {
	}

	/** minimal constructor */
	public Orderinfo(Integer total, String oiaddress, String oiname,
			String oiphone) {
		this.total = total;
		this.oiaddress = oiaddress;
		this.oiname = oiname;
		this.oiphone = oiphone;
	}

	/** full constructor */
	public Orderinfo(Yonghu yonghu, Integer total, String oiaddress,
			String oiname, String oiphone, Date oidate, Set orderdetails) {
		this.yonghu = yonghu;
		this.total = total;
		this.oiaddress = oiaddress;
		this.oiname = oiname;
		this.oiphone = oiphone;
		this.oidate = oidate;
		this.orderdetails = orderdetails;
	}

	// Property accessors

	public Integer getOiid() {
		return this.oiid;
	}

	public void setOiid(Integer oiid) {
		this.oiid = oiid;
	}

	public Yonghu getYonghu() {
		return this.yonghu;
	}

	public void setYonghu(Yonghu yonghu) {
		this.yonghu = yonghu;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public String getOiaddress() {
		return this.oiaddress;
	}

	public void setOiaddress(String oiaddress) {
		this.oiaddress = oiaddress;
	}

	public String getOiname() {
		return this.oiname;
	}

	public void setOiname(String oiname) {
		this.oiname = oiname;
	}

	public String getOiphone() {
		return this.oiphone;
	}

	public void setOiphone(String oiphone) {
		this.oiphone = oiphone;
	}

	public Date getOidate() {
		return this.oidate;
	}

	public void setOidate(Date oidate) {
		this.oidate = oidate;
	}

	public Set getOrderdetails() {
		return this.orderdetails;
	}

	public void setOrderdetails(Set orderdetails) {
		this.orderdetails = orderdetails;
	}

}