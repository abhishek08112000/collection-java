package com.xworkz.friday.producer.bean;

import org.springframework.stereotype.Component;

@Component
public class Producer {

	private Assistant assist;
	private Company comp;
	
	public Producer() {
		System.out.println("Creating Producer with no-arg constructor...");
	}
	
	public Company company() {
		Company comp = new Company();
		System.out.println("Company class using Producer");
		return comp;
	}
	
	public Assistant assistant() {
		Assistant ass = new Assistant();
		System.out.println("Assistant class using Producer");
		return ass;
	}
}
