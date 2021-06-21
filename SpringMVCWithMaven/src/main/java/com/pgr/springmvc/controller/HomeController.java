package com.pgr.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home() {
		return "index";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(@RequestParam String username, @RequestParam String password) {

		if (username.equals("reddy")) {
			return new ModelAndView("redirect:/admin");
		} else {
			return new ModelAndView("redirect:/");
		}
	}

	@RequestMapping("/admin")
	public String admin() {
		return "admin";
	}

}
