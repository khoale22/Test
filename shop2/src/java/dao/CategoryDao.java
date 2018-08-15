/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import org.hibernate.Query;
import java.util.ArrayList;
//import javax.persistence.Query;
import model.Category;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author Khoale123
 */
public class CategoryDao {
    


public ArrayList<Category> getAllcategory(){
     Session session = HibernateUtil.getSessionFactory().getCurrentSession();
     Transaction transaction = session.beginTransaction();
     Query query = (Query) session.createQuery("from category");
     ArrayList<Category> list = (ArrayList<Category>) query.list();
     transaction.commit();
     return list;
}
    public static void main(String[] args) {
        
        CategoryDao categoryDao = new CategoryDao();
        System.out.println(categoryDao.getAllcategory());
         System.out.println("HFDJFHDHFKJDHFKJ");
        
       ArrayList<Category> list = categoryDao.getAllcategory();
       
       for (Category category : list){
            System.out.println(category.getCategoryName());
           
       }
       
       
        
        
        
    }


    
}
