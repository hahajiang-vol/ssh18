package com.woniu.dao;

import java.util.List;

import com.woniu.pojo.Clazz;

public interface IClazzDAO {
	//教学主管
	void save(Clazz obj);
	void update(Clazz obj);
	List<Clazz> findAll();
	Clazz findOneById(Integer clazzid);
	//教师
	Clazz findOneByTeacherId(Integer teacherid);
	//班主任
	Clazz findOneByOvermanId(Integer overmanid);

}
