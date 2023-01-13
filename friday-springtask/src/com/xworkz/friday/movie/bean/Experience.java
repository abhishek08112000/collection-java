package com.xworkz.friday.movie.bean;

import org.springframework.stereotype.Component;

@Component
public class Experience {

	private Skill skill;
	
	public Experience() {
		System.out.println("Creating Experience with no-argument constructor...");
	}
	
	public Skill skills() {
		Skill skill = new Skill();
		return skill;
	}
}
