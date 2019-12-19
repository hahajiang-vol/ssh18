package com.woniu.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.woniu.dao.IStageDAO;
import com.woniu.pojo.Stage;
@Repository
public class StageDAOImpl implements IStageDAO {
	@Autowired
	SessionFactory sessionFactory;
	@Override
	public Stage findOneById(Integer Stageid) {
		// TODO Auto-generated method stub
		return (Stage)sessionFactory.getCurrentSession().createQuery("from Stage where stage_id = "+Stageid).list().get(0);
	}

	

}
