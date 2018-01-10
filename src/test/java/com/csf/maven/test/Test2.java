package com.csf.maven.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.csf.maven.dao.impl.RoleDaoImpl;
import com.csf.maven.pojo.po.Role;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-springjdbc.xml")
public class Test2 {
	
	@Autowired
	private RoleDaoImpl r;
	
@Test
public void test1(){
	
	r.select();

}


}
