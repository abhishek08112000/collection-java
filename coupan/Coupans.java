package com.xworkz.collectionapp.coupan;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Coupans {

	
	public static void main(String[] args) {
		
		
		String str1 = "AB1256DG"; 	String str10 = "AF4595RF";
		String str2 = "DC1265AD";	String str11 = "BG4632DS";
		String str3 = "LP2659FR";	String str12 = "VE9625GH";
		String str4 = "QX9573ER";	String str13 = "TA2135FQ";
		String str5 = "WD6352DF";	String str14 = "JK7845GT";
		String str6 = "GE6958QA";	String str15 = "KL9713HI";
		String str7 = "AZ4152TM";	String str16 = "LP5498LA";
		String str8 = "QQ9173QM";	String str17 = "TH9173PZ";
		String str9 = "NO4512CD";	String str18 = "zp1596Lp";
		
		
		
		Collection<String> ref = new LinkedHashSet<String>();
		ref.add(str18); ref.add(str9); ref.add(str17); ref.add(str8);
		ref.add(str16); ref.add(str7); ref.add(str15); ref.add(str6);
		ref.add(str14);
		
		System.out.println(ref.size());
		
		ref.clear();
		
		System.out.println(ref.size());
		
		
		Collection<String> ref2 = new HashSet<String>();
		ref2.add(str5); ref2.add(str13); ref.add(str4); ref.add(str12);
		ref.add(str3); ref2.add(str11); ref2.add(str2); ref.add(str10);
		ref.add(str1);
		
		System.out.println(ref2.size());
		
		ref2.clear();
		
		System.out.println(ref2.size());
		
		
		
	}
}
