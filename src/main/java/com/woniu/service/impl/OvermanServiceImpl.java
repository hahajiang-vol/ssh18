package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woniu.dao.IOvermanDAO;
import com.woniu.pojo.Overman;
import com.woniu.service.IOvermanService;
@Service
public class OvermanServiceImpl implements IOvermanService {
	@Autowired
	private IOvermanDAO overmandao;
	@Override
	public List<Overman> findAll() {
		// TODO Auto-generated method stub
		return overmandao.findAll();
	}
	
}
