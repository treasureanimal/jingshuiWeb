package com.sxnd.jingshui.action;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.sxnd.jingshui.biz.ProductcaseBiz;
import com.sxnd.jingshui.biz.ProductcasetypeBiz;
import com.sxnd.jingshui.entity.Productcase;
import com.sxnd.jingshui.entity.Productcasetype;

public class ProductcaseAction extends ActionSupport {
	
	private ProductcaseBiz productcaseBiz;
	private Productcase productcase; 
	private Integer pctid;
	private Map session;
	private Integer nowpage;
	private Integer pages;
	private Integer backpage;
	private Integer nextpage;
	private List<Productcase> productcaseList;
	private List<Productcasetype> productcasetypeList;
	private ProductcasetypeBiz productcasetypeBiz;
	private Integer pcid;
	
	
	
	public String addProductcase() {
		
		try{
			productcaseBiz.addproductcase(productcase);
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return "addProductcase_success";
	}
	
	public String updateProductcase(){
		try{
			productcaseBiz.updateproductcase(productcase);
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return "updateProductcase_success";
		
	}
	public String deleteProductcase(){
		try{
			productcaseBiz.deleteproductcase(productcase);
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return "deleteProductcase_success";
		
	}
	public String findproductcase(){
		try{
			
			session = ActionContext.getContext().getSession();
			
			if(nowpage==null || nowpage==0){
				nowpage=1;	
			}
			
			productcaseList = productcaseBiz.findProductcase(nowpage, pctid);
			System.out.println("productcaseList£º"+productcaseList);
			productcasetypeList = productcasetypeBiz.findproductcasetype();
			pages = productcaseBiz.findProductcasepages(pctid);
			
			backpage = nowpage-1;
			if(backpage<1)
				backpage = 1;
			nextpage = nowpage-1;
			if(nextpage>pages)
				nextpage = pages;
			System.out.println("bbbbbbb");
			session.put("productcaseList", productcaseList);

			
			
		}catch(Exception ex){
			ex.printStackTrace();
			
		}
		return "findproductcase_success";
		
	}
	public String findproductcaseByPcId(){
		
		try {
			productcase = productcaseBiz.findProductcaseByPcId(pcid);
			productcasetypeList = productcasetypeBiz.findproductcasetype();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "findProductcaseByPcId_success";
		
	}

	public ProductcaseBiz getProductcaseBiz() {
		return productcaseBiz;
	}

	public void setProductcaseBiz(ProductcaseBiz productcaseBiz) {
		this.productcaseBiz = productcaseBiz;
	}

	public Productcase getProductcase() {
		return productcase;
	}

	public void setProductcase(Productcase productcase) {
		this.productcase = productcase;
	}

	public Integer getPctid() {
		return pctid;
	}

	public void setPctid(Integer pctid) {
		this.pctid = pctid;
	}

	public Map getSession() {
		return session;
	}

	public void setSession(Map session) {
		this.session = session;
	}

	public Integer getNowpage() {
		return nowpage;
	}

	public void setNowpage(Integer nowpage) {
		this.nowpage = nowpage;
	}

	public Integer getPages() {
		return pages;
	}

	public void setPages(Integer pages) {
		this.pages = pages;
	}

	public Integer getBackpage() {
		return backpage;
	}

	public void setBackpage(Integer backpage) {
		this.backpage = backpage;
	}

	public Integer getNextpage() {
		return nextpage;
	}

	public void setNextpage(Integer nextpage) {
		this.nextpage = nextpage;
	}

	public List<Productcase> getProductcaseList() {
		return productcaseList;
	}

	public void setProductcaseList(List<Productcase> productcaseList) {
		this.productcaseList = productcaseList;
	}

	public List<Productcasetype> getProductcasetypeList() {
		return productcasetypeList;
	}

	public void setProductcasetypeList(List<Productcasetype> productcasetypeList) {
		this.productcasetypeList = productcasetypeList;
	}

	public ProductcasetypeBiz getProductcasetypeBiz() {
		return productcasetypeBiz;
	}

	public void setProductcasetypeBiz(ProductcasetypeBiz productcasetypeBiz) {
		this.productcasetypeBiz = productcasetypeBiz;
	}

	public Integer getPcid() {
		return pcid;
	}

	public void setPcid(Integer pcid) {
		this.pcid = pcid;
	}
	
	
	
	
}
