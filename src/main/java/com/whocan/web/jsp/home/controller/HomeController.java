package com.whocan.web.jsp.home.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * <PRE>
 * 1. author	:	정수원
 * 2. date		:	2015.04.26
 * </PRE>
 *
 */
@Controller
public class HomeController {
	
	@Autowired Environment env;

	@RequestMapping(value = "/", method = RequestMethod.GET)
    public String displayHome(Model model) {
		System.out.println(env.getProperty("name"));
		return "/home";
	}
	
}
