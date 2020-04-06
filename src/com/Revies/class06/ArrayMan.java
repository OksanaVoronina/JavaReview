package com.Revies.class06;

public class ArrayMan {

	public int largestNum(int [] array) {
		int largest =array[0];
		for(int i =0;i<array.length;i++) {
			if(array[i]>largest) {
				largest=array[i];
			}
		}
		return largest;
	}
	int smalestNum(int[]array) {
		int smalest=array[0];
		for(int num:array) {
			if(num<smalest) {
				smalest=num;
			}
		}
		return smalest;
	}
	private static double finfAvarage(int[]array) {
		int sum=0;
		for(int num:array) {
			sum+=num;
		}
		return sum/array.length;
		
	}
	public static void main(String args[]) {
		int [] array= {3,8,9,7,9,3};
		// bz its static you can call from outside object
		double avg=finfAvarage(array);
		System.out.println("avarage is "+avg);

		ArrayMan manip=new ArrayMan();
		int largest=manip.largestNum(array);
		System.out.println("largest is "+largest);
		
		System.out.println("");
		System.out.println("smalest is "+manip.smalestNum(array));
		
		//hw creat a method that return sum of an array
	}
}
