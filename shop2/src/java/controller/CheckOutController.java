/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;
import model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Khoale123
 */
@Controller
@RequestMapping(value = "/CheckOut")
public class CheckOutController {
    
    @RequestMapping(value = "/DoIt" ,method = RequestMethod.POST)
    public String ViewCheckout(HttpSession session){
        
        User user = (User) session.getAttribute("user") ;
        if(user ==null){
         
           return "login";
            
        }else{
            session.setAttribute("user", user);
              JOptionPane.showMessageDialog(null, "BAn da them gio hang thanh cong",
                  "Title", JOptionPane.WARNING_MESSAGE);
           return "Index";
           
        }
        
       
        
    }
    
//    @RequestMapping(value = "/CheckOut")
//    public 
    
    
    
    
}
