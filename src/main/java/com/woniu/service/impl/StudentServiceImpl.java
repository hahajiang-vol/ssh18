package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woniu.dao.IStudentDAO;
import com.woniu.pojo.Student;
import com.woniu.service.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {
	@Autowired
	IStudentDAO st;
	@Override
	public void save(Student obj) {
		// TODO Auto-generated method stub
		st.save(obj);
	}

	@Override
	public void update(Student obj) {
		// TODO Auto-generated method stub
		st.update(obj);
	}

	@Override
	public List<Student> findAllByClazzId(Integer id) {
		// TODO Auto-generated method stub
		
		return st.findAllByClazzId(id);
	}

	@Override
	public Student findOneByStudentId(Integer id) {
		// TODO Auto-generated method stub
		return st.findOneByStudentId(id);
	}

}
