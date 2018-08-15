/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.CategoryDao;
import java.util.ArrayList;
import model.Category;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Khoale123
 */
public class CategoryService {
    
    @Autowired 
    CategoryDao categoryDao;
    public ArrayList<Category> getAllCatelogy(){
        
        return categoryDao.getAllcategory();
        
    }
    
}
