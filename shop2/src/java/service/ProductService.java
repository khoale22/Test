/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.ProductDao;
import java.util.ArrayList;
import model.Product;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Khoale123
 */
public class ProductService {
    @Autowired
    ProductDao productDao;
    
    
    
     public ArrayList<Product> getAllproductByCategoryID(long categoryID){
         return productDao.getAllproductByCategoryID(categoryID);
         
     }
     public Product getProductById(long ProductID){
         return productDao.getProductById(ProductID);
         
     }
     
     
     
}
