package com.xworkz.soldier.repo;

import com.xworkz.soldier.dto.SoldierDTO;

public class RepoSoldierImpl implements RepoSoldiers{

	@Override
	public boolean save(SoldierDTO dto) {
		System.out.println("save method running in SoldierRepoImpl");
		System.out.println("Save dto "+ dto);
		return false;
	}

	
}
