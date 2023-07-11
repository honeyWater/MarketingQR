package com.marketingqr.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FeedComment {

	private Long feed_comment_id;
	private Long fc_fk_feed_id;
	private Long parent_comment_id;
	private Long member_id;
	private Long classification;
	private Long group_num;
	private String content;
	private LocalDateTime create_time;
	private LocalDateTime last_update_time;
	private String delete_yn;
}
