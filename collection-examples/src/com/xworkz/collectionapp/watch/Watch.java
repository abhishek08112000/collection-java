package com.xworkz.collectionapp.watch;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class Watch {

	
	public static void main(String[] args) {
		
		
		String str1 = "Titan";		String str2 = "Fastrak";
		String str3 = "Cassio";			String str4 = "HMT";
		String str5 = "Fossil";
		
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
