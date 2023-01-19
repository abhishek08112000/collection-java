package com.xworkz.soldier.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.soldier.configuration.SpringConfiguration;
import com.xworkz.soldier.repo.MissileRepoImpl;

public class MissileRunner {

	public static void main(String[] args) {
		
		ApplicationContext container = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		MissileRepoImpl missiles = container.getBean(MissileRepoImpl.class);
		
		System.out.println(missiles.hashCode());

	}

}
