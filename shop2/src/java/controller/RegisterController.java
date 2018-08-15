/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import check.UserValidation;
import dao.UserDao;
import model.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Khoale123
 */

@Controller

public class RegisterController {
    
    @RequestMapping(value = "/Doit", method = RequestMethod.POST)
    public String abc( @ModelAttribute("userABC") User userABC ,BindingResult result){
        UserDao userDao = new UserDao();
        UserValidation userValidation= new UserValidation();
        userValidation.validate(userABC, result);
      
        
        if(result.hasErrors()){
            return  "register";
        }
        else{
            
            userDao.insertUser(userABC);
        }
        
        return "index";
    }
    
    
    
}
