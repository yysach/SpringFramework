package com.InversionOfControlAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.InversionOfControlAnnotation.config.JavaConfig;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Student student = context.getBean("student",Student.class);
		System.out.println(student);
		
		Question question = context.getBean("question",Question.class);
		System.out.println(question);
		
		context.close();
	}

}
