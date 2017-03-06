package com.sxnd.jingshui.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Orderdetail entity. @author MyEclipse Persistence Tools
 */

public class Orderdetail implements java.io.Serializable {

	// Fields

	private Integer odid;
	private Product product;
	private Orderinfo orderinfo;
	private Integer odnumber;
	private Date oddate;

	// Constructors

	/** default constructor */
	public Orderdetail() {
	}

	/** minimal constructor */
	public Orderdetail(Orderinfo orderinfo, Integer odnumber) {
		this.orderinfo = orderinfo;
		this.odnumber = odnumber;
	}

	/** full constructor */
	public Orderdetail(Product product, Orderinfo orderinfo,
			Integer odnumber, Date oddate) {
		this.product = product;
		this.orderinfo = orderinfo;
		this.odnumber = odnumber;
		this.oddate = oddate;
	}

	// Property accessors

	public Integer getOdid() {
		return this.odid;
	}

	public void setOdid(Integer odid) {
		this.odid = odid;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Orderinfo getOrderinfo() {
		return this.orderinfo;
	}

	public void setOrderinfo(Orderinfo orderinfo) {
		this.orderinfo = orderinfo;
	}

	public Integer getOdnumber() {
		return this.odnumber;
	}

	public void setOdnumber(Integer odnumber) {
		this.odnumber = odnumber;
	}

	public Date getOddate() {
		return this.oddate;
	}

	public void setOddate(Date oddate) {
		this.oddate = oddate;
	}

}