package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.IRelationship1DAO;
import com.woniu.dao.IStudentDAO;
import com.woniu.dao.IUserDAO;

import com.woniu.dao.impl.UserDAOImpl;
import com.woniu.pojo.Relationship1;
import com.woniu.pojo.Role;
import com.woniu.pojo.Student;
import com.woniu.pojo.User;
import com.woniu.service.IStudentService;

@Service
@Transactional(rollbackFor = Exception.class)
public class StudentServiceImpl implements IStudentService {
	@Autowired
	private IStudentDAO st;
	@Autowired
	private IUserDAO us;
	@Autowired
	private IRelationship1DAO ir;
	@Override

    
	public void save(Student obj) {
		//从学生对象拿到 名字（变拼音） 电话 封装为user对象的名称和密码  保存到user表中
		System.out.println("哈哈哈======================");
		
	
		User user=new User();
		
		user.setUserName(obj.getSutdentCode());
		user.setUserPwd("123456");
		us.save(user);
		
		User nuser=us.findOneByUserName(user.getUserName());		
		obj.setUser(nuser);
		st.save(obj);
		Student student=st.findOneByStudentName(obj.getStudentName());	
		user.setStudent(student);
		//根绝上方的userName 找到该新User，将user对象set到学生对象中，并进行保存
		us.update(user);
//		Student nstudent =st.findOneByStudentId(obj.getStudentId());
		//从学生表中，根据学生姓名找到学生新对象，将学生新对象set  user对象中，update user对象
		Relationship1 re=new Relationship1();
		re.setUser(nuser);
		Role role=new Role();
		role.setRoleId(4);
		re.setRole(role);
		ir.save(re);
//		us.update(nuser);
		//新建关系对象，将新的user对象set进去；new role对象，其是学生角色，将学生对象set到关系对象中；保存该关系对象
		
		
		
	}

	@Override
	public void update(Student obj) {
		// TODO Auto-generated method stub
		st.update(obj);
	}

	@Override
	public List<Student> findAllByClazzId(Integer id) {
		// TODO Auto-generated method stub
		
		return st.findAllByClazzId(id);
	}

	@Override
	public Student findOneByStudentId(Integer id) {
		// TODO Auto-generated method stub
		return st.findOneByStudentId(id);
	}

}
