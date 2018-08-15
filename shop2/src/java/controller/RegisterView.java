/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Khoale123
 */
@Controller
@RequestMapping(value = "/register")
public class RegisterView {

    @RequestMapping(value = "/register")
    public String redirectToRegister(Model model) {

        if (!model.containsAttribute("userABC")) {
            model.addAttribute("userABC", new User());
        }

        return "register";

    }

}
