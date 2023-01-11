package com.xworkz.spring10.spring11.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SofwareEngineer {

	@Autowired
	@Qualifier("employName")
	private String employName;
	@Autowired
	@Qualifier("salary")
	private short salary;
	@Autowired
	private String companyName;
	@Autowired
	private String experience;

	public SofwareEngineer() {
		System.out.println("Creating Sofware Engineer constructor.....");
	}

	@Override
	public String toString() {
		return "SofwareEngineer [employName=" + employName + ", salary=" + salary + ", companyName=" + companyName
				+ ", experience=" + experience + "]";
	}

}
