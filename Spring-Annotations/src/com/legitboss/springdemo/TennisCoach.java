package com.legitboss.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneServiceImpl")
	private FortuneService fortuneService;
	
	//constructor Autowiring
	@Autowired
	public TennisCoach() {
		System.out.println("Autowiring Constructors in TennisCoach.java");
	}
	
	@Override
	public String getWorkOut() {
		return "Practice Backhand and Forehand 15 mins each";
	}
	
	@Override
	public String getFortune() {
		return fortuneService.getFortune() + " tennis player";
	}

}
