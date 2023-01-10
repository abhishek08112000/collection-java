package com.xworkz.collectionapp.weapons;

public class WeaponDTO {

	private String name;
	private String madeBy;
	private String bulletSize;
	private double price;
	private Type type;
	
	public WeaponDTO() {
		// TODO Auto-generated constructor stub
	}

	public WeaponDTO(String name, String madeBy, String bulletSize, double price, Type type) {
		super();
		this.name = name;
		this.madeBy = madeBy;
		this.bulletSize = bulletSize;
		this.price = price;
		this.type = type;
	}

	@Override
	public String toString() {
		return "WeaponDTO [name=" + name + ", madeBy=" + madeBy + ", bulletSize=" + bulletSize + ", price=" + price + ", type="
				+ type + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null) {
			if(obj instanceof WeaponDTO) {
				WeaponDTO weapons = (WeaponDTO)obj ;
				if(weapons.name.contains(this.name) && this.madeBy.contains(weapons.madeBy)) {
					return true;
				}
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return 22;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMadeBy() {
		return madeBy;
	}

	public void setMadeBy(String madeBy) {
		this.madeBy = madeBy;
	}

	public String getbulletSize() {
		return bulletSize;
	}

	public void setbulletSize(String bulletSize) {
		this.bulletSize = bulletSize;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
	
	
	
}
