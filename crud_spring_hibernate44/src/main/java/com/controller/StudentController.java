package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.User;

@Controller
//@RequestMapping(value="/student" )
public class StudentController {

	
	@RequestMapping(value="/student" ,method =RequestMethod.GET )
	public String studentInfo1() {
		return "student";
	
	}
	@RequestMapping(value="/abc")
	public String abc() {
			
		return "test";	
	}
}
