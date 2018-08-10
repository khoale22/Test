package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.service.TestService;

@Controller
public class TestController {
	@Autowired
	TestService testService;

	@RequestMapping(value ="/testjoin")
	public String abc(ModelMap mm) {
		mm.addAttribute("listtest" ,testService.joinTable());
		return "test";
		
		
	}
}
