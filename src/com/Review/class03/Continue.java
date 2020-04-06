package com.Review.class03;

public class Continue {
public static void main(String args[]) {
	
	for(int i=12;i<=35;i++) {   //if you want num %2 or %3
		if(i%2==0 || i%3==0) {
			continue;
		}
		//System.out.println(i);
	}
	
	System.out.println("========2way========");
	for(int a=15;a<=35;a++) {   //if you want num %2and %3
		if (a%2!=0 && a%3!=0) {
			continue;
		}
System.out.println(a);
}
}
}