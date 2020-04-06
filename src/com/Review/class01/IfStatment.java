package com.Review.class01;
import java.util.Scanner;

public class IfStatment {
	public static void main(String arg[]) {
		
	Scanner scan = new Scanner(System.in);
	System.out.println("How old are you");
	int age= scan.nextInt();
	System.out.println("what is yopur gender");
	char gender=scan.next().charAt(0); 
	
	if (age>25) {
		
		if (gender=='F') {
		System.out.println("WOMEN");
		
	}else {
	  System.out.println("man");
	}
	}else{
	 if (gender=='F') {
		 System.out.println("girl");
	 
	
	}else {
		System.out.println("boy");
	}
	}
	}
}
