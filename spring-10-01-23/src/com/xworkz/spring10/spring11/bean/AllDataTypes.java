package com.xworkz.spring10.spring11.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AllDataTypes {

	@Autowired
	@Qualifier("string")
	private String string;
	@Autowired
	@Qualifier("shortt")
	private short shortt;
	@Autowired
	@Qualifier("flot")
	private float flot;
	@Autowired
	@Qualifier("byt")
	private byte byt;
	@Autowired
	@Qualifier("intt")
	private int intt;
	@Autowired
	@Qualifier("longer")
	private long longer;
	@Autowired
	@Qualifier("chhar")
	private char chhar;
	@Autowired
	@Qualifier("isWritten")
	private boolean isWritten;
	@Autowired
	@Qualifier("doble")
	private double doble;

	public AllDataTypes() {
		System.out.println("Created AllDataTypes constructor.......");
	}

	@Override
	public String toString() {
		return "AllDataTypes [string=" + string + ", shortt=" + shortt + ", flot=" + flot + ", byt=" + byt + ", intt="
				+ intt + ", longer=" + longer + ", chhar=" + chhar + ", isWritten=" + isWritten + ", doble=" + doble
				+ "]";
	}

}
