package com.xworkz.soldier.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.soldier.dto.SoldierDTO;
import com.xworkz.soldier.repo.RepoSoldiers;

@Component
public class SoldierServiceImpl implements SoldierService {

	@Autowired
	private Validator validator;
	private RepoSoldiers repoSoldier;

	@Autowired
	public void setRepoSoldier(RepoSoldiers repoSoldier) {
		this.repoSoldier = repoSoldier;
	}

	@Override
	public boolean validateAndSave(SoldierDTO dto) {
		System.out.println("Running validateAndSave in SoldierServiceImpl");
		System.out.println("Dto passing " + dto);

		Set<ConstraintViolation<SoldierDTO>> violation = this.validator.validate(dto);

		if (!violation.isEmpty()) {
			System.err.println("Validation is Error");
			return true;
		} else {
			System.out.println("Validation done");
			boolean save1 = repoSoldier.save(dto);
			System.out.println("dto saved using repo " + save1);
			return save1;
		}

	}
}
