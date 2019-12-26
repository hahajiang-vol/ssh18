package com.woniu.service;

import java.util.List;

import com.woniu.pojo.Score;


public interface IScoreService {
	List<Score> findOneByStudentId(Integer studentid);
	void save(Score obj);

}
