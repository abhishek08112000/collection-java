package com.xworkz.collectionapp.bikes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

public class BikeRunner {

	
	public static void main(String[] args) {
		
		String str1 = "Pulsar 150";		String str2 = "Dominar";
		String str3 = "FZ-S";			String str4 = "Honda Shine";
		String str5 = "Honda SP125";	String str6 = "Dio";
		String str7 = "Activa";			String str8 = "Activa5G";
		String str9 = "Clicq";			String str10 = "Ola";
		String str11 = "Plantina";		String str12 = "CT 100";
		String str13 = "Splender";		String str14 = "Pulsar 200";
		String str15 = "Hunter 350";	String str16 = "Himalayan";
		
		
		Collection<String> ref = new ArrayList<String>();
		ref.add(str16); ref.add(str15); ref.add(str14);
		ref.add(str13); ref.add(str12); ref.add(str11);
		ref.add(str10); ref.add(str9); ref.add(str8);
		
		System.out.println(ref.size());
		
		ref.clear();
		
		System.out.println(ref.size());
		
		Collection<String> ref2 = new TreeSet<String>();
		ref2.add(str1); ref2.add(str2); ref2.add(str3);
		ref2.add(str4); ref2.add(str5); ref.add(str6);
		ref2.add(str7);
		
		System.out.println(ref2.size());
		
		ref2.clear();
		
		System.out.println(ref2.size());
		
		
	}
}
