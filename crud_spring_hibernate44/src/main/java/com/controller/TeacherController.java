package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dao.StudentDao;
import com.service.TeacherService;


@Controller
public class TeacherController {
	@Autowired
	TeacherService teacherService ;
	
	@Autowired
	StudentDao studentDao;
	
	
	@RequestMapping(value="/teacher" ,method = RequestMethod.GET)
	public String teacherInfo(ModelMap mm ,HttpSession session) {	
		String userId = (String) session.getAttribute("userId");
		mm.addAttribute("listStudent", teacherService.getAllStudent(userId));
		return "teacher";
	}
	
	
	@RequestMapping(value="/showInfo" ,method = RequestMethod.GET)
	public String showInfo(@RequestParam("userId") String userId ,ModelMap mm ) {
		mm.addAttribute("listresult", studentDao.resultStudent(userId));
		
		return "result_teacher";	
	}
	

} 
