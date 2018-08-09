package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.TeacherDao;
import com.model.User;

@Service
public class TeacherService {
	@Autowired
	TeacherDao teacherDao;

	public List<User> getAllStudent(String userId){
		return teacherDao.getAllStudent(userId);
		
	}
}
