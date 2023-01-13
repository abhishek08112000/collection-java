package com.xworkz.friday.movie.bean;

import org.springframework.stereotype.Component;

@Component
public class Movie {

	private Director director;
	private CameraMan cameraMan;
	
	public Movie() {
		System.out.println("Creating Movie with no-argument constructor");
	}
	
	public Director refOfDirector() {
		Director director = new Director();
		return director;
	}
	
	public CameraMan refOfCameraMan() {
		CameraMan cameraMan = new CameraMan();
		return cameraMan;
	}
	
	
}
