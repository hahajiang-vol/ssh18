package com.woniu.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.woniu.dao.ICheckinDAO;
import com.woniu.pojo.Checkin;


@Repository
public class CheckinDAOImpl implements ICheckinDAO {

	@Autowired
	SessionFactory sessionFactory;	
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Checkin> findAllByStudentId(Integer studentid) {
		// TODO Auto-generated method stub
		List<Checkin> checkins =sessionFactory.getCurrentSession().createQuery("from Checkin where student_id = "+ studentid).list();

		return checkins!=null?checkins:null;
	}

	@Override
	public void save(Checkin Obj) {
		// TODO Auto-generated method stub

		sessionFactory.getCurrentSession().save(Obj);
	}

}
