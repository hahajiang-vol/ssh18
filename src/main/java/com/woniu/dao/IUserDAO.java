package com.woniu.dao;

import com.woniu.pojo.User;

public interface IUserDAO {
	void save(User obj);
	void update(User obj);
	User findOneByUserName(String username);
}
