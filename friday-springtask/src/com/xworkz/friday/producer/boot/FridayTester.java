package com.xworkz.friday.producer.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.friday.producer.bean.Company;
import com.xworkz.friday.producer.bean.Location;
import com.xworkz.friday.producer.bean.Producer;
import com.xworkz.friday.producer.configuration.FridayConfiguration;

public class FridayTester {

	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(FridayConfiguration.class);

		Location loc = container.getBean(Location.class);
		System.out.println(loc.areaOfLocation().hashCode() + " hashCode of area class using location class");

		System.out.println("========= Company ==========");
		
		Company company = container.getBean(Company.class);
		System.out.println(company.loca().hashCode() + " hashCode of Location class.... using Company");
		
		System.out.println("========= Producer ==========");
		
		Producer producer = container.getBean(Producer.class);
		System.out.println(producer.company().hashCode() + " hashCode os Company using Producer");
		System.out.println(producer.assistant().hashCode() + " hashCode os Assistant using Producer");
	}
}
