package com.woniu.service;

import com.woniu.pojo.Checkintype;

public interface ICheckinTypeService {
	
	Checkintype findOneByName(String name);
}
