package com.woniu.action;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.woniu.pojo.Clazz;
import com.woniu.pojo.Overman;
import com.woniu.pojo.Stage;
import com.woniu.pojo.Teacher;
import com.woniu.service.IClazzService;
import com.woniu.service.IOvermanService;
import com.woniu.service.ITeacherService;
/*
 * 便利老师班主任集合
 * 判断是否在带班
 * 
 */
@SuppressWarnings("serial")
@Controller
public class TeacherBossAction extends ActionSupport{
	
	@Autowired
	private IClazzService clazzService;
	@Autowired
	private IOvermanService overmanService;
	@Autowired
	private ITeacherService teacherService;
	private List<Teacher> teachers = new ArrayList<Teacher>();
	private List<Overman> overmans = new ArrayList<Overman>();
	private List<Clazz> clazzs = new ArrayList<Clazz>();
	private Clazz clazz;
	private Integer clazzId;
	
	
	
	public Integer getClazzId() {
		return clazzId;
	}
	public void setClazzId(Integer clazzId) {
		this.clazzId = clazzId;
	}
	public Clazz getClazz() {
		return clazz;
	}
	public void setClazz(Clazz clazz) {
		this.clazz = clazz;
	}
	public List<Teacher> getTeachers() {
		return teachers;
	}
	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}
	public List<Overman> getOvermans() {
		return overmans;
	}
	public void setOvermans(List<Overman> overmans) {
		this.overmans = overmans;
	}
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
	public String allTeacherAndOverman() {
		teachers = teacherService.findAll();
		overmans = overmanService.findAll();
		return "allTeacherAndOverman";
	}
	public String clazzSave() {
		//由于得不到阶段只能强制添加
		Stage s = new Stage();
		s.setStageId(1);
		clazz.setStage(s);
		clazzService.save(clazz);
		
		return "save";
	}
	public String clazzSaveUpdate() {
		
		clazzService.update(clazz);
		return "saveUpdate";
	}
	public String getOneClazzById() {
		clazz=clazzService.findOneById(clazzId);
		teachers = teacherService.findAll();
		return "getOneClazzById";
	}
	public String clazzCheckin() {
			
			return "clazzCheckin";
	}
	public String clazzScore() {
		
		return "clazzScore";
		
	}
}
