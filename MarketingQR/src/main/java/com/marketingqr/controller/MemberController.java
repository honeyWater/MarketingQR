package com.marketingqr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.marketingqr.dto.MemberDto;
import com.marketingqr.service.MemberServiceImpl;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class MemberController {

	private final MemberServiceImpl memberService;
	
	@PostMapping("/signup")
	public String signUp(@RequestBody MemberDto memberDto) throws Exception{
		memberService.signUp(memberDto);
		return memberDto.toString();
	}
	
	@GetMapping("/selectmember")
	public MemberDto selectMember(@RequestParam Long user_id) throws Exception{
		MemberDto member = new MemberDto();
		member = memberService.selectMember(user_id);
		return member;
	}
	
}
