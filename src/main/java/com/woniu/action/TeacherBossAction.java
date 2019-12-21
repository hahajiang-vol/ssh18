package com.woniu.action;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.woniu.pojo.Clazz;
import com.woniu.pojo.Overman;
import com.woniu.pojo.Teacher;
import com.woniu.service.IClazzService;

@Controller
public class TeacherBossAction extends ActionSupport{
	@Autowired
	private IClazzService clazzService;
	
	private List<Clazz> clazzs = new ArrayList<Clazz>();
	
	
	public List<Clazz> getClazzs() {
		return clazzs;
	}


	public void setClazzs(List<Clazz> clazzs) {
		this.clazzs = clazzs;
	}


	public String clazzAll() {
		clazzs=clazzService.findAll();
		
		return "success";
	}
	public String claazzSave() {
		clazzService.save(null);
		return "save";
	}
	public String clazzUpdate() {
		clazzService.update(null);
		return "update";
	}
}
