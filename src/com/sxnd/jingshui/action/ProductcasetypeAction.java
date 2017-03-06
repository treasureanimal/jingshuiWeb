package com.sxnd.jingshui.action;

import com.opensymphony.xwork2.ActionSupport;
import com.sxnd.jingshui.biz.ProductcasetypeBiz;


public class ProductcasetypeAction extends ActionSupport {
	private ProductcasetypeBiz productcasetypeBiz;
	
	
	public String addproductcasetype() throws Exception {
		// TODO Auto-generated method stub
		return super.execute();
	}
	public String udpateproductcasetype() throws Exception {
		// TODO Auto-generated method stub
		return super.execute();
	}
	public String deleteproductcasetype() throws Exception {
		// TODO Auto-generated method stub
		return super.execute();
	}
	public String findproductcasetype() throws Exception {
		productcasetypeBiz.findproductcasetype();
		return "findproductcasetype_success";
	}
	public ProductcasetypeBiz getProductcasetypeBiz() {
		return productcasetypeBiz;
	}
	public void setProductcasetypeBiz(ProductcasetypeBiz productcasetypeBiz) {
		this.productcasetypeBiz = productcasetypeBiz;
	}
	
}
