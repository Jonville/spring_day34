package com.example.test1.dao;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test1.mapper.BbsMapper;
import com.example.test1.model.Bbs;

@Service 
public class BbsServiceImpl implements BbsService{

	@Autowired 
	private BbsMapper bbsMapper;

	@Override
	public List<Bbs> searchBbsList(HashMap<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return bbsMapper.selectBbsList(map);
	}

	@Override
	public void addBbs(HashMap<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		bbsMapper.insertBbs(map);
	}

	@Override
	public void removeBbs(HashMap<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		bbsMapper.deleteBbs(map);
	}

	@Override
	public Bbs selectGetBbs(HashMap<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return bbsMapper.selectGetBbs(map);
	}

	@Override
	public void updateBbs(HashMap<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		bbsMapper.updateBbs(map);
	}
	

}