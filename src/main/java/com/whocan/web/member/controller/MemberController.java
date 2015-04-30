package com.whocan.web.member.controller;


import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.whocan.web.member.domain.Member;
import com.whocan.web.member.service.MemberService;

@Controller
@RequestMapping(value="/member")
public class MemberController{

	@Autowired MemberService memberService;
	
	@RequestMapping(value="", method = RequestMethod.GET)
	public String displayMember(Member member) throws Exception {

		return "/member/register";
	}

	@RequestMapping(value="/register", method = RequestMethod.POST)
	public String registerMember(Member member) throws Exception {
		
		member.setMemberUid(String.valueOf(System.currentTimeMillis())+UUID.randomUUID().toString());
		memberService.insertMember(member);
		return  "redirect:/member/list";
	}
	
	@RequestMapping(value="/list/{id}", method = RequestMethod.GET)
	public @ResponseBody String selectMember(@PathVariable String memberUid) throws Exception {

		Member member = memberService.selectMember(memberUid);
		return member.toString();
	}

	@RequestMapping(value="/list", method = RequestMethod.GET)
	public @ResponseBody List<Member> selectMemberList(HttpServletRequest request, HttpServletResponse response, Member member) throws Exception {
		
		List<Member> selectMemberList = memberService.selectMemberList(member);
		return selectMemberList;
	}

	@RequestMapping(value="/memberList", method = RequestMethod.GET)
	public String selectMembers(HttpServletRequest request, HttpServletResponse response, Member member) throws Exception {
		return "/member/members";
	}
}
