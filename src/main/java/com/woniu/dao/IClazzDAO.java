package com.woniu.dao;

import java.util.List;

import com.woniu.pojo.Clazz;

public interface IClazzDAO {
	//��ѧ����
	void save(Clazz obj);
	void update(Clazz obj);
	List<Clazz> findAll();
	Clazz findOneById(Integer clazzid);
	//��ʦ
	Clazz findOneByTeacherId(Integer teacherid);
	//������
	Clazz findOneByOvermanId(Integer overmanid);

}
