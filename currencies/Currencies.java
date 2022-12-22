package com.xworkz.collectionapp.currencies;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Currencies {

	
	public static void main(String[] args) {
		
		
		String cur1 = "Rupees";		String cur2 = "Dollar"; 	String cur3 = "Euro";
		String cur4 = "Afghani";	String cur10 = "Lek"; 		String cur16 = "Dinar";
		String cur5 = "New Kwanza";	String cur11 = "Peso"; 		String cur17 = "Dram";
String cur6 = "Australian dollar";	String cur12 = "Manat"; 	String cur18 = "Bahrain dinar";
		String cur7 = "Taka";		String cur13 = "ruble"; 	String cur19 = "Belize dollar";
		String cur8 = "Ngultrum";	String cur14 = "Boliviano"; String cur20 = "Pula";
		String cur9 = "	Real";		String cur15 = "Lev"; 		String cur21 = "Riel";
		String cur22 = "Chilean Peso";	String cur23 = "Chinese Yuan"; 
		String cur24 = "Naira";
		
		Collection<String> ref = new HashSet<String>();
		ref.add(cur24); ref.add(cur23); ref.add(cur22);ref.add(cur21);
		ref.add(cur15); ref.add(cur9); ref.add(cur20); ref.add(cur14);
		ref.add(cur8); ref.add(cur19); ref.add(cur13); ref.add(cur7);
		
		System.out.println(ref.size());
		
		ref.clear();
		
		System.out.println(ref.size());
		
		
		Collection<String> ref2 = new ArrayList<String>();
		ref2.add(cur18); ref2.add(cur12); ref2.add(cur6);
		ref2.add(cur17); ref.add(cur11); ref2.add(cur5);
		ref2.add(cur16); ref2.add(cur10); ref.add(cur4); 
		ref2.add(cur3); ref2.add(cur2); ref.add(cur1);
		
		System.out.println(ref2.size());
		
		ref2.clear();
		
		System.out.println(ref2.size());
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
