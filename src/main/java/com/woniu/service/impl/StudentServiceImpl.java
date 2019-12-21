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
		//��ѧ�������õ� ���֣���ƴ���� �绰 ��װΪuser��������ƺ�����  ���浽user����
		System.out.println("������======================");
		
	
		User user=new User();
		
		user.setUserName(obj.getSutdentCode());
		user.setUserPwd("123456");
		us.save(user);
		
		User nuser=us.findOneByUserName(user.getUserName());		
		obj.setUser(nuser);
		st.save(obj);
		Student student=st.findOneByStudentName(obj.getStudentName());	
		user.setStudent(student);
		//�����Ϸ���userName �ҵ�����User����user����set��ѧ�������У������б���
		us.update(user);
//		Student nstudent =st.findOneByStudentId(obj.getStudentId());
		//��ѧ�����У�����ѧ�������ҵ�ѧ���¶��󣬽�ѧ���¶���set  user�����У�update user����
		Relationship1 re=new Relationship1();
		re.setUser(nuser);
		Role role=new Role();
		role.setRoleId(4);
		re.setRole(role);
		ir.save(re);
//		us.update(nuser);
		//�½���ϵ���󣬽��µ�user����set��ȥ��new role��������ѧ����ɫ����ѧ������set����ϵ�����У�����ù�ϵ����
		
		
		
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
