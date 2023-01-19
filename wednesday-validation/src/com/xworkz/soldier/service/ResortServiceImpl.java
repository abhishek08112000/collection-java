package com.xworkz.soldier.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;

import com.xworkz.soldier.dto.ResortDTO;
import com.xworkz.soldier.repo.ResortRepo;

public class ResortServiceImpl implements ResortService {

	@Autowired
	private Validator validator;
	private ResortRepo resortRepo;

	@Autowired
	public ResortServiceImpl(ResortRepo resortRepo) {
		this.resortRepo = resortRepo;
	}

	@Override
	public boolean validateAndSave(ResortDTO dto) {
		System.out.println("Running validate and save method");
		System.out.println("Dto " + dto);

		Set<ConstraintViolation<ResortDTO>> violation = this.validator.validate(dto);

		if (!violation.isEmpty()) {
			System.err.println("There is error in validation");
			return true;
		} else {
			System.out.println("The dto is valid");
			boolean saved = resortRepo.save(dto);
			return saved;
		}
	}

}
