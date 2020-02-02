package com.legitboss.springdemo;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Override
	public String getWorkOut() {
		return "Practice Backhand and Forehand 15 mins each";
	}

}
