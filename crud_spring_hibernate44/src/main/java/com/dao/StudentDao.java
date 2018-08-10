package com.dao;

import java.util.List;

//import javax.management.Query;
import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Result;

@Repository
public class StudentDao {
	@Autowired
	SessionFactory sessionFactory;
//
//	@Transactional
//	public List resultStudent(String userId) {
//		String hql = "select user_name , subject_name , result from user join result\r\n" + 
//				" on user.user_id = result.user_id join subject on subject.subject_id = result.subject_id\r\n" + 
//				" where user.user_id=:userId";
//		Query query = sessionFactory.getCurrentSession().createSQLQuery(hql);
//		query.setParameter("userId", userId);
//		
//		return  query.list();
//	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<Result> resultStudent(String userId) {
		Query query = sessionFactory.getCurrentSession().createQuery("from Result where user.userId=:userId");
		query.setParameter("userId", userId);
		return query.list();

	}
	

}
