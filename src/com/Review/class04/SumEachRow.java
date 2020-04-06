package com.Review.class04;

public class SumEachRow {

public static void main(String args[]) {
	
	int [][]num= {{	1,34,5,},{3,65,4,},{4,5,6,6}};

	int[]sum=new int[num.length];

			for( int i=0;i<num.length;i++) {
				for(int j=0;j<num[i].length;j++) {
					int element=num[i][j];
		sum[i]+=element;
				}
			}
			for(int element:sum)
		
		System.out.println("the sum is "+element);
				  
				
		}	
}
	


