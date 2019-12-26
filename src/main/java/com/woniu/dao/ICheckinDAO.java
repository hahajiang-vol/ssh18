package com.woniu.dao;

import java.util.List;

import com.woniu.pojo.Checkin;

public interface ICheckinDAO {
	List<Checkin> findAllByStudentId(Integer studentid);
	void save(Checkin Obj);

}
