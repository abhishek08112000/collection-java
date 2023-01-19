package com.xworkz.soldier.dto;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public abstract class AbstractAuidDTO implements Serializable{

	private String createdBy;
	private LocalDate createdDate;
	private String updatedBy;
	private LocalDate updateDate;
}
