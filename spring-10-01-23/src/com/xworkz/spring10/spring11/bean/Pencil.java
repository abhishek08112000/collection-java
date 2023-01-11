package com.xworkz.spring10.spring11.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Pencil {

	@Autowired
	private String pencilName;
	@Autowired
	private String type;
	@Autowired
	@Qualifier("price")
	private double price;
	@Autowired
	private String colour;
	@Autowired
	private boolean stolen;
	
	public Pencil() {
		System.out.println("Created Pencil constructor......");
	}

	@Override
	public String toString() {
		return "Pencil [pencilName=" + pencilName + ", type=" + type + ", price=" + price + ", colour=" + colour
				+ ", stolen=" + stolen + "]";
	}
	
	
	
}
