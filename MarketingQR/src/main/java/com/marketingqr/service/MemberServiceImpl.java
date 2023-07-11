package com.marketingqr.service;

import org.springframework.stereotype.Service;

import com.marketingqr.dto.MemberDto;
import com.marketingqr.mapper.MemberMapper;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class MemberServiceImpl implements MemberService{

	private final MemberMapper memberMapper;
	
	@Override
	public void signUp(final MemberDto memberDto) throws Exception{
		memberMapper.saveMember(memberDto);
		MemberDto.builder()
			.personal_id(memberDto.getPersonal_id())
			.password(memberDto.getPassword())
			.name(memberDto.getName())
			.nickname(memberDto.getNickname())
			.birth(memberDto.getBirth())
			.sex(memberDto.getSex())
			.email(memberDto.getEmail())
			.phone(memberDto.getPhone())
			.user_image(memberDto.getUser_image())
			.create_time(memberDto.getCreate_time())
			.last_update_time(memberDto.getLast_update_time())
			.delete_time(memberDto.getDelete_time())
			.delete_yn(memberDto.getDelete_yn())
			.build();
	}
	
	@Override
	public MemberDto selectMember(Long user_id) throws Exception{
		
		MemberDto memberDto = new MemberDto();
		memberDto = memberMapper.selectMember(user_id);
		
		return memberDto;
	}
}
