package com.sxnd.jingshui.dao.impl;

import java.util.List;


import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.sxnd.jingshui.dao.NewsDao;
import com.sxnd.jingshui.entity.Hydt;
import com.sxnd.jingshui.entity.News;

public class NewsDaoImpl extends HibernateDaoSupport implements NewsDao {

	public int addNews(News news) throws Exception {
		Session session = this.getSession();
		session.save(news);
		return 1;
	}

	public int updateNews(News news) throws Exception {
		Session session = this.getSession();
		session.update(news);
		return 1;
	}

	public int deleteNews(News news) throws Exception {
		Session session = this.getSession();
		session.delete(news);
		return 1;
	}

	public List<News> findNews(Integer page) throws Exception {
		String hqlStr = "from News";
		Session session = this.getSession();
		Query query = session.createQuery(hqlStr);
		query.setFirstResult(3*(page-1));
		query.setMaxResults(3);
		List<News> newsList =query.list();
		return newsList;
	}
	public Integer findPageCount() throws Exception {
		String hqlStr = "select count(n) from News n";
		Session session = this.getSession();
		Query query = session.createQuery(hqlStr);
		Object object=query.uniqueResult();
		int ts=Integer.parseInt(object.toString());
		int pageCount=0;
		if(ts%5==0){
			pageCount=ts/3;
			
		}else{
			pageCount=ts/3+1;
		}
		
		
		return pageCount;
	}

	public List<News> findNewsByNine() throws Exception {
		
		Session session = this.getSession();
		String hqlStr = "from News";
		Query query = session.createQuery(hqlStr);
		List<News> newsList = query.list();
		if(newsList.size()>9){
			newsList = newsList.subList(0, 10);
		}
		return newsList;
	}

	public News findNewsById(Integer id) throws Exception {
		Session session = this.getSession();
		String hqlStr = "from News n where n.NId = :nid";
		Query query = session.createQuery(hqlStr);
		query.setInteger("nid", id);
		News news = (News) query.uniqueResult();
		return news;
		
	}
}
