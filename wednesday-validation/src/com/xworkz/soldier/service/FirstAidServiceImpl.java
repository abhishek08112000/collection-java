package com.xworkz.soldier.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.soldier.dto.FirstAidDTO;
import com.xworkz.soldier.repo.FirstAidRepo;

@Component
public class FirstAidServiceImpl implements FirstAidService {

	@Autowired
	private Validator validator;
	private FirstAidRepo firstAidRepo;
	
	@Autowired
	public FirstAidServiceImpl(FirstAidRepo firstAidRepo) {
		this.firstAidRepo = firstAidRepo;
	}

	@Override
	public boolean validateAndSave(FirstAidDTO aidDTO) {
		System.out.println("Running validateAndSave");
		System.out.println("FirstAid passing " + aidDTO);

		Set<ConstraintViolation<FirstAidDTO>> violation = this.validator.validate(aidDTO);
		
		if(!violation.isEmpty()) {
			System.err.println("There is an error");
			return true;
		}
		else {
			System.out.println("The data is valid");
			boolean saved = firstAidRepo.saved(aidDTO);
			System.out.println("Dto is saved "+ saved);
			return saved;
		}
	}

}
