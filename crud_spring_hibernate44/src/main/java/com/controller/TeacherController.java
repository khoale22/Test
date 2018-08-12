package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dao.StudentDao;
import com.model.Result;
import com.service.StudentService;
import com.service.TeacherService;


@Controller
public class TeacherController {
	@Autowired
	TeacherService teacherService ;
	
	@Autowired
	StudentService studentService;
	
	
	@RequestMapping(value="/teacher" ,method = RequestMethod.GET)
	public String teacherInfo(ModelMap mm ,HttpSession session) {	
		String userId = (String) session.getAttribute("userId");
		mm.addAttribute("listStudent", teacherService.getAllStudent(userId));
		return "teacher";
	}
	
	
	@RequestMapping(value="/showInfo" ,method = RequestMethod.GET)
	public String showInfo(@RequestParam("userId") String userId ,ModelMap mm ) {
		mm.addAttribute("listresult", studentService.resultStudent(userId));
		
		return "result_teacher";	
		
	}
	
	@RequestMapping(value ="/deleteStudent" ,method = RequestMethod.GET)
	public String delete(@RequestParam("userId") String userId) {
		studentService.deleteUser2(userId);
		return "redirect:/teacher";
	}
	
	

	@RequestMapping(value="/editResult" , method = RequestMethod.GET)
	public String editForm(@RequestParam("subjectName") String subjectName ,@RequestParam("userId") String userId , ModelMap mm ) {
		
		Result result = studentService.eachResultStudent(subjectName, userId);
		mm.addAttribute("result", result);
		return "edit_result";
		
	}
	@RequestMapping(value="/update" , method = RequestMethod.POST)
	public String save(@ModelAttribute("result") Result result) {
		studentService.update(result);
		return "redirect:/teacher";
		
	}

} 
