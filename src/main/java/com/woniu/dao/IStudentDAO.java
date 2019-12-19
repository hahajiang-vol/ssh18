package com.woniu.dao;

import java.util.List;

import com.woniu.pojo.Student;

public interface IStudentDAO {
	void save(Student obj);
	void update(Student obj);
	List<Student> findAllByClazzId(Integer id);
	Student findOneByStudentId(Integer id);
}
