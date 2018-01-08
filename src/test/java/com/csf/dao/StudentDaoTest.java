package com.csf.dao;





import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.csf.dao.impl.IStudentDao;
import com.csf.pojo.po.Student;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-test.xml")
public class StudentDaoTest implements IStudentDao{
	@Autowired
	private Student s;
	
	
	@Override
	@Test
	public void containerTest() {
		System.out.println(s.getClazz().getName());
	}

}
