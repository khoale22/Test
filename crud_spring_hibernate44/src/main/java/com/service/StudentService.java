package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.StudentDao;
import com.model.Result;

@Service
public class StudentService {
	@Autowired
	StudentDao studentDao;
	
//	public List resultStudent(String userId) {
//		return studentDao.resultStudent(userId);
//		
//	}
	
	public List<Result> resultStudent(String userId){
		return studentDao.resultStudent(userId);
	}
}
