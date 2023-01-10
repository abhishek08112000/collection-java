package com.xworkz.spring10.boot; 

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring10.configuration.ConfigurationClass;
import com.xworkz.spring10.thing.Actor;
import com.xworkz.spring10.thing.Rocket;
import com.xworkz.spring10.thing.Season;

public class TesterClass {

	public static void main(String[] args) {
		
		ApplicationContext task = new AnnotationConfigApplicationContext(ConfigurationClass.class);
		
		Rocket rocket = task.getBean("rocket" ,Rocket.class);
		System.out.println(rocket);
		System.out.println(rocket.getCountry());
		System.out.println(rocket.getName());
		System.out.println(rocket.getBudget());
		
		Rocket rocket2 = task.getBean("lounchPad" ,Rocket.class);
		System.out.println(rocket2);
		System.out.println(rocket2.getCountry());
		System.out.println(rocket2.getName());
		System.out.println(rocket2.getBudget());
		
		System.out.println("========= Actor class ========");
		Actor act = task.getBean("actor", Actor.class);
		System.out.println(act);
		System.out.println(act.getName());
		System.out.println(act.getLanguage());
		System.out.println(act.getAge());
		
		Actor actt = task.getBean("actor2", Actor.class);
		System.out.println(actt);
		System.out.println(actt.getName());
		System.out.println(actt.getLanguage());
		System.out.println(actt.getAge());
		
		System.out.println("========= Season class ========");
		Season sea = task.getBean("season", Season.class);
		System.out.println(sea);
		System.out.println(sea.getName());
		System.out.println(sea.getDuration());
		System.out.println(sea.getStartingMonth());
		
		Season seas = task.getBean("season2", Season.class);
		System.out.println(seas);
		System.out.println(seas.getName());
		System.out.println(seas.getDuration());
		System.out.println(seas.getStartingMonth());
		
	}
}
