package com.controller;

import java.util.Iterator;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.Result;
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
	//	String page = "login";
		if (user == null) {
			System.out.println("why null");
		}
		if (user != null) {
			if (user.getRole().getRoleName().equals("teacher")) {
				//page = "teacher";
				System.out.println(user.getRole().getRoleName());
				// return "teacher";
				session.setAttribute("userId", username);
				session.setAttribute("user", user);
				return "redirect:/teacher";

			}
			if (user.getRole().getRoleName().equals("student")) {
				//page = "student";
				session.setAttribute("userId", username);
				session.setAttribute("user", user);
				//return "student";
				//user.getResults().iterator().hasNext(); bi loi?? @OneToMany(mappedBy="department", cascade = CascadeType.ALL, fetch=FetchType.EAGER)
                 // https://stackoverflow.com/questions/21574236/org-hibernate-lazyinitializationexception-could-not-initialize-proxy-no-sess
//				Iterator<Result> iterator = user.getResults().iterator();
//				while(iterator.hasNext()) {
//					 System.out.print(iterator.next() + "\t");
//				}
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
