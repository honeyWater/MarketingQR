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
public class MemberDto {
	//@Id
	private Long user_id;
		
	private String personal_id;
	private String password;
	private String name;
	private String nickname;
	private String birth;
	private String sex;
	private String email;
	private String phone;
	private String user_image;
		
	//@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss", timezone = "Asia/Seoul")
	private LocalDateTime create_time;
		
	private LocalDateTime last_update_time;
	private LocalDateTime delete_time;
	private String delete_yn;
}
