package com.sxnd.jingshui.biz.impl;

import java.util.List;



import com.sxnd.jingshui.biz.NewsBiz;
import com.sxnd.jingshui.dao.NewsDao;
import com.sxnd.jingshui.entity.Hydt;
import com.sxnd.jingshui.entity.News;

public class NewsBizImpl  implements NewsBiz {
	private NewsDao newsDao;
	public int addNews(News news) throws Exception {
		
		return newsDao.addNews(news);
	}

	public int deleteNews(News news) throws Exception {
		
		return newsDao.deleteNews(news);
	}

	public List<News> findNews(Integer page) throws Exception {
		List<News> newsList = newsDao.findNews(page);
		for (News news : newsList) {
			String content = news.getNContent();
			//遍历出来的题目只能显示22个长度
			if(content.length()>107){
				content = content.substring(0,108);
				content+="...";
				news.setNContent(content);
			}
		}
		return newsList;
	}

	public Integer findPageCount() throws Exception {
		// TODO Auto-generated method stub
		return newsDao.findPageCount();
	}

	public int updateNews(News news) throws Exception {
		// TODO Auto-generated method stub
		return newsDao.updateNews(news);
	}

	public NewsDao getNewsDao() {
		return newsDao;
	}

	public void setNewsDao(NewsDao newsDao) {
		this.newsDao = newsDao;
	}

	public List<News> findNewsByNine() throws Exception {
		List<News> newsList = newsDao.findNewsByNine();
		for (News news : newsList) {
			String title = news.getNTitle();
			//遍历出来的题目只能显示22个长度
			if(title.length()>22){
				title = title.substring(0,23);
				title+="...";
				news.setNTitle(title);
			}
		}
		return newsList;
	}

	public News findNewsById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return newsDao.findNewsById(id);
	}

	public News findlastNews(Integer id) throws Exception {
		System.out.println("进入findlastNews");
		 
		News lastNews = null;
		int num = 1;
		do {
			lastNews = newsDao.findNewsById(id-num);
			System.out.println("do----lastNews"+lastNews);
			if(lastNews != null) {
				System.out.println("lastNews != null");
				break;
			} 
			System.out.println("nnnn");
			num++; 
		} while (lastNews == null&&num<id);
		System.out.println("lastNews:"+lastNews);
		return lastNews;
	}

	public News findnextNews(Integer id) throws Exception {
		System.out.println("进入findnextNews");
	
		News nextNews = null;
		int num = 1;
		do {
			nextNews = newsDao.findNewsById(id+num);
			System.out.println("do----nextNews"+nextNews);
			if(nextNews != null) {
				break;
			}
			num++;
		} while (nextNews == null&&num<id);
		System.out.println("nextNews:"+nextNews);
		return nextNews;
	}

}
