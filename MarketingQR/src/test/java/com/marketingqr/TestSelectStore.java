package com.marketingqr;

import org.junit.jupiter.api.Test;

import com.marketingqr.dto.Stores;
import com.marketingqr.mapper.StoreMapper;
import com.marketingqr.service.StoreService;

public class TestSelectStore {

	private StoreService storeService;
	//	StoreMapper storeMapper = new StoreMapper();
	@Test
	public void testSelectStore() {
		Stores store = new Stores();
		try {
			store = storeService.selectStoreInfomation("임창희");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.println("Store_id"+store.getStore_id());
//		System.out.println("S_fk_store_user_id"+store.getS_fk_store_user_id());
	}
}
