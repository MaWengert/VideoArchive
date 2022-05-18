package fh.aalen.person;

import javax.persistence.Entity; 
import javax.persistence.Id;

@Entity
public class Person {

	@Id 
	private String id; 
	private String surename; 
	private String birthdate; 
	
	public Person(){}; 
	
	
	public Person(String id, String surename, String birthdate) {
		super();
		this.id = id;
		this.surename = surename;
		this.birthdate = birthdate;
	}; 

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSurename() {
		return surename;
	}

	public void setSurename(String surename) {
		this.surename = surename;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}


	
	
	
}
