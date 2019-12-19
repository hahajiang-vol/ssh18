package com.woniu.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.woniu.dao.IScoreDAO;
import com.woniu.pojo.Score;
@Repository
public class ScoreDAOImpl implements IScoreDAO {
	@Autowired
	SessionFactory sessionFactory;
	@Override
	public Score findOneByStudentId(Integer Studentid) {
		// TODO Auto-generated method stub
		return (Score)sessionFactory.getCurrentSession().createQuery("from Score where Student_id ="+Studentid).list().get(0);
	}
}
