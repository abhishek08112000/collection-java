package com.xworkz.soldier.repo;

import com.xworkz.soldier.dto.SoldierDTO;

public class RepoSoldierImpl implements RepoSoldiers{

	@Override
	public RepoSoldiers save(SoldierDTO dto) {
		System.out.println("Save dto "+ dto);
		RepoSoldierImpl ref = new RepoSoldierImpl();
		return ref;
	}

	
}
