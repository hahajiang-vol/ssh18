package com.woniu.action;


import java.text.DecimalFormat;
//import java.text.SimpleDateFormat;
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
import com.woniu.pojo.Teacher;
import com.woniu.pojo.User;
import com.woniu.povo.StudentCheckIn;
import com.woniu.service.ICheckinservice;
import com.woniu.service.IScoreService;
import com.woniu.service.IStudentService;

@SuppressWarnings("serial")
@Controller
public class TeacherAction extends ActionSupport{
	
	@Autowired
	private ICheckinservice checkinService;
	@Autowired
	private IScoreService scoreService;
	@Autowired
	private IStudentService studentService;
	
	private List<Checkin> checkins;
	private List<StudentCheckIn> stuCheckIns = new ArrayList<StudentCheckIn>();
	private List<Checkin> checkinDetails ;
	
	private List<Score> scores;
	private Score score;
	private Student student;
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Score getScore() {
		return score;
	}

	public void setScore(Score score) {
		this.score = score;
	}

	private List<Student> students;
	
	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public List<Score> getScores() {
		return scores;
	}

	public void setScores(List<Score> scores) {
		this.scores = scores;
	}

	public List<StudentCheckIn> getStuCheckIns() {
		return stuCheckIns;
	}

	public void setStuCheckIns(List<StudentCheckIn> stuCheckIns) {
		this.stuCheckIns = stuCheckIns;
	}
	public List<Checkin> getCheckins() {
		return checkins;
	}

	public void setCheckins(List<Checkin> checkins) {
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
			
			
			
			scores = scoreService.findOneByStudentId(stu.getStudentId());
			Double sum = 0.0;
			for (Score score : scores) {
				sum += score.getScoreNum();
			}
			DecimalFormat df1 = new DecimalFormat("0.00");
			double avg = sum/scores.size();
			double m = Double.parseDouble(df1.format(avg));

			stuCheckIn.setScoreAvg(m);//
			
			checkins = checkinService.findAllByStudentId(stu.getStudentId());
			double count = 0.0;
			for (Checkin checkin : checkins) {
				if(checkin.getCheckintype().getCheckInTypeId().equals(1)) {
					count++;
				}
			}
			DecimalFormat df2 = new DecimalFormat("0.000");
			double attendence = count/checkins.size();
			double n = Double.parseDouble(df2.format(attendence))*100;
			stuCheckIn.setCheckInRate(n);//
			stuCheckIns.add(stuCheckIn);
		}
		
		return SUCCESS;
	}
	public List<Checkin> getCheckinDetails() {
		return checkinDetails;
	}

	public void setCheckinDetails(List<Checkin> checkinDetails) {
		this.checkinDetails = checkinDetails;
	}

	public String checkinDetail() {
		Integer studentId = Integer.parseInt(ServletActionContext.getRequest().getParameter("studentId"));
		checkinDetails = checkinService.findAllByStudentId(studentId);
		student = studentService.findOneByStudentId(studentId);
		return SUCCESS;
	}
	
	public String showStuScores() {
		Integer studentId = Integer.parseInt(ServletActionContext.getRequest().getParameter("studentId"));
		scores = scoreService.findOneByStudentId(studentId);
		student = studentService.findOneByStudentId(studentId);
		return SUCCESS;
	}
	
	public String showClassStudents() {
		Teacher teacher = ((User)ServletActionContext.getRequest().getSession().getAttribute("loginUser")).getTeacher();

		if(teacher.getClazzs().iterator()!=null) {
			Clazz clazz = (Clazz)teacher.getClazzs().iterator().next();
			Integer clazzid = clazz.getClazzId();
			students = studentService.findAllByClazzId(clazzid);
		}
		
		return SUCCESS;
	}
	
	public String addStuScoresFrame() {
		Integer studentId = Integer.parseInt(ServletActionContext.getRequest().getParameter("studentId"));
		student = studentService.findOneByStudentId(studentId);
		return SUCCESS;
	}
	
	public String addStuScores() {
		score.setScoreDate(new Date());
		scoreService.save(score);
		return SUCCESS;
	}
	public String uploadScores() {
		
		
		return SUCCESS;
	}
	
	
	
	
}
