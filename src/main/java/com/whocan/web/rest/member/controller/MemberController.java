package com.whocan.web.rest.member.controller;


import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.whocan.common.service.LoggingService;
import com.whocan.web.common.controller.CommonController;
import com.whocan.web.rest.member.service.MemberService;
import com.whocan.web.rest.member.vo.Member;

/**
 * <PRE>
 * 1. author	:	정수원
 * 2. date		:	2015.04.26
 * </PRE>
 *
 */
@RestController
public class MemberController extends LoggingService<CommonController>{

	@Autowired MemberService memberService;
	
	@PostMapping(value="/rest/member/register")
	public void registerMember(Member member) throws Exception {
		
		member.setMemberUid(String.valueOf(System.currentTimeMillis())+UUID.randomUUID().toString());
		memberService.insertMember(member);
		
	}
	
	@GetMapping(value="/rest/member/{memberUid}")
	public Member selectMember(@PathVariable String memberUid) throws Exception {

		Member member = memberService.selectMember(memberUid);
		return member;
	}

	@GetMapping(value="/rest/member/list")
	public List<Member> selectMemberList(Member member) throws Exception {
		
		return memberService.selectMemberList(member);
	}
}
