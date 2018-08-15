/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Timestamp;
import java.util.Date;
import model.Bill;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author Khoale123
 */
public class BillDao {
    public boolean insertBIll(Bill bill){
       boolean check;
        try {
            Session session = HibernateUtil.getSessionFactory().getCurrentSession();
            Transaction transaction = session.beginTransaction();
            session.save(bill);
            transaction.commit();
            check = true;
        } catch (Exception h) {
            check = false;
        }
        return check;
        
    }
    
    public static void main(String[] args) {
        
        BillDao billDao = new BillDao();
      billDao.insertBIll(new Bill(1,  2, 78, "card", "15tongocvan", new Timestamp(new Date().getTime()) ));
      
      
      
      
        
    }
    
    
}
