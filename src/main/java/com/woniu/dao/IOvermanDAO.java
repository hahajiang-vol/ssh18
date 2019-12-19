package com.woniu.dao;

import java.util.List;

import com.woniu.pojo.Overman;

public interface IOvermanDAO {

	List<Overman> findAll();
	Overman findOneById(Integer id);
}
