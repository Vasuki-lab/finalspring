package com.itdialects.spring.mvc.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping("/login")
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

		String userName = request.getParameter("userName");
		String password = request.getParameter("password");

		ModelAndView modelAndView = new ModelAndView();

		if (userName.equals(password)) {
			modelAndView.setViewName("loginSuccess");
			modelAndView.addObject("un", userName);
		} else {
			modelAndView.setViewName("loginError");
		}

		return modelAndView;
	}

}
