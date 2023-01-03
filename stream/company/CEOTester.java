package com.xworkz.collectionapp.stream.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class CEOTester {

	public static void main(String[] args) {

		Collection<CompanyCEODTO> ceo = new ArrayList<CompanyCEODTO>();
		ceo.add(new CompanyCEODTO("Ashneer Grover", "Bharat Pay", 42, "India", "Graduate", true,
				(new DoughterDTO("Sakshi", 7485965847L, 23, true, true))));
		ceo.add(new CompanyCEODTO("Sundar Pichai", "Google", 50, "India", "Graduate", true,
				(new DoughterDTO("Soundarya", 9685748596L, 25, false, true))));
		ceo.add(new CompanyCEODTO("Aman Gupta", "Boat", 40, "India", "B.com", false,
				(new DoughterDTO("Ashwarai", 6958479685L, 24, true, false))));
		ceo.add(new CompanyCEODTO("Andy Jassy", "Amazon", 52, "American", "Graduate", true,
				(new DoughterDTO("Jannifier", 859674859685L, 26, false, false))));

		System.out.println("Printing Company ceo's doughter's details");
		ceo.stream().map(ele -> ele.getDoughter()).collect(Collectors.toSet())
				.forEach(name -> System.out.println(name));

		System.out.println("***************************");

		ceo.stream().filter(ele -> ele.getAge() > 45).collect(Collectors.toSet())
				.forEach(name -> System.out.println(name));

		System.out.println("**************************");

//		ceo.stream().map(ele -> ele.getAge()).filter(dto -> dto.getDoughter().getAge()).collect(Collectors.toSet())
//				.forEach(age -> System.out.println("Company ceo age " + age));
		
		ceo.stream().forEach(ele->System.out.println("Age of CEO "+ ele.getAge() +" "+ "Doughter age "+ ele.getDoughter().getAge()));

	}
}
