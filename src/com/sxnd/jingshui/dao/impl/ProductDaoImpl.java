package com.sxnd.jingshui.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.sxnd.jingshui.dao.ProductDao;
import com.sxnd.jingshui.entity.Product;
import com.sxnd.jingshui.entity.Producttype;



public class ProductDaoImpl extends HibernateDaoSupport implements ProductDao {

	public int addproduct(Product product) throws Exception {
		this.getHibernateTemplate().save(product);
		return 1;
	}

	public int deleteProdunct(Integer id) throws Exception {
		Session session = this.getSession();
		Product product = (Product) session.get(Product.class, id);
		session.delete(product);
		return 1;
	}
	//��̬������ѯҳ�������ݲ�Ʒ����id��
	public Integer findProductpages(Integer ptid) throws Exception {
		int num = 0;
		Session session = this.getSession();
		String hqlStr = "select count(p) from Product p where 1=1";
		StringBuffer sbf = new StringBuffer(hqlStr);
		if(ptid != null) {
			sbf.append(" and p.producttype.ptId="+ptid);
		}
		Query query = session.createQuery(sbf.toString());
		Object object = query.uniqueResult();
		Integer ts = Integer.parseInt(object.toString());
		if(ts % 8 ==0) {
			num = ts/5;
		}else {
			num = ts/5+1;
		}
		return num;
	}
	/**
	 * �����е�pid����sql�����ð�ź�ߵ�һ�£����ź�ߵ�pid���ϱ߶���ġ�
	 * ͨ�����ź�ߵ�pid��ð���е�pid��ֵ��Ȼ���pidֵ�� ��sql��
	 */
	public List<Product> findproduct(Integer page, Integer ptid)
			throws Exception {
		Session session = this.getSession();
		String hqlStr = "from Product p where 1=1";
		StringBuffer sbf = new StringBuffer(hqlStr);
		if(ptid != null) {
			sbf.append(" and p.producttype.ptId="+ptid);
		}
		Query query = session.createQuery(sbf.toString());
		//���÷�ҳ
		query.setFirstResult((page-1)*5);
		query.setMaxResults(8);
		List<Product> productList = query.list();
		return productList;
	}

	public int updateproduct(Product product) throws Exception {
		this.getHibernateTemplate().update(product);
		return 1;
	}

	public Product findproductById(Integer pid) throws Exception {
		String hqlStr = "from Product where PId=:pid";
		Session session = this.getSession();
		Query query = session.createQuery(hqlStr);
		query.setInteger("pid", pid);
		Product product = (Product) query.uniqueResult(); 
		return product;
	}


}
