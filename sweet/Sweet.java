package com.xworkz.collectionapp.sweet;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Sweet {

	
	public static void main(String[] args) {
		
		String sweet1 = "Gulab Jamun";
		String sweet2 = "Jalebi";
		String sweet3 = "Rasagulla";
		String sweet4 = "Karadant";
		String sweet5 = "Barfi";
		String sweet6 = "Bunde laddu";
		String sweet7 = "Mothichur laddu";
		String sweet8 = "Badam puri";
		String sweet9 = "Khova";
		String sweet10 = "Dudbarfi";
		String sweet11 = "Jhangir";
		String sweet12 = "Peda";
		String sweet13 = "Halva";
		String sweet14 = "Gulab Jamun";
		String sweet15 = "Gulab Jamun";
		
		Collection<String> ref = new TreeSet<String>();
		ref.add(sweet1);
		ref.add(sweet2);
		ref.add(sweet3);
		ref.add(sweet4);
		ref.add(sweet5);
		ref.add(sweet6);
		
		System.out.println(ref.size());
		
		ref.clear();
		System.out.println(ref.size());
		
		
		Collection<String> ref2 = new LinkedList<String>();
		ref2.add(sweet15);
		ref2.add(sweet14);
		ref2.add(sweet13);
		ref2.add(sweet12);
		ref2.add(sweet11);
		
		System.out.println(ref2.size());
		
		ref2.clear();
		
		System.out.println(ref2.size());
		
		Collection<String> ref3 = new HashSet<String>();
		ref3.add(sweet10);
		ref3.add(sweet9);
		ref3.add(sweet8);
		ref3.add(sweet7);
		System.out.println(ref3.size());
		
		ref3.clear();
		
		System.out.println(ref3.size());
		
		
	}
}
