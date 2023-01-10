package com.xworkz.collectionapp.games;

import java.util.ArrayList;
import java.util.Collection;

public class GamesTester {

	public static void main(String[] args) {
		
		GamesDTO dto1 = new GamesDTO("Cricket", 11, "Indoor");
		GamesDTO dto2 = new GamesDTO("Kabaddi", 7, "Indoor");
		
		Collection<GamesDTO> collection = new ArrayList<GamesDTO>();
		collection.add(dto1);
		collection.add(dto2);
		
		boolean equals = dto1.equals(dto2);
		System.out.println(equals);
		
		Games game = (a1,a2) -> {
			System.out.println("Running lambda");
			System.out.println("name " + a1);
			System.out.println("id "+ a2);
		};
		
		game.bake("Baking", 12);
				
		
		
	}
}
