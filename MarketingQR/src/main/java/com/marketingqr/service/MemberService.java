package com.marketingqr.service;

import com.marketingqr.dto.MemberDto;

public interface MemberService {

	void signUp(MemberDto memberDto) throws Exception;
	
	MemberDto selectMember(Long user_id) throws Exception;
}
