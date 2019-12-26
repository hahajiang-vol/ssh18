package com.woniu.service;

import java.util.List;

import com.woniu.pojo.Clazz;

public interface IClazzService {

	List<Clazz> findAll();
	void save(Clazz Clazzobj);
	void update(Clazz Clazzobj);
	Clazz findOneById(Integer Clazzobj);
	void endOneById(Integer clazzId);
}
