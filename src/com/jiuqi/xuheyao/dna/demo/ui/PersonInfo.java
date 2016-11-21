package com.jiuqi.xuheyao.dna.demo.ui;

import java.util.Date;

public class PersonInfo {
	
	private String personName;
	private int personAge;
	private String personSex;
	private Date personDate;
	
	public PersonInfo(String personName, int personAge, String personSex, Date personDate)
	{
		this.setPersonName(personName);
		this.setPersonAge(personAge);
		this.setPersonSex(personSex);
		this.setPersonDate(personDate);
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public int getPersonAge() {
		return personAge;
	}

	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}

	public String getPersonSex() {
		return personSex;
	}

	public void setPersonSex(String personSex) {
		this.personSex = personSex;
	}

	public Date getPersonDate() {
		return personDate;
	}

	public void setPersonDate(Date personDate) {
		this.personDate = personDate;
	}
}
