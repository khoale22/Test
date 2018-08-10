package com.controller;

import javax.servlet.http.HttpSession;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.User;
import com.service.StudentService;

@Controller
//@RequestMapping(value="/student" )
public class StudentController {
   @Autowired
   StudentService studentService;
	
	
	@RequestMapping(value="/student" ,method =RequestMethod.GET )
	public String studentInfo1(HttpSession session) {
//	String a=	(String) session.getAttribute("userId");
//		System.out.println("get dc khong :" + a); // ok
		return "student";
	
	}
	
	@RequestMapping(value="/abc")
	public String abc(HttpSession session ,ModelMap mm ) {
//		String b=	(String) session.getAttribute("userId");
//		System.out.println("get dc khong :" + b); // ok
		String userId =	(String) session.getAttribute("userId");
		mm.addAttribute("list",studentService.resultStudent(userId) );
		return "result";	
	}
	
	
}
