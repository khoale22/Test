package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.service.TeacherService;


@Controller
public class TeacherController {
	@Autowired
	TeacherService teacherService ;
	
	
	@RequestMapping(value="/teacher" ,method = RequestMethod.GET)
	public String teacherInfo(ModelMap mm ,HttpSession session) {	
		String userId = (String) session.getAttribute("userId");
		mm.addAttribute("listStudent", teacherService.getAllStudent(userId));
		return "teacher";
	}

} 
