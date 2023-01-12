package com.xworkz.thursdaytask.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Snake {

	private String snakeName;
	@Autowired
	@Qualifier("snakeLength")
	private int snakeLength;
	@Autowired
	@Qualifier("snakeColour")
	private String colour;
	private String type;
	private boolean poisonous;

	@Autowired
	public Snake(@Qualifier("snakeName")String snakeName,@Qualifier("snakeType") String type,@Qualifier("poisonous") boolean poisonous) {
		this.snakeName = snakeName;
		this.type = type;
		this.poisonous = poisonous;
	}

	@Override
	public String toString() {
		return "Snake [snakeName=" + snakeName + ", snakeLength=" + snakeLength + ", colour=" + colour + ", type="
				+ type + ", poisonous=" + poisonous + "]";
	}

}
