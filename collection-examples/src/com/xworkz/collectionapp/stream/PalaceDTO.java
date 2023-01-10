package com.xworkz.collectionapp.stream;

public class PalaceDTO {

	private String name;
	private String location;
	private String builtBy;
	private boolean destroyed;
	private int visitingFees;
	
	public PalaceDTO() {
		// TODO Auto-generated constructor stub
	}

	public PalaceDTO(String name, String location, String builtBy, boolean destroyed, int visitingFees) {
		super();
		this.name = name;
		this.location = location;
		this.builtBy = builtBy;
		this.destroyed = destroyed;
		this.visitingFees = visitingFees;
	}

	@Override
	public String toString() {
		return "PalaceDTO [name=" + name + ", location=" + location + ", builtBy=" + builtBy + ", destroyed="
				+ destroyed + ", visitingFees=" + visitingFees + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getBuiltBy() {
		return builtBy;
	}

	public void setBuiltBy(String builtBy) {
		this.builtBy = builtBy;
	}

	public boolean isDestroyed() {
		return destroyed;
	}

	public void setDestroyed(boolean destroyed) {
		this.destroyed = destroyed;
	}

	public int getVisitingFees() {
		return visitingFees;
	}

	public void setVisitingFees(int visitingFees) {
		this.visitingFees = visitingFees;
	}
	
	
}
