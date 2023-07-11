package com.marketingqr.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.marketingqr.dto.FeedAndUser;
import com.marketingqr.dto.FeedComment;
import com.marketingqr.dto.FeedDto;
import com.marketingqr.mapper.FeedMapper;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class FeedServiceImpl implements FeedService{

private final FeedMapper feedMapper;
	
	@Override
	public List<FeedDto> viewFeed(Long store_id) throws Exception{
		List<FeedDto> feedList = feedMapper.viewFeed(store_id);
		return feedList;
	}
	
	@Override
	public Long countFeedLike(Long feed_id) throws Exception{
		Long cnt = feedMapper.countFeedLike(feed_id);
		return cnt;
	}
	
	@Override
	public Long doFeedLike(FeedAndUser feedAnduser) throws Exception{
		feedMapper.doFeedLike(feedAnduser);
		Long cnt = feedMapper.countFeedLike(feedAnduser.getFeed_id());
		return cnt;
	}
	
	@Override
	public Long cancelFeedLike(FeedAndUser feedAndUser) throws Exception{
		feedMapper.cancelFeedLike(feedAndUser);
		Long cnt = feedMapper.countFeedLike(feedAndUser.getFeed_id());
		return cnt;
	}
	
	@Override
	public List<FeedComment> viewComment(Long feed_id) throws Exception{
		List<FeedComment> commentList = feedMapper.viewComment(feed_id);
		return commentList;
	}
	
	@Override
	public List<FeedComment> writeComment(FeedComment feedComment) throws Exception{
		feedMapper.writeComment(feedComment);
		List<FeedComment> commentList = feedMapper.viewComment(feedComment.getFc_fk_feed_id());
		return commentList;
	}
	
	@Override
	public List<FeedComment> modifyComment(FeedComment feedComment) throws Exception{
		feedMapper.modifyComment(feedComment);
		List<FeedComment> commentList = feedMapper.viewComment(feedComment.getFc_fk_feed_id());
		return commentList;
	}
	
	@Override
	public List<FeedComment> deleteComment(FeedComment feedComment) throws Exception{
		feedMapper.deleteComment(feedComment.getFeed_comment_id());
		List<FeedComment> commentList = feedMapper.viewComment(feedComment.getFc_fk_feed_id());
		return commentList;
	}
}
