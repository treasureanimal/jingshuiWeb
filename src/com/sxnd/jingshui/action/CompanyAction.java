package com.sxnd.jingshui.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.sxnd.jingshui.biz.CompanyBiz;
import com.sxnd.jingshui.entity.Company;

public class CompanyAction extends ActionSupport {
	private Company company;
	private CompanyBiz companyBiz;
	private List<Company> companyList;
	
	//��˾���
	public String findcompanygsjj() throws Exception {
		System.out.println("aaaaaaaaaaaaaa");
		try{
			company = companyBiz.findCompany();
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return "findCompanygsjj_success";
	}
	
	//��ϵ����
	public String findcompanylxwm() throws Exception {
		System.out.println("bbbbbbbbbbbbb");
		try{
			company = companyBiz.findCompany();
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return "findCompanylxwm_success";
	}
	
	//��������
	public String findcompanygywm() throws Exception {
		try{
			company = companyBiz.findCompany();
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return "findCompanygywm_success";
	}
	//��չ����
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
