package com.xworkz.collectionapp.games;

public class GamesDTO {

	
	private String name;
	private Integer totalPlayer;
	private String type;
	
	public GamesDTO() {
		// TODO Auto-generated constructor stub
	}

	public GamesDTO(String name, Integer totalPlayer, String type) {
		super();
		this.name = name;
		this.totalPlayer = totalPlayer;
		this.type = type;
	}

	@Override
	public String toString() {
		return "GamesDTO [name=" + name + ", totalPlayer=" + totalPlayer + ", type=" + type + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Running from equals from GameDto");
		if(obj != null) {
			if(obj instanceof GamesDTO) {
				GamesDTO dto = (GamesDTO)obj;
				if(dto.name.equals(this.name)) {
					return true;
				}
			}
		}
		return false;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getTotalPlayer() {
		return totalPlayer;
	}

	public void setTotalPlayer(Integer totalPlayer) {
		this.totalPlayer = totalPlayer;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	
	
}
