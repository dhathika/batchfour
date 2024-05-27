package com.dhathika.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	private int sid;
	@Column(name = "FIRSTNAME")
	private String firstName;
	@Column (name = "LASTNAME")
	private String lastName;
	
	
	public Student(int sid, String firstName, String lastName) {

		this.sid = sid;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	

}
