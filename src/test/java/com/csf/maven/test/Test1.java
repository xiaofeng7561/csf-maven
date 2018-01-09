package com.csf.maven.test;

import java.beans.PropertyVetoException;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.csf.maven.service.IUserService;
import com.mchange.v2.c3p0.ComboPooledDataSource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-test.xml")
public class Test1 {

@Resource
private IUserService service;
@Test
	public void test1(){
		service.save();
		
	}


@Test
public void test2(){
	
	SpelExpressionParser spelExpressionParser = new SpelExpressionParser();
	Expression parseExpression = spelExpressionParser.parseExpression("'hello'+'world'");
		String value = (String)parseExpression.getValue();
		System.out.println(value);

}

@Test
public void test3() throws PropertyVetoException{
	
	ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
	comboPooledDataSource.setDriverClass("com.mysql.jdbc.Driver");
	comboPooledDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/web1");
	comboPooledDataSource.setUser("root");
	comboPooledDataSource.setPassword("123");
	
	JdbcTemplate jdbcTemplate = new JdbcTemplate(comboPooledDataSource);
	 String sql = "update user set username=? where email=f@qq.com";
	 jdbcTemplate.update(sql,"11");
     
	
}



	
}
