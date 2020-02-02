package com.legitboss.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneServiceImpl implements FortuneService {

	public String[] data = {"Today is a good day","Ignorance is Devil's playground","Make hay while the sun shines"};
	
	public Random random = new Random();
	
	@Override
	public String getFortune() {
		int index = random.nextInt(data.length);
		
		return data[index];
	}

}
