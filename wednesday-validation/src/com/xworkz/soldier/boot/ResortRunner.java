package com.xworkz.soldier.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.soldier.configuration.SpringConfiguration;
import com.xworkz.soldier.repo.ResortRepoImpl;

public class ResortRunner {

	public static void main(String[] args) {
	
		ApplicationContext container = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		ResortRepoImpl repo = container.getBean(ResortRepoImpl.class); 
		
		System.out.println(repo.hashCode()); 
		

	}

}
