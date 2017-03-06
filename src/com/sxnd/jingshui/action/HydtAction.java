package com.sxnd.jingshui.action;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.sxnd.jingshui.biz.HydtBiz;
import com.sxnd.jingshui.entity.Hydt;
import com.sxnd.jingshui.entity.Product;

public class HydtAction extends ActionSupport {
	private Map session;
	private Integer pages;
	private Integer nextpage;
	private Integer backpage;
	private Integer nowpage;
	private Hydt hydt;
	private HydtBiz hydtBiz;
	private List<Hydt> hydtList;
	private Integer id;
	
	private Hydt lastHydt;
	private Hydt nextHydt;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String fenyehangyedongtai() throws Exception {
		session = ActionContext.getContext().getSession();
		if(nowpage==null ||nowpage==0){
			nowpage=1;
		}
		hydtList = hydtBiz.findHydt(nowpage);
		System.out.println("hydtList:"+hydtList);
		pages = hydtBiz.findPageCount();
		backpage = nowpage-1;
		if(backpage<1)
			backpage = 1;
		nextpage = nowpage+1;
		if(nextpage>pages)
			nextpage = pages;
		
		session.put("pages", pages);
		session.put("nowpage",nowpage);
		session.put("productList",hydtList);
		
		
		
		return "findhydt_success";
		
	}
	
	public String findhydtById() throws Exception {
		try{
			
			lastHydt = hydtBiz.findlastHydt(id);
			nextHydt = hydtBiz.findnextHydt(id);
			hydt = hydtBiz.findHydtsById(id);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return "findHydtsId_success";
	}
	
	public Map getSession() {
		return session;
	}
	public void setSession(Map session) {
		this.session = session;
	}
	public Integer getPages() {
		return pages;
	}
	public void setPages(Integer pages) {
		this.pages = pages;
	}
	public Integer getNextpage() {
		return nextpage;
	}
	public void setNextpage(Integer nextpage) {
		this.nextpage = nextpage;
	}
	public Integer getBackpage() {
		return backpage;
	}
	public void setBackpage(Integer backpage) {
		this.backpage = backpage;
	}
	public Integer getNowpage() {
		return nowpage;
	}
	public void setNowpage(Integer nowpage) {
		this.nowpage = nowpage;
	}
	public Hydt getHydt() {
		return hydt;
	}
	public void setHydt(Hydt hydt) {
		this.hydt = hydt;
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

	public Hydt getLastHydt() {
		return lastHydt;
	}

	public void setLastHydt(Hydt lastHydt) {
		this.lastHydt = lastHydt;
	}

	public Hydt getNextHydt() {
		return nextHydt;
	}

	public void setNextHydt(Hydt nextHydt) {
		this.nextHydt = nextHydt;
	}
	
	
}
