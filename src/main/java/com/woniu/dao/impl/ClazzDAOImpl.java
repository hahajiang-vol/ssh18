package com.woniu.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.woniu.dao.IClazzDAO;
import com.woniu.pojo.Clazz;

@Repository
public class ClazzDAOImpl implements IClazzDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public void save(Clazz obj) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(obj);
	}

	@Override
	public void update(Clazz obj) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(obj);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Clazz> findAll() {
		// TODO Auto-generated method stub
		
		return sessionFactory.getCurrentSession().createCriteria(Clazz.class).list();
	}

	@Override
	public Clazz findOneByTeacherId(Integer teacherid) {
		// TODO Auto-generated method stub
		
		Clazz clazz = (Clazz)sessionFactory.getCurrentSession().createQuery("from Clazz where teacher_id = "+ teacherid).list().get(0);
		return clazz!=null?clazz:null;
	}

	@Override
	public Clazz findOneByOvermanId(Integer overmanid) {
		// TODO Auto-generated method stub
		Clazz clazz = (Clazz)sessionFactory.getCurrentSession().createQuery("from Clazz where overman_id = "+ overmanid).list().get(0);
		return clazz!=null?clazz:null;
	}

	@Override
	public Clazz findOneById(Integer clazzid) {
		Clazz clazz = (Clazz)sessionFactory.getCurrentSession().createQuery("from Clazz where clazz_id = "+ clazzid).list().get(0);
		return clazz!=null?clazz:null;
	}
}
