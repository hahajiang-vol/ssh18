package com.woniu.service;

import com.woniu.pojo.Checkin;

public interface ICheckinservice {
	
	Checkin findOneByStudentId(Integer studentid);
	void save(Checkin Obj);

}
