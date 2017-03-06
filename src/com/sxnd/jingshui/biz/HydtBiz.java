package com.sxnd.jingshui.biz;

import java.util.List;

import com.sxnd.jingshui.entity.Hydt;

public interface HydtBiz {
	public int addHydt(Hydt hydt) throws Exception;
	
	public int updateHydt(Hydt hydt)throws Exception;
	
	public int deleteHydt(Hydt hydt)throws Exception;
	
	//��ҳ��ѯ����
	public List<Hydt> findHydt(Integer page)throws Exception;
	
	//��ѯ��ҳ��
	public Integer findPageCount()throws Exception;
	
	public List<Hydt> findHydtsByNine() throws Exception;
	
	//������ҵ��̬id��ѯ����
	public Hydt findHydtsById(Integer id) throws Exception;
	
	//���ҵ�ǰ��ҵ��̬����һ��
	public Hydt findlastHydt(Integer id) throws Exception;
	//���ҵ�ǰ��ҵ��̬����һ��
	public Hydt findnextHydt(Integer id) throws Exception;
	

}
