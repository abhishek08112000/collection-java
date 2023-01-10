package com.xworkz.collectionapp.cake;

import java.util.LinkedHashSet;
import java.util.Set;

public class CakeTester {

	public static void main(String[] args) {

		CakeDTO dto1 = new CakeDTO("Pinapple", "Circle", 800);
		CakeDTO dto2 = new CakeDTO("Chocholate", "Circle", 800);
		CakeDTO dto3 = new CakeDTO("Pista", "Circle", 800);

		Set<CakeDTO> set = new LinkedHashSet<CakeDTO>();
		set.add(dto1);
		set.add(dto2);
		set.add(dto3);

		for (CakeDTO cakeDTO : set) {
			System.out.println(cakeDTO);
			System.out.println("Overridden " + cakeDTO.hashCode());

		}

	}
}
