package com.xworkz.spring10.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Rocket {

	@Value("India")
	private String country;
	@Value("PSLV")
	private String name;
	@Value("100000.00")
	private double budget;
	
	public Rocket() {
		System.out.println("Lounching Rocket.....");
	}
	
	public String getCountry() {
		return country;
	}
	
	public String getName() {
		return name;
	}
	
	public double getBudget() {
		return budget;
	}
	
}
