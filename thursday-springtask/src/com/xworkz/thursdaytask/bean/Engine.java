package com.xworkz.thursdaytask.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Engine {

	private String engineName;
	private String engineType;
	@Autowired
	@Qualifier("engineNumber")
	private String engineNumber;
	@Autowired
	@Qualifier("version")
	private double version;
	private String companyName;
	private int strokes;
	
	public Engine(@Qualifier("engineName") String engineName,@Qualifier("engineType") String engineType,@Qualifier("companyName") String companyName) {
		this.engineName = engineName;
		this.engineType = engineType;
		this.companyName = companyName;
 	}

	@Override
	public String toString() {
		return "Engine [engineName=" + engineName + ", engineType=" + engineType + ", engineNumber=" + engineNumber
				+ ", version=" + version + ", companyName=" + companyName + "]";
	}
	
	@Autowired
	@Qualifier("strokes")
	public void setStrokes(int strokes) {
		this.strokes = strokes;
	}
	
	public int getStrokes() {
		return strokes;
	}
}
