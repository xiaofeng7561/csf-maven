package com.csf.dao;


import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.csf.dao.impl.IStudentDao;
import com.csf.pojo.po.Student;

public class StudentDao implements IStudentDao{

	@Override
	@Test
	public void containerTest() {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Student s = ac.getBean("student", Student.class);
		System.out.println(s);
	}

}
