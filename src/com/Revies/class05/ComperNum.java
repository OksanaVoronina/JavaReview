package com.Revies.class05;

public class ComperNum {
public static void main(String args[]) {
	
	int[] num= {23,45,67,89,64};
	int largest=num[0];
	int small=num[0];
	int total=0;
	int sum=0;
	for(int numbers:num) {
		if( numbers>largest) {
			largest=numbers;
		}
		if(numbers<small) {
			small=numbers;
		}
		sum+=sum;
	}
	System.out.println("the largest num is "+ largest);
	System.out.println("the smallest "+ small);
}
}
