package com.woniu.dao;

import java.util.List;

import com.woniu.pojo.Checkin;
import org.springframework.stereotype.Repository;


import com.woniu.pojo.Checkin;
@Repository
public interface ICheckinDAO {
	List<Checkin> findAllByStudentId(Integer studentid);
	void save(Checkin Obj);

}
