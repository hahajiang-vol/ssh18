package com.woniu.service;

import com.woniu.pojo.User;

public interface IUserService {

	User login(User obj);
	void update(User obj);
}
