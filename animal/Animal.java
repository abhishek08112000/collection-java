package com.xworkz.collectionapp.animal;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Animal {

	
	public static void main(String[] args) {
		
		String animal1 = "Dog";				String animal2 = "Cat";
		String animal3 = "Donkey";			String animal4 = "Tiger";
		String animal5 = "Elephant";		String animal6 = "Lion";
		String animal7 = "Monkey";			String animal8 = "Crocodile";
		String animal9 = "Giraffe";			String animal10 = "Pig";
		
		
		Collection<String> ref = new TreeSet<String>();
		ref.add(animal10); ref.add(animal9); ref.add(animal8);
		ref.add(animal7); ref.add(animal6); ref.add(animal5);
		
		System.out.println(ref.size());
		
		for(String rl:ref) {
			System.out.println(rl);
		}
		
		System.out.println("***********************");
		
		Iterator<String> ref3 = ref.iterator();
		
		while (ref3.hasNext()) {
			//ref3.next();
			System.out.println(ref3.next());
		}
		
		
		Collection<String> ref5 = new HashSet<String>();
		ref5.add(animal1); ref5.add(animal2);
		ref5.add(animal3); ref5.add(animal4);
		
		for(String r2: ref5) {
			System.out.println(r2);
		}
		
		System.out.println("********************");
		
		Iterator<String> reference = ref5.iterator();
		while(reference.hasNext()) {
			System.out.println(reference.next());
		}
		
		
		
	}
}
