package com.woniu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.IUserDAO;
import com.woniu.pojo.User;
import com.woniu.service.IUserService;

@Service
@Transactional
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserDAO userDao;
	
	@Override
	public User login(User obj) {
		// TODO Auto-generated method stub
		
		User temp = userDao.findOneByUserName(obj.getUserName());
		if(temp!=null && temp.getUserPwd().equals(obj.getUserPwd())) {
			return temp;
		}
		
		return null;
	}

}
