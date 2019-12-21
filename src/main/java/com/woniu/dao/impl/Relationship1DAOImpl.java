package com.woniu.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.woniu.dao.IRelationship1DAO;
import com.woniu.pojo.Relationship1;
@Repository
public class Relationship1DAOImpl implements IRelationship1DAO {
	@Autowired
	SessionFactory sessionFactory;
	@SuppressWarnings("unchecked")
	@Override
	public void save(Relationship1 obj) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(obj);
	}

}
