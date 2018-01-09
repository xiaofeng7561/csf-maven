package com.csf.maven.advice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class TotalAdive {
@Before("execution(* com.csf.maven.service.impl.*ServiceImpl.*(..))")
public void before(){
	System.out.println("这是前置通告");
}	

public void afterReturning(){
	System.out.println("后置");
}

public void around(){
	System.out.println("环绕");
}

public void afterException(){
	System.out.println("出错后");
	
}
public void after(){
	System.out.println("异常也运行");
}
	
}
