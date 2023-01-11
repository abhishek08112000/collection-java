package com.xworkz.spring10.spring11.configuration;

import java.sql.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.spring10.spring11")
public class ConfigurationClass {

	@Bean
	public short id() {
		return 8;
	}

	@Bean
	public String name() {
		return "Venkatesh Hardware shop";
	}

	@Bean
	public String ownerName() {
		return "Venkayya";
	}

	@Bean
	public String gstNo() {
		return "ADFV2136974346SV252";
	}

	@Bean
	public String address() {
		return "Rajajinagar";
	}

	// Creating beans for Software class
	@Bean
	public String softwareName() {
		return "Java";
	}

	@Bean
	public double version() {
		return 15.0;
	}

	@Bean
	public String developer() {
		return "James Gosling";
	}

	@Bean
	public Date date() {
		Date dt = new Date(2023, 01, 11);
		return dt;
	}

	@Bean
	public boolean free() {
		return true;
	}

	// Creating beans for SoftwareEngineer class

	@Bean
	public String employName() {
		return "Vishwanath";
	}

	@Bean
	public short salary() {
		return 25000;
	}

	@Bean
	public String companyName() {
		return "Google";
	}

	@Bean
	public String experience() {
		return "4 years";
	}

	// Creating beans for Pencil class

	@Bean
	public String pencilName() {
		return "Apsara";
	}

	@Bean
	public String type() {
		return "Graphite";
	}

	@Bean
	public double price() {
		return 8;
	}

	@Bean
	public String colour() {
		return "Black";
	}

	@Bean
	public boolean stolen() {
		return false;
	}

	// Creating beans for Rubber class

	@Bean
	public String rubberName() {
		return "Camlin";
	}

	@Bean
	public String rubberType() {
		return "Pencil eraser";
	}

	@Bean
	public String rubberColour() {
		return "Red";
	}

	@Bean
	public String shape() {
		return "Square";
	}

	@Bean
	public boolean isStolen() {
		return true;
	}

	@Bean
	public String size() {
		return "5 cm";
	}

	// Creating beans for Rubber class

	@Bean
	public String string() {
		return "It stores words and sentence";
	}

	@Bean
	public short shortt() {
		return 3;
	}

	@Bean
	public float flot() {
		return 5;
	}

	@Bean
	public byte byt() {
		return 9;
	}

	@Bean
	public int intt() {
		return 111;
	}

	@Bean
	public long longer() {
		return 15469846746875L;
	}

	@Bean
	public char chhar() {
		return 'A';
	}

	@Bean
	public boolean isWritten() {
		return false;
	}

	@Bean
	public double doble() {
		return 0.15;
	}
}
