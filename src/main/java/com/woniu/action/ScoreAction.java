package com.woniu.action;

import java.util.Set;

import org.apache.struts2.ServletActionContext;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.woniu.pojo.Student;
import com.woniu.pojo.User;

@Controller
public class ScoreAction extends ActionSupport {

	private Set scores;

	public Set getScores() {
		return scores;
	}
	public void setScores(Set scores) {
		this.scores = scores;
	}



	public String scoresFindAllByStuId() {
		User user = (User) ServletActionContext.getRequest().getSession().getAttribute("loginUser");
		/*
		 * Set<Student> set = user.getStudents(); for (Student stu : set) { scores =
		 * stu.getScores(); }
		 */
		scores = user.getStudent().getScores();
		return SUCCESS;
	}
}
