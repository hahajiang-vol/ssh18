package com.woniu.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.woniu.dao.ICheckinDAO;
import com.woniu.pojo.Checkin;


@Repository
public class CheckinDAOImpl implements ICheckinDAO {

	@Autowired
	SessionFactory sessionFactory;	
	
	
	@Override
	public Checkin findOneByStudentId(Integer studentid) {
		// TODO Auto-generated method stub
		Checkin checkin =(Checkin)sessionFactory.getCurrentSession().createQuery("from Checkin where checkIn_id = "+ studentid).list().get(0);

		return checkin!=null?checkin:null;
	}

	@Override
	public void save(Checkin Obj) {
		// TODO Auto-generated method stub

		sessionFactory.getCurrentSession().save(Obj);
	}

}
