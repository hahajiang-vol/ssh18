package com.woniu.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.woniu.pojo.Relationship1;
import com.woniu.pojo.User;
import com.woniu.service.IUserService;

@SuppressWarnings("serial")
@Controller
public class UserAction extends ActionSupport  {

	@Autowired
	private IUserService userService;

	private User user;	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

	public String login() {
		
		user = userService.login(user);
		if(user!=null) {
			ServletActionContext.getRequest().getSession().setAttribute("loginUser", user);
			
			
			Set<Relationship1> relations = user.getRelationship1s();
			for (Relationship1 r : relations) {
				if(r.getRole().getRoleName().equals("教学主管")) {
					return "teacherBoss";
				}else if(r.getRole().getRoleName().equals("教师")) {
					return "teacher";
				}else if(r.getRole().getRoleName().equals("班主任")){
					return "overman";
				}else {
					return SUCCESS;
				}
			}
			
		}
		return "login";
	}
	
	public String save() {
		
		return SUCCESS;
	}
	
	public void userPwdSave() {
		user = (User) ServletActionContext.getRequest().getSession().getAttribute("loginUser");
		String userPwd0 = user.getUserPwd();
		String oldUserPwd = ServletActionContext.getRequest().getParameter("oldUserPwd");
		PrintWriter out = null;
		try {
			out = ServletActionContext.getResponse().getWriter();
			if (userPwd0.equals(oldUserPwd)) {
				user.setUserPwd(ServletActionContext.getRequest().getParameter("newUserPwd"));
				userService.update(user);
				out.print("true");
			}else {
				out.print("false");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			out.flush();
			out.close();
		}
	}
	public String exit() {
		ServletActionContext.getRequest().getSession().removeAttribute("loginUser");
		ServletActionContext.getRequest().getSession().invalidate();
		
		return SUCCESS;
	}
}
