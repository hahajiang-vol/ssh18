package com.woniu.dao;

import org.springframework.stereotype.Repository;

import com.woniu.pojo.Checkintype;
@Repository
public interface ICheckintypeDAO {
	Checkintype findOneById(Integer id);
	
	Checkintype findOneByName(String name);
}
