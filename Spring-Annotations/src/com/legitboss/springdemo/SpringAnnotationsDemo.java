package com.legitboss.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnnotationsDemo {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach footballCoach = context.getBean("footballCoach",Coach.class);
		
		Coach tennisCoach = context.getBean("tennisCoach",Coach.class);
		
		BasketballCoach basketballCoach = context.getBean("basketballCoach",BasketballCoach.class);
		
		System.out.println("Football Workout obtained by using the named component bean id: "+footballCoach.getWorkOut());
		
		System.out.println("Tennis Workout obtained by using the default component bean id: "+tennisCoach.getWorkOut());
		
		System.out.println("Basketball Workout obtained by using the default component bean id: "+basketballCoach.getWorkOut());
		
		System.out.println(basketballCoach.doSomeSimpleStuff());
		
		System.out.println(basketballCoach.getFortune());
		
		context.close();

	}

}
