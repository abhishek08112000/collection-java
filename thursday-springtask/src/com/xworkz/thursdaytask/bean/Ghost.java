package com.xworkz.thursdaytask.bean;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Ghost {

	private String ghostName;
	private String ghostLastName;
	private int ghostAge;
	private LocalDate deathDate;
	private String ghostProffesion;
	private boolean isMarried;
	private String ghostFatherName;
	private String ghostMotherName;
	private String ghostWifeName;
	private String gender;
	@Autowired
	@Qualifier("ghostBrotherName")
	private String ghostBrotherName;
	@Autowired
	@Qualifier("houseNumber")
	private int houseNumber;
	@Autowired
	@Qualifier("hasKids")
	private boolean kids;
	@Autowired
	@Qualifier("numberOfKids")
	private int numberKids;
	@Autowired
	@Qualifier("isSucide")
	private boolean isSucide;
	@Autowired
	@Qualifier("isMurder")
	private boolean isMurder;
	@Autowired
	@Qualifier("isLegsTwisted")
	private boolean isLegsTwisted;
	@Autowired
	@Qualifier("salaryOfGhost")
	private double salaryOfGhost;
	@Autowired
	@Qualifier("naturalDeath")
	private boolean naturalDeath;
	@Autowired
	@Qualifier("daibetese")
	private boolean daibetese;

	@Autowired
	public Ghost(@Qualifier("ghostName") String ghostName, @Qualifier("ghostLastName") String ghostLastName,
			@Qualifier("ghostAge") int ghostAge, @Qualifier("deathDate") LocalDate deathDate,
			@Qualifier("ghostProffesion") String ghostProffesion, @Qualifier("isMarried") boolean isMarried,
			@Qualifier("ghostFatherName") String ghostFatherName, @Qualifier("ghostMotherName") String ghostMotherName,
			@Qualifier("ghostWifeName") String ghostWifeName,@Qualifier("gender") String gender) {
		this.ghostName = ghostName;
		this.ghostLastName = ghostLastName;
		this.ghostAge = ghostAge;
		this.deathDate = deathDate;
		this.ghostProffesion = ghostProffesion;
		this.isMarried = isMarried;
		this.ghostFatherName = ghostFatherName;
		this.ghostMotherName = ghostMotherName;
		this.ghostWifeName = ghostWifeName;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Ghost [ghostName=" + ghostName + ", ghostLastName=" + ghostLastName + ", ghostAge=" + ghostAge
				+ ", deathDate=" + deathDate + ", ghostProffesion=" + ghostProffesion + ", isMarried=" + isMarried
				+ ", ghostFatherName=" + ghostFatherName + ", ghostMotherName=" + ghostMotherName + ", ghostWifeName="
				+ ghostWifeName + ", gender=" + gender + ", ghostBrotherName=" + ghostBrotherName + ", houseNumber="
				+ houseNumber + ", kids=" + kids + ", numberKids=" + numberKids + ", isSucide=" + isSucide
				+ ", isMurder=" + isMurder + ", isLegsTwisted=" + isLegsTwisted + ", salaryOfGhost=" + salaryOfGhost
				+ ", naturalDeath=" + naturalDeath + ", daibetese=" + daibetese + "]";
	}

}
