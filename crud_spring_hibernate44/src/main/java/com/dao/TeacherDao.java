package com.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.model.User;
@Repository
public class TeacherDao {
	@Autowired
	SessionFactory sessionfactory ;
	
	
	
	@Transactional
	public List<User> getAllStudent(String userId){
		Query query =  sessionfactory.getCurrentSession().createQuery("from User where userId not in ('user1')");
		//query.setParameter("userId", userId);
		return query.list();
	}
	

}
