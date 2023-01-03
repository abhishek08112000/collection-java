package com.xworkz.collectionapp.stream;

public class ApplicationDTO {

	private String name;
	private double version;
	private boolean free;
	private String developedBy;
	private int price;
	
	public ApplicationDTO() {
		// TODO Auto-generated constructor stub
	}

	public ApplicationDTO(String name, double version, boolean free, String developedBy, int price) {
		super();
		this.name = name;
		this.version = version;
		this.free = free;
		this.developedBy = developedBy;
		this.price = price;
	}

	@Override
	public String toString() {
		return "ApplicationDTO [name=" + name + ", version=" + version + ", free=" + free + ", developedBy="
				+ developedBy + ", price=" + price + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	public boolean isFree() {
		return free;
	}

	public void setFree(boolean free) {
		this.free = free;
	}

	public String getDevelopedBy() {
		return developedBy;
	}

	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
