package com.xworkz.spring10.spring11.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Rubber {

	@Autowired
	private String rubberName;
	@Autowired
	private String rubberType;
	@Autowired
	private int rubberPrice;
	@Autowired
	private String rubberColour;
	@Autowired
	private String shape;
	@Autowired
	private boolean isStolen;
	@Autowired
	private String size;

	public Rubber() {
		System.out.println("Created Rubber constructor...");
	}

	@Override
	public String toString() {
		return "Rubber [rubberName=" + rubberName + ", rubberType=" + rubberType + ", rubberPrice=" + rubberPrice
				+ ", rubberColour=" + rubberColour + ", shape=" + shape + ", isStolen=" + isStolen + ", size=" + size
				+ "]";
	}

}
