package com.xworkz.soldier.repo;

import org.springframework.stereotype.Component;

import com.xworkz.soldier.dto.ResortDTO;

@Component
public class ResortRepoImpl implements ResortRepo {

	@Override
	public boolean save(ResortDTO dto) {
		System.out.println("Running save method");
		System.out.println("Dto is saved by ResortRepoImpl "+ dto);
		return false;
	}

}
