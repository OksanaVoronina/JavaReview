package com.Review.class07;

public class Doctor {
  static String hospitalName; 
	String name;
	String licenceId;
	int salary;
	String address;
	Doctor(String name, String licenceId,int salary){
	this.name=name;
	this.licenceId=licenceId;
	this.salary=salary;
	}
	Doctor(String name, String licenceId,int salary,String address){
		this(name,licenceId,salary);
		this.address=address;
	}
	public void checkUp(String patientName) {
		System.out.println("Doctor "+name+" has orderded blood test to "+patientName);
	}
	public void treatPatient(String patientName) {
		this.checkUp(patientName);
		System.out.println("Doctor "+this.name+" gives prescription to "+patientName);
	this.chargePatien();
	}
	public void chargePatien() {
		System.out.println(" Let me charge $100");
	}
	public void DisplayInfo(){
		System.out.println(" doctor "+name+" with licenceId "
	+licenceId+" and works for "+hospitalName+" "+address);
	}
}
