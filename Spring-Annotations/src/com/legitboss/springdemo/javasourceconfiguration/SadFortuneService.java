package com.legitboss.springdemo.javasourceconfiguration;

import com.legitboss.springdemo.FortuneService;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is a sad Day";
	}

}
