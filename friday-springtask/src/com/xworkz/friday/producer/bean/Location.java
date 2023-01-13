package com.xworkz.friday.producer.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Location {

	@Autowired
	private Area area;
	
	public Location() {
		System.out.println("Creating Location constructor");
	}
	public Area areaOfLocation() {
		Area ar = new Area();
		//System.out.println("Creating Area bean using Location.......");
		return ar;
	}
	
	
}
