package com.Review.class04;

public class InHeand2DArray {
public static void main(String args[]) {
	
	int [][]num= {{	1,34,5,},{3,65,4,},{4,5,6,6}};
int sum=0;
	for(int[]row:num) {
		
		for(int num1:row) {
			
		System.out.print(num1+" ");
		sum+=num1;
	}
		System.out.println("");
	}
		System.out.println(sum);
}

}

