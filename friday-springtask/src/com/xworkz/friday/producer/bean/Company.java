package com.xworkz.friday.producer.bean;

import org.springframework.stereotype.Component;

@Component
public class Company {

	private Location location;
	
	public Company() {
		System.out.println("Creating Company with no-arg constructor...");
	}
	
	public Location loca() {
		Location locat = new Location();
		return locat;
	}
}
