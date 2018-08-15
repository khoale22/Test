/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.CategoryDao;
import model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import service.CategoryService;

/**
 *
 * @author TUNGDUONG
 */
@Controller

@RequestMapping(value = "/home")
public class HomepageController {
    @Autowired(required = true)
    CategoryService categoryService ;
    
    
    @RequestMapping(value = "/index")
    public String index(ModelMap mm){
      mm.put("listCategory", categoryService.getAllCatelogy());
        return "index";
        
  }
//     public String index(ModelMap mm){
//     // mm.put("listCategory", categogyDao.getAllcategory());
//     mm.addAttribute("listCategory", categogyDao.getAllcategory());
//      
//        return "index";
//        
//    }
    
    
    
    
}
