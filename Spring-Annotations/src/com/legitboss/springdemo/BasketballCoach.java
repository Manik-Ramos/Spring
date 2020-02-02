package com.legitboss.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach {

	//field Autowiring
	@Autowired
	@Qualifier("randomFortuneServiceImpl")
	private FortuneService fortuneService;
	
	public BasketballCoach() {
		System.out.println("Autowiring field in BasketBall.java");
	}
	
	//Any method Autowiring
	@Autowired
	public String doSomeSimpleStuff() {
		return "Autowiring any method in BasketBall.java";
	}
	
	@Override
	public String getWorkOut() {
		return "Perform dunk for 15 mins";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune() + " basketball player";
	}

}
