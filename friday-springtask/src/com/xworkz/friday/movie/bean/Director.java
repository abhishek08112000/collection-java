package com.xworkz.friday.movie.bean;

import org.springframework.stereotype.Component;

@Component
public class Director {

	private Experience experience;

	public Director() {
		System.out.println("Creating Director with no-argument constructor.");
	}

	public Experience refOfExperience() {
		Experience experience = new Experience();
		return experience;
	}
}
