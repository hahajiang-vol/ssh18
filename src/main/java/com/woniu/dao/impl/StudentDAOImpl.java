package com.woniu.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.woniu.dao.IStudentDAO;
import com.woniu.pojo.Student;
import com.woniu.pojo.User;
@Repository
public class StudentDAOImpl implements IStudentDAO {
	@Autowired
	SessionFactory sessionFactory;
	@Override
	public void save(Student obj) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(obj);
	}

	@Override
	public void update(Student obj) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(obj);
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Student> findAllByClazzId(Integer clazzid) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Student where clazz_id ="+clazzid).list();
	}

	@Override
	public Student findOneByStudentId(Integer studentid) {
		// TODO Auto-generated method stub
		return (Student)sessionFactory.getCurrentSession().createQuery("from Student where student_id ="+studentid).list().get(0);
	}

	@Override
	public Student findOneByStudentName(String name) {
		// TODO Auto-generated method stub
		Student student =(Student)sessionFactory.getCurrentSession().createQuery("from Student where student_name = '" + name+"'").list().get(0);
		return student!=null?student:null;
	}
}
