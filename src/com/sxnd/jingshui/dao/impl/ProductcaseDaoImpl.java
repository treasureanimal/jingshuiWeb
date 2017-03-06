package com.sxnd.jingshui.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.sxnd.jingshui.dao.ProductcaseDao;
import com.sxnd.jingshui.entity.Productcase;

public class ProductcaseDaoImpl extends HibernateDaoSupport implements
		ProductcaseDao {

	public int addproductcase(Productcase productcase) throws Exception {
		Session session = this.getSession();
		session.save(productcase);
		return 1;
	}

	public int deleteproductcase(Productcase productcase) throws Exception {
		Session session = this.getSession();
		session.delete(productcase);
		return 1;
	}
	//动态条件查询案例（根据产品案例类型id）
	public List<Productcase> findProductcase(Integer page, Integer pctid) throws Exception {
		String hqlStr = "from Productcase pc where 1=1";
		Session session = this.getSession();
		StringBuffer sbf = new StringBuffer(hqlStr);
		if(pctid!=null){
			sbf.append(" and pc.productcasetype.pctId= '"+pctid+"' ");
		}
		Query query = session.createQuery(sbf.toString());
		query.setFirstResult((page-1)*12);
		query.setMaxResults(12);
		List<Productcase> productcaseList = query.list();
		System.out.println("productcaseList1:"+productcaseList);
		return productcaseList;
	}
		
	public int updateproductcase(Productcase productcase) throws Exception {
		Session session = this.getSession();
		session.update(productcase);
		return 1;
	}

	public Integer findProductcasepages(Integer pctid) throws Exception {
		int num = 0;
		Session session = this.getSession();
		String hqlStr = "select count(pc) from Productcase pc where 1=1";
		StringBuffer sbf = new StringBuffer(hqlStr);
		if(pctid != null) {
			sbf.append(" and pc.productcasetype.pctId="+pctid);
		}
		Query query = session.createQuery(hqlStr);
		Object object = query.uniqueResult();
		Integer ts = Integer.parseInt(object.toString());
		if(ts % 14 ==0) {
			num = ts/14;
		}else {
			num = ts/14+1;
		}
		return num;
	}

	public Productcase findProductcaseByPcId(Integer pcid) throws Exception {
		// TODO Auto-generated method stub
		String hqlStr = "from Productcase pc where pc.pcId = :pcid";
		Session session = this.getSession();
		Query query = session.createQuery(hqlStr);
		query.setInteger("pcid",pcid);
		Productcase productcase = (Productcase) query.uniqueResult();
		return productcase;
	}

}
