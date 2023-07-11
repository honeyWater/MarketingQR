package com.marketingqr.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.marketingqr.dto.MemberDto;

@Mapper
public interface MemberMapper {

	void saveMember(MemberDto memberDto);
	
	MemberDto selectMember(Long user_id);
	
	List<MemberDto> findAll();
}
