package com.xworkz.friday.movie.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.friday.movie.bean.Battery;
import com.xworkz.friday.movie.bean.Camera;
import com.xworkz.friday.movie.bean.CameraMan;
import com.xworkz.friday.movie.bean.Director;
import com.xworkz.friday.movie.bean.Experience;
import com.xworkz.friday.movie.bean.Movie;
import com.xworkz.friday.movie.configuration.MovieConfiguration;

public class MovieTester {

	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(MovieConfiguration.class);

		Battery battery = container.getBean(Battery.class);
		System.out.println(battery.hashCode() + " hashCode of Capacity using Battery");
		
		System.out.println("========== Camera ==========");
		
		Camera refOfCamera = container.getBean(Camera.class);
		System.out.println(refOfCamera.lense2().hashCode() + " hashCode of Lense using Camera");
		System.out.println(refOfCamera.refOfBattery().hashCode() + " hashCode of Battery using Camera");
		
		
		System.out.println("========== Camera Man ==========");
		
		CameraMan cameraMan = container.getBean(CameraMan.class);
		System.out.println(cameraMan.camera().hashCode() + " hashCode of Camera using CameraMan..");
		
		System.out.println("========== Experience ==========");
		
		Experience refOfExperience = container.getBean(Experience.class);
		System.out.println(refOfExperience.skills().hashCode() + " hashCode of Skill using Experience..");
		
		System.out.println("========== Experience ==========");
		
		Director refOfDirecor = container.getBean(Director.class);
		System.out.println(refOfDirecor.refOfExperience().hashCode() + " hashCode of Experience using Director");
		
		System.out.println("========== Movie ==========");
		
		Movie refOfMovie = container.getBean(Movie.class);
		System.out.println(refOfMovie.refOfCameraMan().hashCode() + " hashCode of CameraMan using Movie");
		System.out.println(refOfMovie.refOfDirector().hashCode() + " hashCode of Director using Movie");
	}
}
