/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.ProductService;

/**
 *
 * @author Khoale123
 */

@Controller
@RequestMapping(value = "/product")
public class ProductController {
    
    @Autowired 
    ProductService productService;
    
    
    @RequestMapping(value = "/list/{categoryID}")
    public String getProductByCategoryId(HttpServletRequest request, HttpServletResponse response ,ModelMap mm , @PathVariable("categoryID") long categoryID){
        
     HttpSession session = request.getSession();
       // Cart cart = (Cart) session.getAttribute("cart");
      //  session.setAttribute("cart", cart);
        mm.put("listProduct", productService.getAllproductByCategoryID(categoryID));
        return "product";
    }
    
}
