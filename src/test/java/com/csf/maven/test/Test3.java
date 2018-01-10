package com.csf.maven.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.csf.maven.service.IAccountService;
import com.csf.maven.service.impl.AccountServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-springjdbc2.xml")
public class Test3 {
	
@Autowired
private IAccountService accountServiceImpl;
@Test
public void test1(){
	accountServiceImpl.transfer(1, 2, 100);
	
	
}	
}
