package com.xworkz.soldier.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.soldier.dto.SoldierDTO;
import com.xworkz.soldier.repo.RepoSoldierImpl;
import com.xworkz.soldier.repo.RepoSoldiers;

public class SoldierServiceImpl implements SoldierService{

	private RepoSoldiers repoSoldier;
	
	
	
	public void setRepoSoldier(RepoSoldiers repoSoldier) {
		this.repoSoldier = repoSoldier;
	}
	
	@Override
	public boolean validateAndSave(SoldierDTO dto) {
		System.out.println("Running validateAndSave in SoldierServiceImpl");
		System.out.println("Dto passing " + dto);
		
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<SoldierDTO>> violation = validator.validate(dto);
		
		if(!violation.isEmpty()) {
			System.err.println("Validation is Error");
			return true;
		}
		else {
			System.out.println("Validation done");
			
			 boolean save1 =repoSoldier.save(dto);
			 System.out.println("dto saved using repo "+ save1);
			 return save1;
		}
		
		
	}
}
