package com.Revies.class05;
import java.util.Scanner;
public class ArrayInputScan {
public static void main(String args[]) {
	
	Scanner scan=new Scanner(System.in);
	System.out.println("size of arry?");
	int i=scan.nextInt();
	int [] num=new int[i];
	int a;
	for(a=0;a<i;a++) {
		
		System.out.println("What is number");
		int numb=scan.nextInt();
		num[a]=numb;
	}
	for(int n:num) {
	System.out.println(n);	
}
}
}
