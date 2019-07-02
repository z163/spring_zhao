package com.kaikeba.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kaikeba.beans.Student;
import com.kaikeba.beans.Teacher;


public class TestMain {

	public static void main(String[] args) {
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("spring_config.xml");


		Student stu = (Student)factory.getBean("student");
		System.out.println(stu.getSname()+" "+stu.getAge());
		System.out.println(stu.getTeacher().getTname());

		Teacher teacher = (Teacher) factory.getBean("teacher");
		System.out.println(teacher.getTeacherName());
		System.out.println(teacher.getFriendArray());
		System.out.println(teacher.getSchool());


	}

}
