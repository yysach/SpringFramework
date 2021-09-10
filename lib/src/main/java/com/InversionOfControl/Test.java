package com.InversionOfControl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("XMLConfig.xml");
		Student student = context.getBean("student",Student.class);
		System.out.println(student);
		
		Question question = context.getBean("question",Question.class);
		System.out.println(question);
		
		
		context.close();

	}

}
