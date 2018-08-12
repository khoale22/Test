package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.StudentDao;
import com.model.Result;
import com.model.User;

@Service
public class StudentService {
	@Autowired
	StudentDao studentDao;
	public List<Result> resultStudent(String userId){
		return studentDao.resultStudent(userId);
	}
	public Result eachResultStudent(String subjectName , String userId)  {
		return studentDao.eachResultStudent(subjectName, userId);
	}
	public Result update(Result result) {
		return studentDao.update(result);
	}
	public void deleteUser2(String userId) {
		 studentDao.deleteUser2(userId); 
	}
}
 