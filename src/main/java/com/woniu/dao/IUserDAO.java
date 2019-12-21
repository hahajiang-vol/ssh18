package com.woniu.dao;

import org.springframework.stereotype.Repository;

import com.woniu.pojo.User;
@Repository
public interface IUserDAO {
	void save(User obj);
	void update(User obj);
	User findOneByUserName(String username);
}
