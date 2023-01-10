package com.xworkz.spring10.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Season {

	private String name;
	private String duration;
	private String startingMonth;

	public Season() {

	}

	public String getName() {
		return name;
	}

	@Value("Rainy")
	public void setName(String name) {
		this.name = name;
	}

	public String getDuration() {
		return duration;
	}

	@Value("4 months")
	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getStartingMonth() {
		return startingMonth;
	}

	@Value("July")
	public void setStartingMonth(String startingMonth) {
		this.startingMonth = startingMonth;
	}

}
