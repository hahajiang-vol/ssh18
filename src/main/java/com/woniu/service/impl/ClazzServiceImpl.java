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
		System.out.println("===========================================");
		System.out.println(clazzobj.getClazzId());
		System.out.println(clazzobj.getClazzName());
		System.out.println(clazzobj.getClazzType());
		System.out.println(clazzobj.getOverman().getOvermanId());
		System.out.println(clazzobj.getStage().getStageId());
		System.out.println(clazzobj.getTeacher().getTeacherId());
		Clazz temp = clazzdao.findOneById(clazzobj.getClazzId());
		temp.setTeacher(clazzobj.getTeacher());
		temp.setStage(clazzobj.getStage());
		System.out.println(temp);
		clazzdao.update(temp);
		
	}
	@Override
	public Clazz findOneById(Integer clazzobj) {
		// TODO Auto-generated method stub
		return clazzdao.findOneById(clazzobj);
	}
	@Override
	public void endOneById(Integer clazzId) {
		// TODO Auto-generated method stub
		Clazz clazz = clazzdao.findOneById(clazzId);
		clazz.setTeacher(null);
		clazz.setOverman(null);
		
		clazzdao.update(clazz);
	}
	
}
