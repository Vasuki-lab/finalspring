package com.itdialects.spring.mvc.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	@RequestMapping("/hello")
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

		String userName = request.getParameter("userName");
		request.setAttribute("key1", userName);

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("response");

		return modelAndView;
	}

}
