package com.whocan.web.member.controller;

import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.whocan.web.member.domain.Member;
import com.whocan.web.member.service.MemberService;

@RestController
public class MemberController{

	@Autowired MemberService memberService;
	
	@RequestMapping(value="/member/register", method = RequestMethod.GET)
	public ModelAndView displayMember(Member member) throws Exception {

		return new ModelAndView("/member/register");
	}

	@RequestMapping(value="/member/members", method = RequestMethod.GET)
	public ModelAndView selectMembers(HttpServletRequest request, HttpServletResponse response, Member member) throws Exception {
		
		return new ModelAndView("/member/members");
	}
	
	
	//************************************** REST API *****************************************//
	
	@RequestMapping(value="/rest/member/register", method = RequestMethod.POST)
	public ModelAndView registerMember(Member member) throws Exception {
		
		member.setMemberUid(String.valueOf(System.currentTimeMillis())+UUID.randomUUID().toString());
		memberService.insertMember(member);
		
		return  new ModelAndView("redirect:/member/members");
	}
	
	@RequestMapping(value="/rest/member/{memberUid}", method = RequestMethod.GET)
	public Member selectMember(@PathVariable String memberUid) throws Exception {

		Member member = memberService.selectMember(memberUid);
		return member;
	}

	@RequestMapping(value="/rest/member/list", method = RequestMethod.GET)
	public List<Member> selectMemberList(Member member) throws Exception {
		
		List<Member> selectMemberList = memberService.selectMemberList(member);
		return selectMemberList;
	}
}
