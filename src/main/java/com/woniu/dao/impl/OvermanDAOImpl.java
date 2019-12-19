package com.woniu.dao.impl;


import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.woniu.dao.IOvermanDAO;
import com.woniu.pojo.Overman;
@Repository
public class OvermanDAOImpl implements IOvermanDAO{
	@Autowired
	SessionFactory sessionFactory;
	@SuppressWarnings("unchecked")
	@Override
	public List<Overman> findAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createCriteria(Overman.class).list();
	}
	
	@Override
	public Overman findOneById(Integer Overmanid) {
		// TODO Auto-generated method stub
		return (Overman)sessionFactory.getCurrentSession().createQuery("from Overman where overman_id = "+Overmanid).list().get(0);
	}
}
