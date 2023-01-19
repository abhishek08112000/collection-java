package com.xworkz.soldier.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.soldier.dto.MissileDTO;
import com.xworkz.soldier.repo.MissileRepoImpl;

@Component
public class MissileServiceImpl implements MissileService {

	@Autowired
	private Validator validator;
	private MissileRepoImpl missileRepo;
	
	@Autowired
	public MissileServiceImpl(MissileRepoImpl missileRepo) {
		this.missileRepo = missileRepo;
	}
	
	@Override
	public boolean validateAndSave(MissileDTO dto) {
		System.out.println("Running valdition and save method by MissileServiceImpl");
		System.out.println("MissileDTO "+ dto);
		
		Set<ConstraintViolation<MissileDTO>> violation = this.validator.validate(dto);
		
		if(!violation.isEmpty()) {
			System.err.println("There is error in th validation");
			return true;
		}
		else {
			System.out.println("The validation is done..");
			boolean saved = missileRepo.saveData(dto);
			return saved;
		}
	}

}
