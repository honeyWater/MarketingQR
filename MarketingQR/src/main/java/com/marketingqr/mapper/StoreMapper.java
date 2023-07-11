package com.marketingqr.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.marketingqr.dto.Menus;
import com.marketingqr.dto.Stores;
import com.marketingqr.dto.Team;

@Mapper
public interface StoreMapper {

	Stores selectStore(String name);
	
	List<Menus> findMenuAll(String name);
	
	Long countSubscribe(String name);
	
	Double reviewRatingAvg(String name);
	
	void Subscribe(Team team);
	
	void cancelSubscribe(Team team);
	
}
