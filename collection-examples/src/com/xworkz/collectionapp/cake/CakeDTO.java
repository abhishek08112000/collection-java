package com.xworkz.collectionapp.cake;

public class CakeDTO {

	
	private String name;
	private String shape;
	private double price;
	
	
	public CakeDTO() {
		// TODO Auto-generated constructor stub
	}


	public CakeDTO(String name, String shape, double price) {
		super();
		this.name = name;
		this.shape = shape;
		this.price = price;
	}


	@Override
	public String toString() {
		return "CakeDTO [name=" + name + ", shape=" + shape + ", price=" + price +  "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Running from equals from CakeDto");
		if(obj != null) {
			if(obj instanceof CakeDTO) {
				CakeDTO dt =(CakeDTO)obj;
				if(dt.name.equals(this.name)) {
					return true;
				}
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 30;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getShape() {
		return shape;
	}


	public void setShape(String shape) {
		this.shape = shape;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
