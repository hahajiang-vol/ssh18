package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.IScoreDAO;
import com.woniu.pojo.Score;
import com.woniu.service.IScoreService;


@Service
@Transactional
public class ScoreServiceImpl implements IScoreService {

	@Autowired
	IScoreDAO iscoreDAO;
	
	@Override
	public List<Score> findOneByStudentId(Integer studentid) {
		
		return iscoreDAO.findOneByStudentId(studentid);
	}

	@Override
	public void save(Score obj) {
		// TODO Auto-generated method stub
		iscoreDAO.save(obj);
	}

}
