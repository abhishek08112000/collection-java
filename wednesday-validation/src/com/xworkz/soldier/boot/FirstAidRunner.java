package com.xworkz.soldier.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.soldier.configuration.SpringConfiguration;
import com.xworkz.soldier.repo.FirstAidRepo;

public class FirstAidRunner {

	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(SpringConfiguration.class);

		FirstAidRepo repos = container.getBean(FirstAidRepo.class);

		System.out.println(repos.hashCode());

	}

}
