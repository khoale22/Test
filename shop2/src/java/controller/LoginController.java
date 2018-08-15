/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.UserDao;
import javax.servlet.http.HttpSession;
import jdk.nashorn.internal.ir.RuntimeNode.Request;
import org.springframework.stereotype.Controller;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.request;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.portlet.bind.annotation.RenderMapping;
import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;   
import model.User;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
/**
 *
 * @author Khoale123
 */
@Controller
@RequestMapping(value = "/login")
public class LoginController {
    
    @RequestMapping(value = "/View")
    public String View(){
        
        
        return "login";
    }
    
     @RequestMapping(value = "/DoIt" ,method = RequestMethod.POST)
    public String doit(HttpServletRequest request, HttpServletResponse response,@RequestParam("email") String email , @RequestParam("pass") int pass ){
        UserDao userDao = new UserDao();
        User user = userDao.login(email, pass);
        if(user == null){
            
            return "login";
        }else{
            
       HttpSession session=request.getSession();  
       
       session.setAttribute("user",user );
        
       return "index";
        }
        
    }
//  
//      KHONG DC VI O DAY CHI DUNG DE GET MODEL
//        <form:form action="${pageContext.request.contextPath}/login/DoIt" method="post">
//            Id: <form:input path="email" />
//            <br/>
//            Name: <form:input path="pass" />
//            <span><a href="x">Quên mật khẩu?</a></span>
//            <input type="submit" class="btn btn-default" value="Login" />
//            </form:form>
}
