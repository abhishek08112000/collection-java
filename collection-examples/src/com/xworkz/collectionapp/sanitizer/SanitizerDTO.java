package com.xworkz.collectionapp.sanitizer;

public class SanitizerDTO {

	
	private Integer id;
	private String brand ;
	private String colour;
	private Integer price;
	
	public SanitizerDTO() {
		// TODO Auto-generated constructor stub
	}

	public SanitizerDTO(Integer id, String brand, String colour, Integer price) {
		super();
		this.id = id;
		this.brand = brand;
		this.colour = colour;
		this.price = price;
	}

	@Override
	public String toString() {
		return "SanitizerDTO [id=" + id + ", brand=" + brand + ", colour=" + colour + ", price=" + price + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
	
	
	
	
}
