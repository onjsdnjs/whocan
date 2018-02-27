package com.whocan.web.common.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.whocan.common.service.LoggingService;
import com.whocan.web.rest.member.vo.Member;


/**
 * <PRE>
 * 1. author	:	정수원
 * 2. date		:	2015.04.26
 * </PRE>
 *
 */
@Controller
public class CommonController extends LoggingService<CommonController>{
	
	@Autowired Environment env;

	/*************************************************************
	 *                          HOME                             *
	 ************************************************************/
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
    public String displayHome(Model model) {
		
		log.debug(env.getProperty("name"));
		
		return "/home";
	}
	
	/*************************************************************
	 *                          MEMBER                           *
	 ************************************************************/
	
	@RequestMapping(value="/member/register", method = RequestMethod.GET)
	public ModelAndView displayMember(Member member) throws Exception {

		return new ModelAndView("/member/register");
	}

	@RequestMapping(value="/member/members", method = RequestMethod.GET)
	public ModelAndView selectMembers(HttpServletRequest request, HttpServletResponse response, Member member) throws Exception {
		
		return new ModelAndView("/member/members");
	}
	
}
