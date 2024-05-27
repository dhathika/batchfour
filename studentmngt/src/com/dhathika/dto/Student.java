package com.dhathika.dto;

public class Student {
	
	private int stdId;
	private String stdName;
	private String stdClass;
	private double stdPercentage;
	private String stdSchool;
	
	
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getStdClass() {
		return stdClass;
	}
	public void setStdClass(String stdClass) {
		this.stdClass = stdClass;
	}
	public double getStdPercentage() {
		return stdPercentage;
	}
	public void setStdPercentage(double stdPercentage) {
		this.stdPercentage = stdPercentage;
	}
	public String getStdSchool() {
		return stdSchool;
	}
	public void setStdSchool(String stdSchool) {
		this.stdSchool = stdSchool;
	}
	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdClass=" + stdClass + ", stdPercentage="
				+ stdPercentage + ", stdSchool=" + stdSchool + "]";
	}
	
	

}
