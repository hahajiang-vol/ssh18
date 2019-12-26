package com.woniu.service;

import java.util.List;

import com.woniu.pojo.Checkin;

public interface ICheckinservice {
	
	List<Checkin> findAllByStudentId(Integer studentid);
	void save(Checkin Obj);

}
