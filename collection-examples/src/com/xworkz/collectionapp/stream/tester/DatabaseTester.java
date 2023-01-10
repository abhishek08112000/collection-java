package com.xworkz.collectionapp.stream.tester;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.collectionapp.stream.DatabaseVendorDTO;
import com.xworkz.collectionapp.stream.constant.Type;

public class DatabaseTester {

	public static void main(String[] args) {
		
		
		Collection<DatabaseVendorDTO> database = new ArrayList<DatabaseVendorDTO>();
		database.add(new DatabaseVendorDTO("MySQL", "Oracle Corporation", 112, 10000, Type.Relational));
		database.add(new DatabaseVendorDTO("Oracle", " Larry Ellison and Bob Miner", 500, 250000, Type.RDBMS));
		database.add(new DatabaseVendorDTO("PostgreSQL", "Michael Stonebraker", 225, 500, Type.Relational));
		database.add(new DatabaseVendorDTO("Microsoft SQL Server", "Microsoft", 100, 800, Type.RDBMS));	
		database.add(new DatabaseVendorDTO("MongoDB", "Dwight Merriman", 50, 600, Type.NoSQL));
		
		System.out.println("Converting to upper case");
		database.stream()
		.map(ele->ele.getName().toUpperCase())
		.collect(Collectors.toSet())
		.forEach(name->System.out.println(name));
		
		System.out.println();
		System.out.println("Finding license cost less than 1000");
		database.stream()
		.filter(ele->ele.getLicenseCost()<1000 && ele.getType().equals(Type.NoSQL))
		.collect(Collectors.toSet()).forEach(dto->System.out.println(dto));
		
	}
}
