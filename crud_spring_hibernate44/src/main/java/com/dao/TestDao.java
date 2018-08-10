package com.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.User;

@Repository
public class TestDao {
	@Autowired
	SessionFactory sessionfactory ;
	
	
	
	@SuppressWarnings("unchecked")
	@Transactional
	public List<User> joinTable(){
		return sessionfactory.getCurrentSession().createQuery(" from User user join user.role role ").list();
	}
}
