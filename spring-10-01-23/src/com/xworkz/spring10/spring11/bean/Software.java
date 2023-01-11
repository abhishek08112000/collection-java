package com.xworkz.spring10.spring11.bean;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Software {

	@Autowired
	@Qualifier("softwareName")
	private String softwareName;
	@Autowired
	@Qualifier("version")
	private double version;
	@Autowired
	@Qualifier("developer")
	private String developer;
	@Autowired
	private Date date;
	@Autowired
	private boolean free;
	
	public Software() {
		System.out.println("Created Software construction...");
	}
	
	public String getName() {
		return softwareName;
	}
	
	public double getVersion() {
		return version;
	}
	
	public String getDeveloper() {
		return developer;
	}
	
	public Date getDate() {
		return date;
	}
	
	public boolean isFree() {
		return free;
	}
}
