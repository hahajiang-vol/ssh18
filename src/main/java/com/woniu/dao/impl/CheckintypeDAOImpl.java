package com.woniu.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.woniu.dao.ICheckintypeDAO;
import com.woniu.pojo.Checkintype;

@Repository
public class CheckintypeDAOImpl implements ICheckintypeDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public Checkintype findOneById(Integer id) {
		// TODO Auto-generated method stub
		
		Checkintype checkintype = (Checkintype)sessionFactory.getCurrentSession().createQuery("from Checkintype where checkInType_id = "+ id).list().get(0);
		return checkintype!=null?checkintype:null;
	}

}
