package com.legitboss.springdemo;

import org.springframework.stereotype.Component;

@Component("footballCoach")
public class FootballCoach implements Coach {

	@Override
	public String getWorkOut() {
		return "Practice Cones and Cutouts for an hour";
	}

}
