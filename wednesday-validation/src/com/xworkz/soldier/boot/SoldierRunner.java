package com.xworkz.soldier.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.soldier.configuration.SpringConfiguration;
import com.xworkz.soldier.dto.SoldierDTO;
import com.xworkz.soldier.repo.RepoSoldierImpl;
import com.xworkz.soldier.repo.RepoSoldiers;
import com.xworkz.soldier.service.SoldierServiceImpl;

public class SoldierRunner {

	public static void main(String[] args) {
		
		ApplicationContext container = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		RepoSoldiers repod = container.getBean(RepoSoldiers.class);
		SoldierDTO soldier = new SoldierDTO("Dayanand", 14, "India", "Topper", "LOC");
		System.out.println(repod.save(soldier));
		
		
		
//		System.out.println(soldier);
//		
//		SoldierServiceImpl serImpl = new SoldierServiceImpl();
//		RepoSoldiers repo = new RepoSoldierImpl();
//		serImpl.setRepoSoldier(repo);
//		serImpl.validateAndSave(soldier);
	}
}
