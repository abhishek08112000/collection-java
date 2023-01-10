package com.xworkz.collectionapp.stream.tester;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.stream.Collectors;

import com.xworkz.collectionapp.stream.ApplicationDTO;

public class ApplicationTester {

	public static void main(String[] args) {

		Collection<ApplicationDTO> application = new ArrayList<ApplicationDTO>();
		application.add(new ApplicationDTO("Hotstar", 1.5, true, "Novi Digital Entertainment Private Limited", 0));
		application.add(new ApplicationDTO("Bharth Pay", 2.3, false, "Ashneeth Grover", 51));
		application.add(new ApplicationDTO("OLX", 6.1, true, "Fabrice Grinda", 0));
		application.add(new ApplicationDTO("JAVA", 15, true, "Sun Microsystems", 0));
		application.add(new ApplicationDTO("SQL", 2.4, false, "Raymond Boyce and Donald Chamberlin", 115));
		application.add(new ApplicationDTO("Accessibility Scanner", 3.1, true, "Google", 0));

		application.stream().filter(ele -> ele.isFree() && ele.getDevelopedBy().equals("Google"))
				// .map(dto->dto.getDevelopedBy().equals("Google"))
				.collect(Collectors.toSet()).forEach(name -> System.out.println(name));

		System.out.println("find all applicaton which version is greater than 5....");

		application.stream().filter(ele -> ele.getVersion() > 5).collect(Collectors.toSet())
				.forEach(dto -> System.out.println(dto.getName()));

		System.out.println("Sorting in collection ****************************");
		application.stream().sorted((a1, a2) -> a1.getName().compareTo(a2.getName()))
				.forEach(ele -> System.out.println(ele));

		System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\");
		application.stream().sorted((s1, s2) -> s1.getDevelopedBy().compareTo(s2.getDevelopedBy()))
				.forEach(d -> System.out.println(d));

		System.out.println("**************************");
		application.stream().filter(e -> e.getVersion() < 5).collect(Collectors.toSet())
				.forEach(d -> System.out.println(d));

		System.out.println("***********************");
		application.stream().filter(st -> st.getPrice() == 0).collect(Collectors.toSet())
				.forEach(ele -> System.out.println(ele));

		System.out.println("****************************");
		application.stream().filter(ele -> ele.isFree()).collect(Collectors.toSet())
				.forEach(st -> System.out.println(st));

		System.out.println("*************************");

		Iterator<ApplicationDTO> itr = application.iterator();
		while (itr.hasNext()) {
			ApplicationDTO str = itr.next();
			if (str.getPrice() == 0) {
				itr.remove();
			}
		}
		System.out.println(application);
		System.out.println("****************************");
		for (ApplicationDTO applicationDTO : application) {
			if (applicationDTO.getPrice() < 100) {
				System.out.println(applicationDTO);
			}
		}

	}
}
