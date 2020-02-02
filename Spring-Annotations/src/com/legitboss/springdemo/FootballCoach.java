package com.legitboss.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("footballCoach")
public class FootballCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneServiceImpl")
	private FortuneService fortuneService;
	
	//setter method autowiring
	@Autowired
	@Qualifier("randomFortuneServiceImpl")
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Autowiring Setter Methods in FootballCoach.java");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getWorkOut() {
		return "Practice Cones and Cutouts for an hour";
	}
	
	@Override
	public String getFortune() {
		return fortuneService.getFortune() + " football player";
	}

}
