package com.xworkz.soldier.repo;

import org.springframework.stereotype.Component;

import com.xworkz.soldier.dto.SoldierDTO;

@Component
public class RepoSoldierImpl implements RepoSoldiers{

	@Override
	public boolean save(SoldierDTO dto) {
		System.out.println("save method running in SoldierRepoImpl");
		System.out.println("Save dto "+ dto);
		return true;
	}

	
}
