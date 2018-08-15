/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

/**
 *
 * @author Khoale123
 */
@Controller
@RequestMapping(value = "test")
public class Test {
    
    @RequestMapping(value = "/test1")
    public String hhh(){
        
        return "index";
    }
    
//          <h2>Đăng ký tài khoản</h2>
//        <form:form action="${pageContext.request.contextPath}/test/test1">
//            
//            <input type="submit" class="btn btn-default" value="Signup" />
//        </form:form>
              
    

    
    
}
