package com.marketingqr.service;

import java.util.List;

import com.marketingqr.dto.FeedAndUser;
import com.marketingqr.dto.FeedComment;
import com.marketingqr.dto.FeedDto;

public interface FeedService {

	//void createFeed(FeedDto feedDto) throws Exception; // 판매자만 사용
	
		List<FeedDto> viewFeed(Long store_id) throws Exception;
		
		Long countFeedLike(Long feed_id) throws Exception;
		
		Long doFeedLike(FeedAndUser feedAndUser) throws Exception;
		
		Long cancelFeedLike(FeedAndUser feedAndUser) throws Exception;
		
		List<FeedComment> viewComment(Long feed_id) throws Exception;
		
		List<FeedComment> writeComment(FeedComment feedComment) throws Exception;
		
		List<FeedComment> modifyComment(FeedComment feedComment) throws Exception;
		
		List<FeedComment> deleteComment(FeedComment feedComment) throws Exception;
}
