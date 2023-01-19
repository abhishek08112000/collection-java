package com.xworkz.soldier.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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
public class SoldierDTO extends AbstractAuditDTO{

	@NotNull
	@NotBlank
	@Size(min = 3, max = 20)
	private String name;
	@Min(value = 5)
	@Max(value = 25)
	private int id;
	@NotNull
	@NotBlank
	@Size(min = 5, max = 20)
	private String country;
	@NotNull
	@NotBlank
	@Size(min = 5, max = 20)
	private String rank;
	@NotNull
	@NotBlank
	@Size(min = 3, max = 20)
	private String battalion;
}
