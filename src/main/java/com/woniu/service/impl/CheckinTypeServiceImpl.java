package com.woniu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.ICheckintypeDAO;
import com.woniu.pojo.Checkintype;
import com.woniu.service.ICheckinTypeService;
@Service
public class CheckinTypeServiceImpl implements ICheckinTypeService{
	@Autowired
	ICheckintypeDAO checkintypeDAO;
	@Override
	public Checkintype findOneByName(String name) {
		
		// TODO Auto-generated method stub
		
		return checkintypeDAO.findOneByName(name);
	}

}
