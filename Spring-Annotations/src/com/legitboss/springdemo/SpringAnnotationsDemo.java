package com.legitboss.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnnotationsDemo {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Example for named bean id
		Coach footballCoach = context.getBean("footballCoach",Coach.class);
		
		//Example for default bean id based on class name
		Coach tennisCoach = context.getBean("tennisCoach",Coach.class);
		
		System.out.println("Football Workout obtained by using the named component bean id: "+footballCoach.getWorkOut());
		
		System.out.println("Tennis Workout obtained by using the default component bean id: "+tennisCoach.getWorkOut());
		
		context.close();

	}

}
