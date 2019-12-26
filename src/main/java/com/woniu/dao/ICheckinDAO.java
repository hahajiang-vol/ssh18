package com.woniu.dao;

import org.springframework.stereotype.Repository;

import com.woniu.pojo.Checkin;
@Repository
public interface ICheckinDAO {
	Checkin findOneByStudentId(Integer studentid);
	void save(Checkin Obj);

}
