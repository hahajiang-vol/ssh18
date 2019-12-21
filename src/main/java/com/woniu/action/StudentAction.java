package com.woniu.action;

import java.util.Set;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.pojo.Clazz;
import com.woniu.pojo.Overman;
import com.woniu.pojo.Student;
import com.woniu.pojo.User;
import com.woniu.service.IStudentService;



@Controller
public class StudentAction {
	
	
	@Autowired
	private IStudentService studentService;
	
	private Overman  sh;
	
	private Student st;
	private Set<Student> sts;

	public Overman getSh() {
		return sh;
	}
	public void setSh(Overman sh) {
		this.sh = sh;
	}
	public Student getSt() {
		return st;
	}
	public void setSt(Student st) {
		this.st = st;
	}
	public Set<Student> getSts() {
		return sts;
	}
	public void setSts(Set<Student> sts) {
		this.sts = sts;
	}


	public String studentSave() {
		
		
		 st.setStudentGraduateTime(new java.util.Date());
		 
		  studentService.save(st);
		 
		return "studentSave";
	}
	
	
	
	  public String studentUpdate() { 
		  studentService.update(st);
	
		  return "studentUpdate"; 
	  
	}
	 
	public String studentFindAll() {
		User user = (User) ServletActionContext.getRequest().getSession().getAttribute("loginUser");	
		
		Overman teacher = user.getOverman();
		
		Set<Clazz> clazzs = teacher.getClazzs();
	
		
		for (Clazz clazz : clazzs) {
			
			sts = clazz.getStudents();
			
		}
		return "list";		
	}
}
