package com.xworkz.thursdaytask.configuration;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.thursdaytask")
public class ConfigurationClass {

	@Bean
	public int paperId() {
		return 111;
	}
	
	@Bean
	public String paperName() {
		return "Vijayavani";
	}
	
	@Bean
	public String paperOwnerName() {
		return "Vijay Sankeshwar";
	}
	
	@Bean
	public String paperlanguage() {
		return "Kannada";
	}
	
	@Bean
	public double paperPrice() {
		return 5.0;
	}
	
	// Creating beans for Snake class
	
	@Bean
	public String snakeName() {
		return "Russel's viper";
	}
	
	@Bean
	public int snakeLength() {
		return 8;
	}
	
	@Bean
	public String snakeColour() {
		return "Grey";
	}
	
	@Bean
	public String snakeType() {
		return "Poisonous";
	}
	
	@Bean
	public boolean poisonous() {
		return true;
	}
	
	// Creating beans for Engine class
	
	@Bean
	public String engineName() {
		return "Petrol engine";
	}
	
	@Bean
	public String engineType() {
		return "Internal combustion engines";
	}
	
	@Bean
	public String engineNumber() {
		return "SFR1468GR";
	}
	
	@Bean
	public double version() {
		return 6.23;
	}
	
	@Bean
	public String companyName() {
		return "Lot of Autos";
	}
	
	@Bean 
	public int strokes() {
		return 6;
	}
	
	// Creating beans for Ghost class
	
	@Bean
	public String ghostName() {
		return "Anand";
	}
	
	@Bean
	public String ghostLastName() {
		return "Desai";
	}
	
	@Bean
	public int ghostAge() {
		return 23;
	}
	
	@Bean
	public LocalDate deathDate() {
		return LocalDate.of(2030, 06, 15);
	}
	
	@Bean
	public String ghostProffesion() {
		return "Civil Engineer";
	}
	
	@Bean
	public boolean isMarried() {
		return true;
	}
	
	@Bean
	public String ghostFatherName() {
		return "Jagadeesh";
	}
	
	@Bean
	public String ghostMotherName() {
		return "Sharada";
	}
	
	@Bean
	public String ghostWifeName() {
		return "Daneshwari";
	}
	
	@Bean
	public String gender() {
		return "Male";
	}
	
	@Bean
	public String ghostBrotherName() {
		return "Shankar";
	}
	
	@Bean
	public int houseNumber() {
		return 91;
	}
	
	@Bean
	public boolean hasKids() {
		return true;
	}
	
	@Bean
	public int numberOfKids() {
		return 2;
	}
	
	@Bean
	public boolean isSucide() {
		return false;
	}
	
	@Bean
	public boolean isMurder() {
		return false;
	}
	
	@Bean
	public boolean isLegsTwisted() {
		return true;
	}
	
	@Bean
	public double salaryOfGhost() {
		return 15000;
	}
	
	@Bean
	public boolean naturalDeath() {
		return true;
	}
	
	@Bean
	public boolean daibetese() {
		return true;
	}
}
