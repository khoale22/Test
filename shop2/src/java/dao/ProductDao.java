/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.Product;
import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author Khoale123
 */
public class ProductDao {
    
    
    public ArrayList<Product> getAllproductByCategoryID(long categoryID){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String sql = "from product where categoryID = '"+categoryID +"'";
        Query query = session.createQuery(sql);
        ArrayList<Product> list = (ArrayList<Product>)query.list();
        transaction.commit();
        return list;
    }
    public Product getProductById(long productID){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String sql = "from product where productID = '"+productID +"'";
        Query query = session.createQuery(sql);
        Product product = (Product)query.uniqueResult();
        transaction.commit();
        return product;
        
        
        
    }
    
    public static void main(String[] args) {
        ProductDao pro = new ProductDao();
        System.out.print(pro.getAllproductByCategoryID(1).size());
    }
    
}
