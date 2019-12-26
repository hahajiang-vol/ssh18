package com.woniu.action;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.woniu.pojo.Checkin;
import com.woniu.pojo.Clazz;
import com.woniu.pojo.Score;
import com.woniu.pojo.Student;
import com.woniu.pojo.User;
import com.woniu.povo.StudentCheckIn;
import com.woniu.service.ICheckinTypeService;
import com.woniu.service.ICheckinservice;

@SuppressWarnings("serial")
@Controller
public class CheckinAction extends ActionSupport{
	
	@Autowired
	private ICheckinservice  checkinservice;
	private Checkin checkin;
	@Autowired
	private ICheckinTypeService checkintypeservice;
	
	private Set<Checkin> checkins;
	private List<StudentCheckIn> stuCheckIns = new ArrayList<StudentCheckIn>();
	
	
	
	public ICheckinservice getCheckinservice() {
		return checkinservice;
	}

	public void setCheckinservice(ICheckinservice checkinservice) {
		this.checkinservice = checkinservice;
	}

	public ICheckinTypeService getCheckintypeservice() {
		return checkintypeservice;
	}

	public void setCheckintypeservice(ICheckinTypeService checkintypeservice) {
		this.checkintypeservice = checkintypeservice;
	}

	public Checkin getCheckin() {
		return checkin;
	}

	public void setCheckin(Checkin checkin) {
		this.checkin = checkin;
	}

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
	
	public String checkinSave() {
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++"+checkin);
		checkin.setCheckInDate(new Date());
		ServletActionContext.getRequest().getSession().setAttribute("che", checkin);
		checkinservice.save(checkin);
		return "checkinSave";
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
