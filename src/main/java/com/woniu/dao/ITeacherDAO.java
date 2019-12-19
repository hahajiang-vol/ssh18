package com.woniu.dao;

import java.util.List;

import com.woniu.pojo.Teacher;

public interface ITeacherDAO {

	List<Teacher> findAll() ;
	Teacher findOneById(Integer id);
}
