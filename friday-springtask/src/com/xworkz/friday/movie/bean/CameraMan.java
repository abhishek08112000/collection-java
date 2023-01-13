package com.xworkz.friday.movie.bean;

import org.springframework.stereotype.Component;

@Component
public class CameraMan {

	private Camera camera;

	public CameraMan() {
		System.out.println("Creating CameraMan with no-argument constructor");
	}

	public Camera camera() {
		Camera camera = new Camera();
		return camera;  
	}

}
