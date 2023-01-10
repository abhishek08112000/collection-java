package com.xworkz.collectionapp.stream;

import com.xworkz.collectionapp.stream.constant.Type;

public class DatabaseVendorDTO {

	private String name;
	private String developedBy;
	private int sizeInMB; 
	private double licenseCost;
	private Type type;
	
	public DatabaseVendorDTO() {
		// TODO Auto-generated constructor stub
	}

	public DatabaseVendorDTO(String name, String developedBy, int sizeInMB, double licenseCost, Type type) {
		super();
		this.name = name;
		this.developedBy = developedBy;
		this.sizeInMB = sizeInMB;
		this.licenseCost = licenseCost;
		this.type = type;
	}

	@Override
	public String toString() {
		return "DatabaseVendorDTO [name=" + name + ", developedBy=" + developedBy + ", sizeInMB=" + sizeInMB + ", licenseCost="
				+ licenseCost + ", type=" + type + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDevelopedBy() {
		return developedBy;
	}

	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}

	public int getsizeInMB() {
		return sizeInMB;
	}

	public void setsizeInMB(int sizeInMB) {
		this.sizeInMB = sizeInMB;
	}

	public double getLicenseCost() {
		return licenseCost;
	}

	public void setLicenseCost(double licenseCost) {
		this.licenseCost = licenseCost;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
	
	
	
}
