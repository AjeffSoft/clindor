package com.ajeff.clindor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "customer")
public class CustomerController {
	
	@GetMapping
	public ModelAndView test () {
		return new ModelAndView("index");
	}

}
