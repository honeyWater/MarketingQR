package com.marketingqr.service;

import java.util.List;

import org.apache.ibatis.io.ResolverUtil.Test;
import org.springframework.stereotype.Service;

import com.marketingqr.dto.Menus;
import com.marketingqr.dto.Stores;
import com.marketingqr.dto.Team;
import com.marketingqr.mapper.MemberMapper;
import com.marketingqr.mapper.StoreMapper;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class StoreServiceImpl implements StoreService{

	private final StoreMapper storeMapper;
	
	@Override
	public Long selectSubscribeCount(final String name) {
		return 	storeMapper.countSubscribe(name);
	}

	@Override
	public Double reviewRatingAvg(final String name) {
		
		return storeMapper.reviewRatingAvg(name);
	}

	@Override
	public Stores selectStoreInfomation(final String name) {
//		Stores stores = new Stores();
//		stores = storeMapper.selectStore(name);
//		System.out.println("----------------Service");
//		System.out.println("name = " + name);
//		System.out.println("store_id = " + stores.getStore_id());
//		System.out.println("s_fk_store_user_id = " + stores.getS_fk_store_user_id());
		return storeMapper.selectStore(name);
	}

	@Override
	public List<Menus> selectMenuAll(final String name) {
		List<Menus> menus = storeMapper.findMenuAll(name);
		return menus;
	}

	@Override
	public void Subscibe(Team team) {
		
		storeMapper.Subscribe(team);
		
	}

	@Override
	public void cancelSubscibe(Team team) {
		storeMapper.cancelSubscribe(team);
	}

}
