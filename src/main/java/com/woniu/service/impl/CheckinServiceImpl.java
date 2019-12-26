package com.woniu.service.impl;


import java.util.List;

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
	public List<Checkin> findAllByStudentId(Integer studentid) {
		// TODO Auto-generated method stub
		
		return checkinDAO.findAllByStudentId(studentid);
	}

	@Override
	public void save(Checkin Obj) {
		// TODO Auto-generated method stub
		checkinDAO.save(Obj);
	}

}
