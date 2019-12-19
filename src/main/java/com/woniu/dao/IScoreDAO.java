package com.woniu.dao;

import com.woniu.pojo.Score;

public interface IScoreDAO {

	Score findOneByStudentId(Integer studentid);
}
