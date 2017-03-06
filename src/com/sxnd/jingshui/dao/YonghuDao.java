package com.sxnd.jingshui.dao;

import com.sxnd.jingshui.entity.Yonghu;

public interface YonghuDao {
	
	//根据用户名字和密码查询用户
	public Yonghu findyonghuByNameAndpass(String yhname, String yhpwd) throws Exception;
	
	//添加用户
	public int addYonghu(Yonghu yonghu) throws Exception;

}
