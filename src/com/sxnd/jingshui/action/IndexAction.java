package com.sxnd.jingshui.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.sxnd.jingshui.biz.HydtBiz;
import com.sxnd.jingshui.biz.NewsBiz;
import com.sxnd.jingshui.biz.ProductBiz;
import com.sxnd.jingshui.biz.ProductcaseBiz;
import com.sxnd.jingshui.biz.ProducttypeBiz;
import com.sxnd.jingshui.entity.Hydt;
import com.sxnd.jingshui.entity.News;
import com.sxnd.jingshui.entity.Product;
import com.sxnd.jingshui.entity.Productcase;
import com.sxnd.jingshui.entity.Producttype;

/*@SuppressWarnings("serial")*/
public class IndexAction extends ActionSupport {
	
	private ProductBiz productBiz;
	private List<Product> productList;	
	private ProductcaseBiz productcaseBiz;
	private List<Productcase> productCaseList;
	private List<Producttype> producttypeList;
	private ProducttypeBiz producttypeBiz;
	private NewsBiz newsBiz;
	private HydtBiz hydtBiz;
	private Integer pages;//总页数
	private Integer nowpage;//查询页码
	private Integer nextpage;//下一页
	private Integer lastpage;//上一页
	
	private List<Hydt> hydtList;
	private List<News> newsList;
	
	private Hydt hydtLeft;
	private News newsLeft;
	

	
	public String toIndex(){
		
		try {
			System.out.println("aaa");
			//查询全部分页
			if(nowpage == null || nowpage == 0) {
				nowpage = 1;
			}
			producttypeList = producttypeBiz.findproducttype();
			productList = productBiz.findproduct(nowpage, null);
			System.out.println("productList+"+productList);
			productCaseList = productcaseBiz.findProductcase(nowpage, null);
			System.out.println("productcaseList:"+productCaseList);
			pages = productBiz.findProductpages(null);
			//处理页码
			nextpage = nowpage+1;
			if(nextpage > pages) {
				nextpage = pages;
			}
			lastpage = nowpage - 1;
			if(lastpage < 1) {
				lastpage = 1;
			}
			System.out.println("aaa");
			//显示行业动态
			hydtList = hydtBiz.findHydtsByNine();
			if(hydtList.size() > 0){
				hydtLeft = hydtList.get(0);
				
			}
			//显示新闻
			newsList = newsBiz.findNewsByNine();
			System.out.println("newsList:"+newsList.size());
			if(newsList.size()>0){
				newsLeft = newsList.get(0);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "toindex_success";
	}
	

	public ProductBiz getProductBiz() {
		return productBiz;
	}


	public void setProductBiz(ProductBiz productBiz) {
		this.productBiz = productBiz;
	}


	public List<Product> getProductList() {
		return productList;
	}


	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}


	public Integer getPages() {
		return pages;
	}


	public void setPages(Integer pages) {
		this.pages = pages;
	}


	public Integer getNowpage() {
		return nowpage;
	}


	public void setNowpage(Integer nowpage) {
		this.nowpage = nowpage;
	}


	public Integer getNextpage() {
		return nextpage;
	}


	public void setNextpage(Integer nextpage) {
		this.nextpage = nextpage;
	}


	public Integer getLastpage() {
		return lastpage;
	}


	public void setLastpage(Integer lastpage) {
		this.lastpage = lastpage;
	}


	public ProductcaseBiz getProductcaseBiz() {
		return productcaseBiz;
	}


	public void setProductcaseBiz(ProductcaseBiz productcaseBiz) {
		this.productcaseBiz = productcaseBiz;
	}


	public List<Productcase> getProductCaseList() {
		return productCaseList;
	}


	public void setProductCaseList(List<Productcase> productCaseList) {
		this.productCaseList = productCaseList;
	}


	public List<Producttype> getProducttypeList() {
		return producttypeList;
	}


	public void setProducttypeList(List<Producttype> producttypeList) {
		this.producttypeList = producttypeList;
	}


	public ProducttypeBiz getProducttypeBiz() {
		return producttypeBiz;
	}


	public void setProducttypeBiz(ProducttypeBiz producttypeBiz) {
		this.producttypeBiz = producttypeBiz;
	}

	public HydtBiz getHydtBiz() {
		return hydtBiz;
	}

	public void setHydtBiz(HydtBiz hydtBiz) {
		this.hydtBiz = hydtBiz;
	}

	public List<Hydt> getHydtList() {
		return hydtList;
	}

	public void setHydtList(List<Hydt> hydtList) {
		this.hydtList = hydtList;
	}

	public Hydt getHydtLeft() {
		return hydtLeft;
	}

	public void setHydtLeft(Hydt hydtLeft) {
		this.hydtLeft = hydtLeft;
	}


	public NewsBiz getNewsBiz() {
		return newsBiz;
	}


	public void setNewsBiz(NewsBiz newsBiz) {
		this.newsBiz = newsBiz;
	}


	public List<News> getNewsList() {
		return newsList;
	}


	public void setNewsList(List<News> newsList) {
		this.newsList = newsList;
	}


	public News getNewsLeft() {
		return newsLeft;
	}


	public void setNewsLeft(News newsLeft) {
		this.newsLeft = newsLeft;
	}
	
	
}
