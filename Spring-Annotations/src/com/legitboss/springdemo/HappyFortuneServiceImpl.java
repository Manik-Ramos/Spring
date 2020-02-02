package com.legitboss.springdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneServiceImpl implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is a good day";
	}

}
