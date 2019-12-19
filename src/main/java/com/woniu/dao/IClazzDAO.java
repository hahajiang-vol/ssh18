package com.woniu.dao;

import java.util.List;

import com.woniu.pojo.Clazz;

public interface IClazzDAO {
	void save(Clazz obj);
	void update(Clazz obj);
	List<Clazz> findAll();
	Clazz findOneByTeacherId(Integer teacherid);
	Clazz findOneByOvermanId(Integer overmanid);

}
