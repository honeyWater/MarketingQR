package com.marketingqr.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.marketingqr.dto.Menus;
import com.marketingqr.dto.Stores;
import com.marketingqr.dto.Team;
import com.marketingqr.service.StoreServiceImpl;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class StoreController {
	
	private final StoreServiceImpl storeService;
	
	@GetMapping("/store/select-store-info")
	public String selectStoreInfo(@RequestParam final String name) throws Exception{
		Gson gson = new Gson();
		Stores store = storeService.selectStoreInfomation(name);
//		try {
//			String jsonData = new ObjectMapper().registerModule(new JavaTimeModule()).writeValueAsString(store);
//			System.out.println(jsonData);
//		} catch (JsonProcessingException e) {
//			throw new RuntimeException(e);
//		}
		// store(매장)에 있는 모든 메뉴들을 호출한다.
		List<Menus> menus = storeService.selectMenuAll(name);
		// store(매장)에 있는 구독자 수를 호출한다.
		Long subscribeCount = storeService.selectSubscribeCount(name);
		// store(매장)에 있는 평점 평균을 호출한다.
		Double reviewRatingAvg = storeService.reviewRatingAvg(name);
		JsonObject jsonObject = new JsonObject();
		jsonObject.addProperty("stores", gson.toJson(store));
		jsonObject.addProperty("menus", gson.toJson(menus));
		jsonObject.addProperty("subscribeCount", gson.toJson(subscribeCount));
		jsonObject.addProperty("reviewRatingAvg", gson.toJson(reviewRatingAvg));
		String jsonStr = gson.toJson(jsonObject);
		System.out.println(jsonStr);
		return jsonStr;
	}
	// name은 store가게 이름
//	@GetMapping("/store/selectMenuAll")
//	public List<Menus> selectMenuAll(@RequestParam final String name) throws Exception{
//
//		List<Menus> menus = storeService.selectMenuAll(name);
//		
//		return menus;
//	}
	
//	@GetMapping("/store/selectCountSs")
//	public Long selectCountSubscribe(@RequestParam final String name) throws Exception{
//		return storeService.selectSubscribeCount(name);
//	}
//	
//	@GetMapping("/store/selectAvg")
//	public Double selectReviewRatingAvg(@RequestParam final String name) throws Exception{
//		return storeService.reviewRatingAvg(name);
//	}
	
	// 구독
	@PostMapping("/store/subscribe")
	public Long Subscribe(@RequestBody String json) throws Exception{
		Gson gson = new Gson();
		Team team = gson.fromJson(json, Team.class);
		storeService.Subscibe(team);
		Long count = storeService.selectSubscribeCount(team.getName());
		System.out.println("personal_id : "+team.getPersonal_id());
		System.out.println("name : "+team.getName());
		return count;
	}
	
	// 구독 취소
	@PostMapping("/store/cancel-subscribe")
	public Long cancelSubscribe(@RequestBody String json) throws Exception{
		Gson gson = new Gson();
		Team team = gson.fromJson(json, Team.class);
		storeService.cancelSubscibe(team);
		Long count = storeService.selectSubscribeCount(team.getName());
		System.out.println("personal_id : "+team.getPersonal_id());
		System.out.println("name : "+team.getName());
		return count;
	}
	
//	@PostMapping("/store/pushSubscribe")
//	public void pushSubscribe(@RequestBody Team team) throws Exception{
//		storeService.pushSubscibe(team);
//		System.out.println("personal_id : "+team.getPersonal_id());
//		System.out.println("name : "+team.getName());
//	}
	
//	@PostMapping("/store/cancelSubscribe")
//	public void cancelSubscribe(@RequestBody Team team) throws Exception{
//		storeService.cancelSubscibe(team);
//		System.out.println("personal_id : "+team.getPersonal_id());
//		System.out.println("name : "+team.getName());
//	}
}
