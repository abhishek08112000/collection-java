package com.xworkz.soldier.repo;

import org.springframework.stereotype.Component;

import com.xworkz.soldier.dto.FirstAidDTO;

@Component
public class FirstAidRepoImpl implements FirstAidRepo{

	@Override
	public boolean saved(FirstAidDTO aidDTO) {
		System.out.println("Running save method in FirstAidRepoImpl");
		System.out.println("Save dto "+ aidDTO);
		return false;
	}

}
