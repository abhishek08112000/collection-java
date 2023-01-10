package com.xworkz.spring10.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.spring10.thing.Actor;
import com.xworkz.spring10.thing.Rocket;
import com.xworkz.spring10.thing.Season;

@Configuration
@ComponentScan("com.xworkz.spring10")
public class ConfigurationClass {

	@Bean
	public Rocket rocket() {
		System.out.println("Registering Rocket... with spring...");
		Rocket r = new Rocket();
		return r;
	}
	
	@Bean("lounchPad")
	public Rocket rocket2() {
		Rocket ro = new Rocket();
		return ro;
	}
	
	@Bean
	public Actor actor() {
		System.out.println("Registering Actor with Spring....");
		Actor ac = new Actor("Darshan", "Kannada", 60);
		return ac;
	}
	
	@Bean
	public Actor actor2() {
		Actor acc = new Actor("Yash", "Kannada", 56);
		return acc;
	}
	
	@Bean
	public Season season() {
		Season sea = new Season();
		return sea;
	}
	
	@Bean
	public Season season2() {
		Season sea = new Season();
		sea.setName("Winter");
		sea.setDuration("4 Months");
		sea.setStartingMonth("November");
		return sea;
	}
}
