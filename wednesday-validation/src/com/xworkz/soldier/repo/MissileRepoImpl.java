package com.xworkz.soldier.repo;

import org.springframework.stereotype.Component;

import com.xworkz.soldier.dto.MissileDTO;

@Component
public class MissileRepoImpl implements MissileRepo {

	@Override
	public boolean saveData(MissileDTO dto) {
		System.out.println("Running saveData method");
		System.out.println("Save the data " + dto);
		return false;
	}

}
