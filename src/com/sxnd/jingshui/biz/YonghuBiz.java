package com.sxnd.jingshui.biz;

import com.sxnd.jingshui.dao.YonghuDao;
import com.sxnd.jingshui.entity.Yonghu;

public interface YonghuBiz {
	
	//�����û����ֺ������ѯ�û�
	public Yonghu findyonghuByNameAndpass(String yhname, String yhpwd) throws Exception;
	
	//����û�
	public int addYonghu(Yonghu yonghu) throws Exception;
}
