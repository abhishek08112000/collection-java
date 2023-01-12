package com.xworkz.thursdaytask.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.thursdaytask.bean.Engine;
import com.xworkz.thursdaytask.bean.Ghost;
import com.xworkz.thursdaytask.bean.NewsPaper;
import com.xworkz.thursdaytask.bean.Snake;
import com.xworkz.thursdaytask.configuration.ConfigurationClass;

public class TesterClass {

	public static void main(String[] args) {
		
		ApplicationContext container = new AnnotationConfigApplicationContext(ConfigurationClass.class);
		
		System.out.println("========== NewaPaper ===========");
		
		NewsPaper paper = container.getBean(NewsPaper.class);
		System.out.println(paper);
		System.out.println("Paper price is :" +paper.getPrice());
		
		System.out.println("========== Snake ===========");
		
		Snake snake = container.getBean(Snake.class);
		System.out.println(snake);
		
		System.out.println("========== Engine ===========");
		
		Engine engine = container.getBean(Engine.class);
		System.out.println(engine + " number of strokes "+ engine.getStrokes());
		
		System.out.println("========== Ghost ===========");
		
		Ghost ghost = container.getBean(Ghost.class);
		System.out.println(ghost);
		
	}
}
