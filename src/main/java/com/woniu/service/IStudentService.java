package com.woniu.service;

import java.util.List;

import com.woniu.pojo.Student;

public interface IStudentService {
	void save(Student obj);
	void update(Student obj);
	List<Student> findAllByClazzId(Integer id);
	Student findOneByStudentId(Integer id);
}
