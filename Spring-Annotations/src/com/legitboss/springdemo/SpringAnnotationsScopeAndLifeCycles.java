package com.legitboss.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnnotationsScopeAndLifeCycles {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach footballCoach1 = context.getBean("footballCoach",Coach.class);
		Coach footballCoach2 = context.getBean("footballCoach",Coach.class);
		
		boolean footballCoachScopeResult = (footballCoach1 == footballCoach2);
		
		if(footballCoachScopeResult) {
			System.out.println("***The scope of FootballCoach.java is Singleton and hence the references are***");
			System.out.println("footballCoach1: "+footballCoach1);
			System.out.println("footballCoach2: "+footballCoach2);
		} else {
			System.out.println("***The scope of FootballCoach.java is Prototype and hence the references are***");
			System.out.println("footballCoach1: "+footballCoach1);
			System.out.println("footballCoach2: "+footballCoach2);
		}
		
		System.out.println();
		
		TennisCoach tennisCoach = context.getBean("tennisCoach",TennisCoach.class);
		System.out.println("***Initialising TennisCoach.java with @PostConstruct***");
		System.out.println(tennisCoach.doInitialisationSetup());
		System.out.println("***Destroying TennisCoach.java with @PreDestroy***");
		System.out.println(tennisCoach.doDestructionSetup());
		
	}

}
