package com.xworkz.collectionapp.shoesize;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class ShoeSize {

	
	public static void main(String[] args) {
		
		
		int size1 = 4;		int size2 = 5;
		int size3 =6;		int size4 = 7;
		int size5 = 8;		int size6 = 9;
		int size7 = 10;		int size8 = 11;
		int size9 = 12;		int size10 = 13;
		int size11 = 14;	int size12 = 15;
		int size13 = 16;	int size14 = 17;
		
		Collection<Integer> ref = new LinkedList<Integer>();
		ref.add(size1); ref.add(size2); ref.add(size3);
		ref.add(size4); ref.add(size5); ref.add(size6);
		ref.add(size7);
		
		System.out.println(ref);
		
		System.out.println("*********For each loop**********");
		
		for(Integer impl: ref) {
			System.out.println(impl);
		}
		
		System.out.println("*********Iterator**********");
		
		Collection<Integer> ref2 = new LinkedHashSet<Integer>();
		ref2.add(size8); ref2.add(size9); ref2.add(size10);
		ref2.add(size11); ref2.add(size12); ref2.add(size13);
		ref2.add(size14);
	
		Iterator<Integer> emnt = ref2.iterator();
		
		while(emnt.hasNext()) {
			System.out.println(emnt.next());
		}
		
	}
}
