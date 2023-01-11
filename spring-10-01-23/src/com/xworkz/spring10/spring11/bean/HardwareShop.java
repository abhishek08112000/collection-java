package com.xworkz.spring10.spring11.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HardwareShop {

	@Autowired
	@Qualifier("id")
	private short id;
	@Autowired
	@Qualifier("name")
	private String name;
	@Autowired
	@Qualifier("ownerName")
	private String ownerName;
	@Autowired
	@Qualifier("gstNo")
	private String gstNo;
	@Autowired
	@Qualifier("address")
	private String address;
	
	public HardwareShop() {
		System.out.println("Created HardwareShop no-args constructor...");
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	
	public String getGstNo() {
		return gstNo;
	}
	
	public String getAddress() {
		return address;
	}
}
