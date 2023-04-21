package com.example.test1.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.test1.model.Bbs;


@Mapper		
public interface BbsMapper {
	
	// 조회
	List<Bbs> selectBbsList(HashMap<String, Object> map) throws Exception; 
	
	//게시판 등록
	void insertBbs(HashMap<String, Object> map) throws Exception;
	
	//게시판 삭제
	void deleteBbs(HashMap<String, Object> map) throws Exception;
	
	//상세보기
	Bbs selectGetBbs(HashMap<String, Object> map) throws Exception;
	
	//게시판 수정
	void updateBbs(HashMap<String, Object> map) throws Exception;
		
}
