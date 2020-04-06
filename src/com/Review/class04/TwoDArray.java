package com.Review.class04;

public class TwoDArray {
public static void main(String args[]) {
	
int [][]num= {{	1,34,5,},{3,65,4,},{4,5,6,6}};
	 int rows=num.length;
	 int sum=0;
	 int num1=0;
	 for(int i=0;i<rows;i++) {
		 System.out.println("im at row "+i);
		 int length=num[i].length;
		 for(int j=0;j<length;j++) {
			  num1=num[i][j];
			  sum+=num1;			 
        System.out.print(num1+",");
   	 }
	 }
				System.out.print(" and sum = "+sum);

		 
		 System.out.println("");
		 int min=num[0][0];
		 int max=num[0][0];
		 for(int i=0;i<num.length;i++) {
			 for(int j=0;j<num[i].length;j++) {
				 int element=num[i][j];
				 if(element<min) {
					 min=element;
			 }
				 if(element >max) {
					 max=element;
				 }
			 
		 }
	 }
     System.out.println(min); 
     System.out.println(max); 

}
}



