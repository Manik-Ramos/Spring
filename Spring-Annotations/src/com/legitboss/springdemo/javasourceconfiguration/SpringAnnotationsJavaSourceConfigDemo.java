package com.legitboss.springdemo.javasourceconfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.legitboss.springdemo.BasketballCoach;
import com.legitboss.springdemo.Coach;

public class SpringAnnotationsJavaSourceConfigDemo {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportsConfiguration.class);
		
		SwimCoach swimCoach = context.getBean("swimCoach",SwimCoach.class);
				
		System.out.println(swimCoach.getFortune());
		
		System.out.println(swimCoach.getWorkOut());
		
		System.out.println();
		
		System.out.println("***Values read from property file using @PropertySource***");
		
		System.out.println("Email: "+swimCoach.getEmail());
		
		System.out.println("Experience: "+swimCoach.getExperience());
		
		context.close();

	}

}
