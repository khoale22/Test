/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Cart;
import model.Item;
import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.orm.hibernate3.SessionFactoryUtils;
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
@RequestMapping(value = "/cart")
public class CartServlet {
    
   
     @Autowired(required = true)
     ProductService productService;
    
    @RequestMapping(value = "/cart")
    public String ad(){
        
        return "cart";
    }
    @RequestMapping(value = "/add/{command}/{productID}")
    public String abc(HttpServletRequest request, HttpServletResponse response , @PathVariable("command") String command , @PathVariable("productID")  Long productID , ModelMap mm) throws IOException{
        
        
    //    mm.put("ProductByID", productService.getProductById(productID));
        
        Product product = productService.getProductById(productID);
        HttpSession session = request.getSession();
        Cart cart = (Cart) session.getAttribute("cart");
        
        
        switch(command){
            case "plus":
                if(cart.getCartitems().containsKey(productID)){
                    cart.plusToCart(productID, new Item(product, cart.getCartitems().get(productID).getQuanlity()));
                    
                //  int quanlity_new = (cart.getCartitems().get(productID).getQuanlity()) + 1;
                 // mm.put("quanlity_new", quanlity_new );
                    
                }else{
                    
                    cart.plusToCart(productID, new Item(product, 1));
                   
                     //  mm.put("quanlity_new", 1 );
                }
                break;
                
          
                    
            
            
        }
       //  session.setAttribute("cart", cart);
         return ("cart");
    }
    
}
