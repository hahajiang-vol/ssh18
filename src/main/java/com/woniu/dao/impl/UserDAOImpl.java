package com.woniu.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.woniu.dao.IUserDAO;
import com.woniu.pojo.User;

@Repository
public class UserDAOImpl implements IUserDAO {
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public void save(User obj) {
		// TODO Auto-generated method stub
		System.out.println("obj"+obj.getUserName());
		sessionFactory.getCurrentSession().save(obj);

	}

	@Override
	public void update(User obj) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(obj);
	}

	@Override
	public User findOneByUserName(String username) {
		// TODO Auto-generated method stub
		
		List<User> users = sessionFactory.getCurrentSession().createQuery("from User where user_name = '" + username+"'").list();
		return users.size()!=0?users.get(0):null;
	}

}
