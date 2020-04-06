package com.Review.class03;

public class ForLoop {

	public static void main(String[] args) {
		int day =1;
		
		for(day=1;day<=20;day++) {
			if(day==13) {
				continue;
		}
		
         System.out.println(day);
	}
		System.out.println("=======2way======");
		
		for(day=1;day<=20;day++) {
			if(day!=13) {
				System.out.println("happy birthday " +day);
			}
		}
		
	}
}
