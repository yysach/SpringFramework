package com.InversionOfControlAnnotation.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.InversionOfControlAnnotation.Address;
import com.InversionOfControlAnnotation.Option;
import com.InversionOfControlAnnotation.Question;
import com.InversionOfControlAnnotation.Student;

@Configuration
@ComponentScan(basePackages="com.InversionOfControlAnnotation")
@PropertySource("classpath:config.properties")
@PropertySource("classpath:mylogger.properties")
public class JavaConfig {
	
	@Autowired
	private Environment env;
	
	@Bean
	public MyLoggerConfig myLoggerConfig(@Value("${root.logger.level}") String rootLoggerLevel,
										 @Value("${printed.logger.level}") String printedLoggerLevel) {
 
		MyLoggerConfig myLoggerConfig = new MyLoggerConfig(rootLoggerLevel, printedLoggerLevel);
 
		return myLoggerConfig;
	}
	@Bean
	public Address address() {
		return new Address(env.getProperty("config.address.street"),env.getProperty("config.address.city"),env.getProperty("config.address.state"),env.getProperty("config.address.country")) ;
	}
	
	// bean will be identify by its method name 'student'
	@Bean
	public Student student() {
		return new Student(Integer.valueOf(env.getProperty("config.student.id")),env.getProperty("config.student.name"),address());
	}
	
	
	@Bean
	public Option getOp1() {
		return new Option(Integer.valueOf(env.getProperty("config.op1.id")),env.getProperty("config.op1.value"),Boolean.valueOf(env.getProperty("config.op1.correct")));
	}
	@Bean
	public Option getOp2() {
		return new Option(Integer.valueOf(env.getProperty("config.op2.id")),env.getProperty("config.op2.value"),Boolean.valueOf(env.getProperty("config.op2.correct")));
	}
	@Bean
	public Option getOp3() {
		return new Option(Integer.valueOf(env.getProperty("config.op3.id")),env.getProperty("config.op3.value"),Boolean.valueOf(env.getProperty("config.op3.correct")));
	}
	
	
	//bean will be  identify by its method name 'question'
	@Bean
	public Question question() {
		List<Option> options= new ArrayList<>();
		options.add(getOp1());
		options.add(getOp2());
		options.add(getOp3());
		
		return new Question(Integer.valueOf(env.getProperty("config.question.id")),env.getProperty("config.student.value"),options);
	}

}
