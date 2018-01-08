package com.csf.pojo.po;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Controller
public class Student {
@Value("18")
	private int age;
@Value("石狮子")
	private String name;
@Qualifier
	private Class clazz;
	private Object[] objects;
	public Object[] getObjects() {
		return objects;
	}
	public void setObjects(Object[] objects) {
		this.objects = objects;
	}
	public Class getClazz() {
		return clazz;
	}
	public void setClazz(Class clazz) {
		this.clazz = clazz;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", clazz=" + clazz + "]";
	}
	public Student() {
		super();
		System.out.println("hehiehei");
	}
	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	
	
}
