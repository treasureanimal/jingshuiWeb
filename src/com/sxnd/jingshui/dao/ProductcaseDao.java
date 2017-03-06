package com.sxnd.jingshui.dao;

import java.util.List;

import com.sxnd.jingshui.entity.Productcase;

public interface ProductcaseDao {
	
	public int  addproductcase(Productcase productcase) throws Exception;
	
	public int updateproductcase(Productcase productcase)throws Exception;
	
	public int deleteproductcase(Productcase productcase)throws Exception;
	
	
	//��̬������ѯ
	public List<Productcase> findProductcase(Integer page,Integer pctid) throws Exception;
	
	
	//��̬������ѯҳ�������ݲ�Ʒ����id��
	public Integer findProductcasepages(Integer pctid)throws Exception;
	
	//���ݲ�Ʒ����id�����Ʒ�����ľ�������
	public Productcase findProductcaseByPcId(Integer pcid)throws Exception;
}
