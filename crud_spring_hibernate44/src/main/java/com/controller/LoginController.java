package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.User;
import com.service.LoginService;

@Controller
@RequestMapping(value = "/login")
public class LoginController {

	@Autowired
	LoginService loginService;

	@RequestMapping(value = "role", method = RequestMethod.POST)
	public String loginForm(@RequestParam("username") String username, @RequestParam("pass") String pass, HttpSession session) {

		User user = loginService.loginUser(username, pass);
		String page = "login";
		if (user == null) {
			System.out.println("why null");
		}
		if (user != null) {
			if (user.getRole().getRoleName().equals("teacher")) {
				page = "teacher";
				System.out.println(user.getRole().getRoleName());
				// return "teacher";
				session.setAttribute("user", user);
				//return "rediect:/teacher";

			}
			if (user.getRole().getRoleName().equals("student")) {
				//page = "student";
				session.setAttribute("user", user);
				//return "student";
				user.getResults().iterator().hasNext();
                 return "redirect:/student";
			}
		}

		//return "redirect:/" + page;
      return null;
	}
//	@RequestMapping(value="/abc")   //<a href="abc">dfsfdhj</a>   return "student";
//	public String abc() {			
//		return "test";	
//	}
}
