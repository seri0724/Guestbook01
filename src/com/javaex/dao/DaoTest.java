package com.javaex.dao;

import java.util.List;

import com.javaex.vo.GuestbookVo;
import com.javaex.dao.GuestbookDao;

public class DaoTest {

	public static void main(String[] args) {
		
		GuestbookDao dao = new GuestbookDao();
		GuestbookVo vo = new GuestbookVo("황민현","0809","가수");
		
		//dao.insert(vo);
		
		//dao.delete(2);
		
		List<GuestbookVo> list = dao.getList();
		
		for(GuestbookVo listVo : list) {
			System.out.println(listVo.toString());
			}
		}
}