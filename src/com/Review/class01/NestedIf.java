package com.Review.class01;
import java.util.Scanner;
public class NestedIf {
	 public static void main(String args []){
		  
		  Scanner scan= new Scanner(System.in);
		 System.out.println("Please enter 3 distinct numbers");
		 int num1=scan.nextInt();
		 int num2=scan.nextInt();
		 int num3=scan.nextInt();
		int largeNum;
		 if( num1> num2){
		   if ( num1>num3){
		     largeNum=num1;
		   }else{
		     largeNum=num3;
		  } 
		 
		 
		 }else{
		      largeNum=num2;
		     }
		 System.out.println(" th large num is " + largeNum);
}
	 
}
