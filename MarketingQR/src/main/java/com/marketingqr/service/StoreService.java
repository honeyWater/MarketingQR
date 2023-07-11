package com.marketingqr.service;

import java.util.List;

import com.marketingqr.dto.Menus;
import com.marketingqr.dto.Stores;
import com.marketingqr.dto.Team;

public interface StoreService {
	
	// 구독자 수 조회
	Long selectSubscribeCount(String name) throws Exception;
	
	// 리뷰 평점 계산
	Double reviewRatingAvg(String name) throws Exception;
	
	// store 정보 조회
	Stores selectStoreInfomation(String name) throws Exception;
	
	// 메뉴 전체 불러오기
	List<Menus> selectMenuAll(String name) throws Exception;
	
	// 구독버튼 누르기
	void Subscibe(Team team) throws Exception;
	
	// 구독취소
	void cancelSubscibe(Team team) throws Exception;
	
}
