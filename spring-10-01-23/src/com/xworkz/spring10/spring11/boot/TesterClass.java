package com.xworkz.spring10.spring11.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring10.spring11.bean.AllDataTypes;
import com.xworkz.spring10.spring11.bean.HardwareShop;
import com.xworkz.spring10.spring11.bean.Pencil;
import com.xworkz.spring10.spring11.bean.Rubber;
import com.xworkz.spring10.spring11.bean.Software;
import com.xworkz.spring10.spring11.bean.SofwareEngineer;
import com.xworkz.spring10.spring11.configuration.ConfigurationClass;

public class TesterClass {

	public static void main(String[] args) {
		
		ApplicationContext things = new AnnotationConfigApplicationContext(ConfigurationClass.class);
		
		HardwareShop shop = things.getBean(HardwareShop.class);
		
		System.out.println("Shop id is " + shop.getId());
		System.out.println("Shop name is "+ shop.getName());
		System.out.println("Shop owner name is : "+ shop.getOwnerName());
		System.out.println("Shop gst no is : "+ shop.getGstNo());
		System.out.println("Shop address is : "+ shop.getAddress());
		
		System.out.println("============ Softwares ===============");
		
		Software software = things.getBean(Software.class);
		
		System.out.println(software.getName());
		System.out.println(software.getVersion());
		System.out.println(software.getDeveloper());
		System.out.println(software.getDate());
		
		System.out.println("============= SoftwareEngineer ============");
		
		SofwareEngineer engg = things.getBean(SofwareEngineer.class);
		System.out.println(engg);

		System.out.println("============= Pencil class ============");
		
		Pencil pencil = things.getBean(Pencil.class);
		System.out.println(pencil);
		
		System.out.println("============= Rubber class ============");
		
		Rubber rubber = things.getBean(Rubber.class);
		System.out.println(rubber);
		
		System.out.println("============= AllDataTypes class ============");
		
		AllDataTypes all = things.getBean(AllDataTypes.class);
		System.out.println(all);
		
	}
}
