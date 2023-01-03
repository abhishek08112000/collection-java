package com.xworkz.collectionapp.stream.tester;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collectionapp.stream.PalaceDTO;

public class PalaceTester {

	public static void main(String[] args) {
		
		Collection<PalaceDTO> palace = new ArrayList<PalaceDTO>();
		palace.add(new PalaceDTO("Bengaluru", "Bengaluru", "Chamaraja Wodeyar", false, 250));
		palace.add(new PalaceDTO("Mysore", "Mysore", "Krishnaraja Wodeyar IV", false, 150));
		palace.add(new PalaceDTO("Lalith mahal", null, null, false, 0));
		
		
	}
}
