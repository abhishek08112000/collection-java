package com.xworkz.collectionapp.metrocities;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class MetroCityNames {

	
	public static void main(String[] args) {
		
		
		String str1 = "Bangalore";		String str2 = "Mumbai";
		String str3 = "Delhi";			String str4 = "Chennai";
		String str5 = "Hyderabad";
		
		Collection<String> ref = new TreeSet<String>();
		ref.add(str5); ref.add(str4); ref.add(str3);
		ref.add(str2); ref.add(str1);
		
		for(String impl: ref) {
			System.out.println(impl);
		}
		
		System.out.println("*******Iterator***********");
		
		Iterator<String> element = ref.iterator();
		while(element.hasNext()) {
			System.out.println(element.next());
		}
		
		
		
		
		
	}
}
