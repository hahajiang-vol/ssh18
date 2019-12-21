package com.woniu.action;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.struts2.ServletActionContext;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.woniu.pojo.Checkin;
import com.woniu.pojo.Clazz;
import com.woniu.pojo.Score;
import com.woniu.pojo.Student;
import com.woniu.pojo.User;
import com.woniu.povo.StudentCheckIn;

@SuppressWarnings("serial")
@Controller
public class CheckinAction extends ActionSupport{
	
	
	
	private Set<Checkin> checkins;
	private List<StudentCheckIn> stuCheckIns = new ArrayList<StudentCheckIn>();
	
	public List<StudentCheckIn> getStuCheckIns() {
		return stuCheckIns;
	}

	public void setStuCheckIns(List<StudentCheckIn> stuCheckIns) {
		this.stuCheckIns = stuCheckIns;
	}
	public Set<Checkin> getCheckins() {
		return checkins;
	}

	public void setCheckins(Set<Checkin> checkins) {
		this.checkins = checkins;
	}
	
	
	@SuppressWarnings("unchecked")
	public String checkinFindAllByClassId() {
		
		User user = (User)ServletActionContext.getRequest().getSession().getAttribute("loginUser");
		Set<Clazz> clazzs =user.getTeacher().getClazzs();
		Set<Student> students = null;
		for (Clazz clazz : clazzs) {
			students = clazz.getStudents();
		}
		
		System.out.println(students);
		for(Student stu:students) {
			StudentCheckIn stuCheckIn = new StudentCheckIn();
			stuCheckIn.setStudentId(stu.getStudentId());//
			stuCheckIn.setStudentName(stu.getStudentName());//
			stuCheckIn.setStudentSex(stu.getStudentSex());//
			
			Set<Score> scores = stu.getScores();
			Double sum = 0.0;
			for (Score score : scores) {
				sum += score.getScoreNum();
			}
			stuCheckIn.setScoreAvg(sum/scores.size());//
			
			Set<Checkin> checkins = stu.getCheckins();
			double count = 0.0;
			for (Checkin checkin : checkins) {
				if(checkin.getCheckintype().getCheckInTypeName().equals("³öÇÚ")) {
					count++;
				}
			}
			stuCheckIn.setCheckInRate(count/checkins.size());//
			stuCheckIns.add(stuCheckIn);
		}
		
		return SUCCESS;
	}
	
	
}
