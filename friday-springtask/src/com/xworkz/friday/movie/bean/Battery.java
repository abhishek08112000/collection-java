package com.xworkz.friday.movie.bean;

import org.springframework.stereotype.Component;

@Component
public class Battery {

	private Capacity capacity;
	
	public Battery() {
		System.out.println("Creating Battery with no-argument constructor..");
	}
	
	public Capacity capacity2() {
		Capacity capacity = new Capacity();
		return capacity;
	}
}
