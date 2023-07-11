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
public class FeedDto {

	private Long feed_id;
	private Long f_fk_store_id;
	private String content;
	private LocalDateTime create_time;
	private LocalDateTime last_update_time;
	private String delete_yn;
}
