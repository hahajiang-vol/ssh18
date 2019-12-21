package com.woniu.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.IClazzDAO;
import com.woniu.pojo.Clazz;
import com.woniu.service.IClazzService;
@Service
@Transactional
public class ClazzServiceImpl implements IClazzService{

	@Autowired
	private IClazzDAO clazzdao;
	@Override
	public List<Clazz> findAll() {
		// TODO Auto-generated method stub
		return clazzdao.findAll();
	}
	@Override
	public void save(Clazz clazzobj) {
		// TODO Auto-generated method stub
		clazzdao.save(clazzobj);
	}
	@Override
	public void update(Clazz clazzobj) {
		// TODO Auto-generated method stub
		Clazz temp = clazzdao.findOneById(clazzobj.getClazzId());
		temp.setTeacher(clazzobj.getTeacher());
		temp.setStage(clazzobj.getStage());
		clazzdao.update(temp);
	}
	@Override
	public Clazz findOneById(Integer clazzobj) {
		// TODO Auto-generated method stub
		return clazzdao.findOneById(clazzobj);
	}
}
