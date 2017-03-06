package com.sxnd.jingshui.dao;

import java.util.List;

import com.sxnd.jingshui.entity.Product;
import com.sxnd.jingshui.entity.Producttype;

public interface ProductDao {
	
	//��̬������ѯ�����ݲ�Ʒ����id��
	public List<Product> findproduct(Integer page,Integer ptid) throws Exception;
	
	//��̬������ѯҳ�������ݲ�Ʒ����id��
	public Integer findProductpages(Integer ptid)throws Exception;
	
	//��Ӳ�Ʒ
	public int addproduct(Product product) throws Exception;
	
	//�޸Ĳ�Ʒ
	public int updateproduct(Product product)throws Exception;
	
	//ɾ����Ʒ
	public int deleteProdunct(Integer id) throws Exception;
	
	//���ݲ�Ʒid��ѯ��Ʒ
	public Product findproductById(Integer pid) throws Exception;
	

	
	

}
