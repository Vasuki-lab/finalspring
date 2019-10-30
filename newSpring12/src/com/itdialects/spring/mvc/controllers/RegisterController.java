package com.itdialects.spring.mvc.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegisterController {

	public void m1() {
		System.out.println("i'm m1() method");
	}

	@RequestMapping("/register")
	public String m3(@RequestParam("studentId") int studentId, @RequestParam("studentName") String studentName,
			@RequestParam("courseName") String courseName, @RequestParam("courseFee") double courseFee, Model model) {

		if (courseFee >= 3000) {
			model.addAttribute("sid", studentId);
			model.addAttribute("sn", studentName);
			model.addAttribute("cn", courseName);
			model.addAttribute("cf", courseFee);
			return "registerSuccess";
		} else {
			return "registerError";
		}

	}

}
