package com.sxnd.jingshui.action;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.sxnd.jingshui.biz.NewsBiz;
import com.sxnd.jingshui.entity.News;

public class NewsAction extends ActionSupport {
	private NewsBiz newsBiz;
	private Map session;
	private Integer pages;
	private Integer nextpage;
	private Integer backpage;
	private Integer nowpage;
	private News news;
	private Integer id;
	private News  nextnews;
	private News lastnews;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String find(){
		System.out.println("aaaaaaaaa");
		session = ActionContext.getContext().getSession();
		try{
			if(nowpage==null||nowpage==0){
				nowpage=1;
			}
			List<News> newList = newsBiz.findNews(nowpage);
			pages = newsBiz.findPageCount();
			backpage = nowpage-1;
			if(backpage<1)
				backpage = 1;
			nextpage = nowpage+1;
			if(nextpage>pages)
				nextpage = pages;
		
			session.put("pages", pages);
			session.put("nowpage", nowpage);
			session.put("newList", newList);
			}catch(Exception e){
				e.printStackTrace();
			}
			return "findnews_success";
			
		}
	
	public String findnewsById() throws Exception {
		try{
			news = newsBiz.findNewsById(id);
			lastnews = newsBiz.findlastNews(id);
			nextnews = newsBiz.findnextNews(id);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return "findNewsById_success";
	}
	public NewsBiz getNewsBiz() {
		return newsBiz;
	}
	public void setNewsBiz(NewsBiz newsBiz) {
		this.newsBiz = newsBiz;
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
	public News getNews() {
		return news;
	}
	public void setNews(News news) {
		this.news = news;
	}

	public News getNextnews() {
		return nextnews;
	}

	public void setNextnews(News nextnews) {
		this.nextnews = nextnews;
	}

	public News getLastnews() {
		return lastnews;
	}

	public void setLastnews(News lastnews) {
		this.lastnews = lastnews;
	}
	
	
	
	
}
