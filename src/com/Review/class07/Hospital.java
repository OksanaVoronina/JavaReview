package com.Review.class07;

public class Hospital {
public static void main(String[] args) {
	Doctor.hospitalName="inova";
	Doctor doc1=new Doctor("James","12344",15000);
		doc1.DisplayInfo();
	doc1.treatPatient("Oksana");

	Doctor doc2=new Doctor("Andy","12874",18000);
	doc2.DisplayInfo();
doc2.treatPatient("Oksana");

Doctor doc3=new Doctor("Andy","12874",18000,"Main");
doc3.DisplayInfo();
doc3.treatPatient("Oksana");
}
}
