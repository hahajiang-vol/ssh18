package com.woniu.dao;

import java.util.List;

import com.woniu.pojo.Score;

public interface IScoreDAO {

	List<Score> findOneByStudentId(Integer studentid);
	void save(Score obj);
}
