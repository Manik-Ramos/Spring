package com.legitboss.springdemo.javasourceconfiguration;

import org.springframework.beans.factory.annotation.Value;

import com.legitboss.springdemo.Coach;
import com.legitboss.springdemo.FortuneService;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	@Value("${email}")
	private String email;
	
	@Value("${experience}")
	private String experience;
	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
		
	public String getEmail() {
		return email;
	}
	
	public String getExperience() {
		return experience;
	}

	@Override
	public String getWorkOut() {
		return "Swim Butterfly Strokes for 10 mins";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune() + " swimmer";
	}

}
