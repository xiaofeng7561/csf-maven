package com.csf.maven.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.csf.maven.service.IAccountService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-springjdbc3.xml")
public class Test4 {
	@Autowired
	private IAccountService accountServiceImpl;
	@Test
	public void test1(){
		accountServiceImpl.transfer(1, 2, 100);
		
		
	}	
}
