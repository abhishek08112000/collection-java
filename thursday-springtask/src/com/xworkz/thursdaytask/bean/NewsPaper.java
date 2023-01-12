package com.xworkz.thursdaytask.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NewsPaper {

	@Autowired
	@Qualifier("paperId")
	private int id;
	private String newsPaperName;
	private String ownerName;
	@Autowired
	@Qualifier("paperlanguage")
	private String language;
	private double price;

	@Autowired
	public NewsPaper(@Qualifier("paperName") String newsPaperName,@Qualifier("paperOwnerName") String ownerName) {
		super();
		this.newsPaperName = newsPaperName;
		this.ownerName = ownerName;
	}

	@Override
	public String toString() {
		return "NewsPaper [id=" + id + ", newsPaperName=" + newsPaperName + ", ownerName=" + ownerName + ", language="
				+ language  + "]";
	}
	
	@Autowired
	@Qualifier("paperPrice")
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}

	
}
