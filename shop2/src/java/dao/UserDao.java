/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import static com.mchange.v2.c3p0.impl.C3P0Defaults.user;
import model.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author Khoale123
 */
public class UserDao {
    public boolean insertUser(User user){
        try {
             Session session = HibernateUtil.getSessionFactory().getCurrentSession();
            Transaction transaction = session.beginTransaction();
            session.save(user);
            transaction.commit();       
            return true;
            
        } catch (Exception e) {
            
            e.printStackTrace();
            
        }
           
        return false;
    }
   public boolean checkEmail(String email) {
     
           Session session = HibernateUtil.getSessionFactory().getCurrentSession();
       Transaction transaction = session.beginTransaction();
     Query query = session.createQuery("from users where userEmail = :userEmail");
     query.setString("userEmail", email);
     User user = (User) query.uniqueResult();
     transaction.commit();  
     return user != null ;
}
   
   
   public User login(String userEmail, int userPass) {
    try {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("from users where userEmail = :userEmail and userPass = :userPass");
        query.setString("userEmail", userEmail);
        query.setInteger("userPass", userPass);
        User user = (User) query.uniqueResult();
        transaction.commit();
        return user;
    } catch (Exception e) {
        e.printStackTrace();
    }
    return null;
}
    
    public static void main(String[] args) {
        
        UserDao userDao = new UserDao();
        
        userDao.insertUser(new User(1, "khoa", "hbkkhoa1@gmail.com", "12345", true));
     
    // userDao.checkEmail("hbkkhoa1@gmail.com6");
        
        
        
    }
    
    
    
    
}
