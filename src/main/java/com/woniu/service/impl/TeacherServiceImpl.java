package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woniu.dao.ITeacherDAO;
import com.woniu.pojo.Teacher;
import com.woniu.service.ITeacherService;
@Service
public class TeacherServiceImpl implements ITeacherService {
	@Autowired
	private ITeacherDAO teacherdao;
	@Override
	public List<Teacher> findAll() {
		// TODO Auto-generated method stub
		return teacherdao.findAll();
	}
	
	

}
