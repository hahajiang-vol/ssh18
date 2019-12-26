package com.woniu.action;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.struts2.ServletActionContext;
import org.junit.runner.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.mysql.fabric.xmlrpc.base.Data;
import com.woniu.pojo.Clazz;
import com.woniu.pojo.Overman;
import com.woniu.pojo.Student;
import com.woniu.pojo.User;
import com.woniu.service.IClazzService;
import com.woniu.service.IStudentService;
import com.woniu.service.impl.ClazzServiceImpl;
import com.woniu.util.StuExcel;

@Controller
public class StudentAction {
	
	@Autowired
	private IStudentService studentService;
	@Autowired
	private IClazzService clazzService;
	private Overman  sh;
	private Student st;
	private List<Student> sts;
	private File students;
	private String studentsFileName;
	private List<Clazz> clazzs;
	


	public List<Clazz> getClazzs() {
		return clazzs;
	}
	public void setClazzs(List<Clazz> clazzs) {
		this.clazzs = clazzs;
	}
	public File getStudents() {
		return students;
	}
	public void setStudents(File students) {
		this.students = students;
	}
	public String getStudentsFileName() {
		return studentsFileName;
	}
	public void setStudentsFileName(String studentsFileName) {
		this.studentsFileName = studentsFileName;
	}
	public IStudentService getStudentService() {
		return studentService;
	}
	public void setStudentService(IStudentService studentService) {
		this.studentService = studentService;
	}
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
	public List<Student> getSts() {
		return sts;
	}
	public void setSts(List<Student> sts) {
		this.sts = sts;
	}
	

	public String studentSave() {
		SimpleDateFormat sdf=new  SimpleDateFormat("yyyy-MM-dd");		  
		  try {
		  st.setStudentGraduateTime(sdf.parse(sdf.format(st.getStudentGraduateTime()))) ; } 
		  catch (ParseException e) { 
			  // TODO Auto-generated catch block
		  e.printStackTrace(); 
		  }
		studentService.save(st);
		
		return "studentSave";
	}
	public String studentUpdate() {
		                                   
		SimpleDateFormat sdf=new  SimpleDateFormat("yyyy-MM-dd");
		  
		try {
			st.setStudentGraduateTime(sdf.parse(sdf.format(st.getStudentGraduateTime()))); 
		} catch (ParseException e) { 
		  // TODO Auto-generated catch block
			e.printStackTrace();
		}	 
		studentService.update(st);
		return "studentUpdate";
	}
	public String studentFindone() {
		
		st=studentService.findOneByStudentId(st.getStudentId());

		clazzs = clazzService.findAll();
		Iterator<Clazz> ite = clazzs.iterator();
		while(ite.hasNext()) {
			Clazz clazz = ite.next();
			if(clazz.getOverman()==null) {
				ite.remove();
			}
		}
		ServletActionContext.getRequest().setAttribute("student",st);
		return "student";
	}
	public String studentSaveMany() {
		
		try {
			sts = StuExcel.readExcel(students);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (Student student : sts) {
			studentService.save(student);
		}		
		return "studentSave";
	}

	public String studentFindAll() {
		User user = (User) ServletActionContext.getRequest().getSession().getAttribute("loginUser");	
		
		Overman teacher = user.getOverman();
		
		Set<Clazz> clazzs = teacher.getClazzs();
		
		for (Clazz clazz : clazzs) {
			
			sts = studentService.findAllByClazzId(clazz.getClazzId());
			ServletActionContext.getRequest().getSession().setAttribute("clazzId", clazz.getClazzId());
		}
		
		return "list";

	}
	public String studentAll() {
		User user = (User) ServletActionContext.getRequest().getSession().getAttribute("loginUser");	
		
		Overman teacher = user.getOverman();
		
		Set<Clazz> clazzs = teacher.getClazzs();
		
		for (Clazz clazz : clazzs) {
			
			sts = studentService.findAllByClazzId(clazz.getClazzId());
			ServletActionContext.getRequest().getSession().setAttribute("clazzId", clazz.getClazzId());
		}
		
		return "li";

	}
}

