package com.legitboss.springdemo.javasourceconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.legitboss.springdemo.Coach;
import com.legitboss.springdemo.FortuneService;

@Configuration
@PropertySource("classpath:sports.properties")
public class SportsConfiguration {
	
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
	
}
