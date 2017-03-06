package com.sxnd.jingshui.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.sxnd.jingshui.biz.CompanyBiz;
import com.sxnd.jingshui.entity.Company;

public class CompanyAction extends ActionSupport {
	private Company company;
	private CompanyBiz companyBiz;
	private List<Company> companyList;
	
	//公司简介
	public String findcompanygsjj() throws Exception {
		System.out.println("aaaaaaaaaaaaaa");
		try{
			company = companyBiz.findCompany();
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return "findCompanygsjj_success";
	}
	
	//联系我们
	public String findcompanylxwm() throws Exception {
		System.out.println("bbbbbbbbbbbbb");
		try{
			company = companyBiz.findCompany();
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return "findCompanylxwm_success";
	}
	
	//关于我们
	public String findcompanygywm() throws Exception {
		try{
			company = companyBiz.findCompany();
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return "findCompanygywm_success";
	}
	//发展历程
	public String findcompanyfzlc() throws Exception {
		try{
			company = companyBiz.findCompany();
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return "findCompanyfzlc_success";
	}
	

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public CompanyBiz getCompanyBiz() {
		return companyBiz;
	}

	public void setCompanyBiz(CompanyBiz companyBiz) {
		this.companyBiz = companyBiz;
	}

	public List<Company> getCompanyList() {
		return companyList;
	}

	public void setCompanyList(List<Company> companyList) {
		this.companyList = companyList;
	}
	
	

}
