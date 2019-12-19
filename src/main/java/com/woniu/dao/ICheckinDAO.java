package com.woniu.dao;

import com.woniu.pojo.Checkin;

public interface ICheckinDAO {
	Checkin findOneByStudentId(Integer studentid);
	void save(Checkin Obj);

}
