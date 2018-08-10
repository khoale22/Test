package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.TestDao;
import com.model.User;

@Service
public class TestService {
	@Autowired
	TestDao testDao ;
	
	public List<User> joinTable(){
		return testDao.joinTable();
	}

}
