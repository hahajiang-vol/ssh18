package com.woniu.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.ICheckinDAO;
import com.woniu.pojo.Checkin;
import com.woniu.service.ICheckinservice;

@Service
@Transactional
public class CheckinServiceImpl implements ICheckinservice {

	@Autowired
	ICheckinDAO checkinDAO;
	
	
	@Override
	public Checkin findOneByStudentId(Integer studentid) {
		// TODO Auto-generated method stub
		
		return checkinDAO.findOneByStudentId(studentid);
	}

	@Override
	public void save(Checkin Obj) {
		// TODO Auto-generated method stub
		checkinDAO.save(Obj);
	}

}
