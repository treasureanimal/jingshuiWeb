package com.sxnd.jingshui.dao;

import com.sxnd.jingshui.entity.Yonghu;

public interface YonghuDao {
	
	//�����û����ֺ������ѯ�û�
	public Yonghu findyonghuByNameAndpass(String yhname, String yhpwd) throws Exception;
	
	//����û�
	public int addYonghu(Yonghu yonghu) throws Exception;

}
