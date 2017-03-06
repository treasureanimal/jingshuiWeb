package com.sxnd.jingshui.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.sxnd.jingshui.dao.YonghuDao;
import com.sxnd.jingshui.entity.Yonghu;


public class YonghuDaoImpl extends HibernateDaoSupport implements YonghuDao {

	public int addYonghu(Yonghu yonghu) throws Exception {
		Session session = this.getSession();
		session.save(yonghu);
		return 0;
	}

	public Yonghu findyonghuByNameAndpass(String yhname, String yhpwd) throws Exception {
		System.out.println("sfgs发达的规定"+yhname);
		Session session = this.getSession();
		String hqlStr = "from Yonghu yh where yh.yhname=:yhname and yh.yhpwd =:yhpwd";
		/*List<Yonghu> yonghuList = (List<Yonghu>)this.getHibernateTemplate().find(hqlStr);*/
		Query query = session.createQuery(hqlStr);
		query.setString("yhname", yhname);
		query.setString("yhpwd", yhpwd);
		List<Yonghu> yonghuList = query.list();
		if(yonghuList.size()>0){
			return yonghuList.get(0);
		}
		return null;
	}

}
