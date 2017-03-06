package com.sxnd.jingshui.biz.impl;

import java.util.List;

import com.sxnd.jingshui.biz.HydtBiz;
import com.sxnd.jingshui.dao.HydtDao;
import com.sxnd.jingshui.entity.Hydt;

public class HydtBizImpl implements HydtBiz{
	
	private HydtDao hydtDao;

	public int addHydt(Hydt hydt) throws Exception {
		// TODO Auto-generated method stub
		return hydtDao.addHydt(hydt);
	}

	public int deleteHydt(Hydt hydt) throws Exception {
		// TODO Auto-generated method stub
		return hydtDao.deleteHydt(hydt);
	}

	public List<Hydt> findHydt(Integer page) throws Exception {
		List<Hydt> hydtList = hydtDao.findHydt(page);
		for (Hydt hydt : hydtList) {
			String content = hydt.getHContent();
			if(content.length() > 107) {
				content = content.substring(0, 108);
				content+="...";
				hydt.setHContent(content);
			}
		}
		return hydtList;
	}

	public Integer findPageCount() throws Exception {
		// TODO Auto-generated method stub
		return hydtDao.findPageCount();
	}

	public int updateHydt(Hydt hydt) throws Exception {
		// TODO Auto-generated method stub
		return hydtDao.updateHydt(hydt);
	}

	public HydtDao getHydtDao() {
		return hydtDao;
	}

	public void setHydtDao(HydtDao hydtDao) {
		this.hydtDao = hydtDao;
	}

	public List<Hydt> findHydtsByNine() throws Exception {
		List<Hydt> hydtList = hydtDao.findHydtsByNine();
		for (Hydt hydt : hydtList) {
			String title = hydt.getHTitle();
			if(title.length() > 22) {
				title = title.substring(0, 23);
				title+="...";
				hydt.setHTitle(title);
			}
		}
		return hydtList;
	}

	public Hydt findHydtsById(Integer id) throws Exception {
		
		return hydtDao.findHydtsById(id);
	}
	
	//查询行业动态的上一篇下一篇
	public Hydt findlastHydt(Integer id) throws Exception {
		
		Hydt lastHydt = null;
		int num = 1;
		do {
			lastHydt = hydtDao.findHydtsById(id-num);
			
			if(lastHydt.getHId()==0){
				break;
			}
			if(lastHydt != null) {
				break;
			}
			num++;
		} while (lastHydt == null);
		return lastHydt;
	}

	public Hydt findnextHydt(Integer id) throws Exception {
		
		Hydt nextHydt = null;
		int num = 1;
		do {
			nextHydt = hydtDao.findHydtsById(id+num);
			
			if(nextHydt != null) {
				break;
			}
			num++;
		} while (nextHydt == null&&num<id);
		return nextHydt;
	}

}
