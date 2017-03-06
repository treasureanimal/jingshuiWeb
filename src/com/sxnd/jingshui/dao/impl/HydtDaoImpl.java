package com.sxnd.jingshui.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.sxnd.jingshui.dao.HydtDao;
import com.sxnd.jingshui.entity.Hydt;
import com.sxnd.jingshui.entity.News;

public class HydtDaoImpl extends HibernateDaoSupport implements HydtDao {

	public int addHydt(Hydt hydt) throws Exception {
		Session session = this.getSession();
		session.save(hydt);
		return 1;
	}

	public int updateHydt(Hydt hydt) throws Exception {
		Session session = this.getSession();
		session.update(hydt);
		return 1;
	}

	public int deleteHydt(Hydt hydt) throws Exception {
		Session session = this.getSession();
		session.delete(hydt);
		return 1;
	}

	public List<Hydt> findHydt(Integer page) throws Exception {
		String hqlStr = "from Hydt";
		Session session = this.getSession();
		Query query = session.createQuery(hqlStr);
		query.setFirstResult(5*(page-1));
		query.setMaxResults(5);
		List<Hydt> yhdtList =query.list();
		return yhdtList;
	}
	public Integer findPageCount() throws Exception {
		String hqlStr = "select count(hydt) from Hydt hydt";
		Session session = this.getSession();
		Query query = session.createQuery(hqlStr);
		Object object=query.uniqueResult();
		int ts=Integer.parseInt(object.toString());
		int pageCount=0;
		if(ts%5==0){
			pageCount=ts/5;
			
		}else{
			pageCount=ts/5+1;
		}
		
		
		return pageCount;
	}

	public List<Hydt> findHydtsByNine() throws Exception {
		Session session = this.getSession();
		String hqlStr = "from Hydt";
		Query query = session.createQuery(hqlStr);
		List<Hydt> hydtList = query.list();
		System.out.println("hydtListsdrgter:"+hydtList.size());
		if(hydtList.size() > 9) {
			hydtList = hydtList.subList(0, 10);
		}
		return hydtList;
	}

	public Hydt findHydtsById(Integer id) throws Exception {
		Session session = this.getSession();
		String hqlStr = "from Hydt h where h.HId = :hid";
		Query query = session.createQuery(hqlStr);
		query.setInteger("hid", id);
		Hydt hydt = (Hydt) query.uniqueResult();
		return hydt;
	}

	
	

}
