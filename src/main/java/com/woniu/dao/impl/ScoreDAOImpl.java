package com.woniu.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.woniu.dao.IScoreDAO;
import com.woniu.pojo.Score;
@Repository
public class ScoreDAOImpl implements IScoreDAO {
	@Autowired
	SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Score> findOneByStudentId(Integer Studentid) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Score where Student_id ="+Studentid).list();
	}
	@Override
	public void save(Score obj) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(obj);
		
	}
}
