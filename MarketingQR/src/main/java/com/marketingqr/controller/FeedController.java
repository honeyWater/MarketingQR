package com.marketingqr.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.marketingqr.dto.FeedAndUser;
import com.marketingqr.dto.FeedComment;
import com.marketingqr.dto.FeedDto;
import com.marketingqr.service.FeedServiceImpl;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class FeedController {

private final FeedServiceImpl feedService;
	
	@GetMapping("/feed/viewfeed")
	public List<FeedDto> viewFeed(@RequestParam Long store_id) throws Exception{
		List<FeedDto> feedList = feedService.viewFeed(store_id);
		return feedList;
	}
	
	@GetMapping("/feed/likecount")
	public Long countFeedLike(@RequestParam Long feed_id) throws Exception{
		Long cnt = feedService.countFeedLike(feed_id);
		return cnt;
	}
	
	@PostMapping("/feed/dofeedlike")
	public Long doFeedLike(@RequestBody FeedAndUser feedAndUser) throws Exception{
		Long cnt = feedService.doFeedLike(feedAndUser);
		return cnt;
	}
	
	@PostMapping("/feed/cancelfeedlike")
	public Long cancelFeedLike(@RequestBody FeedAndUser feedAndUser) throws Exception{
		Long cnt = feedService.cancelFeedLike(feedAndUser);
		return cnt;
	}
	
	@GetMapping("/feed/viewcomment")
	public List<FeedComment> viewComment(@RequestParam Long feed_id) throws Exception{
		List<FeedComment> commentList = feedService.viewComment(feed_id);
		return commentList;
	}
	
	@PostMapping("/feed/writecomment")
	public List<FeedComment> writeComment(@RequestBody FeedComment feedComment) throws Exception{
		List<FeedComment> commentList = feedService.writeComment(feedComment);
		return commentList;
	}
	
	@PostMapping("/feed/modifycomment")
	public List<FeedComment> modifyComment(@RequestBody FeedComment feedComment) throws Exception{
		List<FeedComment> commentList = feedService.modifyComment(feedComment);
		return commentList;
	}
	
	@PostMapping("/feed/deletecomment")
	public List<FeedComment> deleteComment(@RequestBody FeedComment feedComment) throws Exception{
		List<FeedComment> commentList = feedService.deleteComment(feedComment);
		return commentList;
	}
}
