package com.xworkz.collectionapp.sanitizer;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SanitaizerRunner implements Serializable {

	public static void main(String[] args) {

		SanitizerDTO dto1 = new SanitizerDTO(101, "Dettol", "Green", 15);
		SanitizerDTO dto2 = new SanitizerDTO(102, "Sterillium", "Blue", 12);
		SanitizerDTO dto3 = new SanitizerDTO(103, "Savlon", "Transperant", 14);
		SanitizerDTO dto4 = new SanitizerDTO(104, "Lifebuoy", "Green", 16);
		SanitizerDTO dto5 = new SanitizerDTO(105, "Godrej", "Orenge", 20);
		SanitizerDTO dto6 = new SanitizerDTO(106, "Dabur", "Red", 4);
		SanitizerDTO dto7 = new SanitizerDTO(107, "Multani", "Blue", 4);
		SanitizerDTO dto8 = new SanitizerDTO(108, "Corvil", "Green", 6);
		SanitizerDTO dto9 = new SanitizerDTO(109, null, "Blue", 10);
		SanitizerDTO dto10 = new SanitizerDTO(110, "Pathanjali", "Yellow", 10);

		Collection<SanitizerDTO> sanitizer = new ArrayList<SanitizerDTO>();
		sanitizer.add(dto1);
		sanitizer.add(dto2);
		sanitizer.add(dto3);
		sanitizer.add(dto4);
		sanitizer.add(dto5);
		sanitizer.add(dto6);
		sanitizer.add(dto7);
		sanitizer.add(dto8);
		sanitizer.add(dto9);
		sanitizer.add(dto10);

		// System.out.println(sanitizer);

		Iterator<SanitizerDTO> ref = sanitizer.iterator();
		while (ref.hasNext()) {
			SanitizerDTO element = ref.next();
			// System.out.println(element.getBrand());
			if (element.getColour().equals("Green")) {
				System.out.println(element);
				ref.remove();
			}
			if (element.getPrice() > 5) {
				System.out.println(element.getBrand());
			}
			// System.out.println("*************************");

		}

		System.out.println("******************************");
		System.out.println(sanitizer);

	}

}
