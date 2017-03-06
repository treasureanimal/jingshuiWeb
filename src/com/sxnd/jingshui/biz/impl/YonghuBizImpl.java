package com.sxnd.jingshui.biz.impl;

import com.sxnd.jingshui.biz.YonghuBiz;
import com.sxnd.jingshui.dao.YonghuDao;
import com.sxnd.jingshui.entity.Yonghu;


public class YonghuBizImpl implements YonghuBiz {
	private YonghuDao yonghuDao;
	public int addYonghu(Yonghu yonghu) throws Exception {
		Yonghu findyonghu = yonghuDao.findyonghuByNameAndpass(yonghu.getYhname(), yonghu.getYhpwd());
		if(findyonghu==null) {
		    yonghuDao.addYonghu(yonghu);
			return 1;
		}
		return 0;
	}

	public Yonghu findyonghuByNameAndpass(String yhname, String yhpwd)
			throws Exception {
		return yonghuDao.findyonghuByNameAndpass(yhname, yhpwd);
		 
	}

	public YonghuDao getYonghuDao() {
		return yonghuDao;
	}

	public void setYonghuDao(YonghuDao yonghuDao) {
		this.yonghuDao = yonghuDao;
	}
	
	

}
