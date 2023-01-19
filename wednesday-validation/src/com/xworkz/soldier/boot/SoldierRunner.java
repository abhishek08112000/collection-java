package com.xworkz.soldier.boot;

import com.xworkz.soldier.dto.SoldierDTO;
import com.xworkz.soldier.repo.RepoSoldiers;
import com.xworkz.soldier.service.SoldierServiceImpl;

public class SoldierRunner {

	public static void main(String[] args) {
		
		SoldierDTO soldier = new SoldierDTO("Dayanand", 14, "India", "Topper", "LOC");
		
		System.out.println(soldier);
		
		SoldierServiceImpl serImpl = new SoldierServiceImpl();
		serImpl.validateAndSave(soldier);
		
		
		
	}
}
