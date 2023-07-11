package com.marketingqr.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.marketingqr.dto.FeedAndUser;
import com.marketingqr.dto.FeedComment;
import com.marketingqr.dto.FeedDto;

@Mapper
public interface FeedMapper {

void createFeed(Long store_id, FeedDto feedDto);
	
	List<FeedDto> viewFeed(Long store_id);
	
	Long countFeedLike(Long feed_id);
	
	void doFeedLike(FeedAndUser feedAndUser);
	
	void cancelFeedLike(FeedAndUser feedAndUser);
	
	List<FeedComment> viewComment(Long feed_id);
	
	void writeComment(FeedComment feedComment);
	
	void modifyComment(FeedComment feedComment);
	
	void deleteComment(Long feed_comment_id);
}
