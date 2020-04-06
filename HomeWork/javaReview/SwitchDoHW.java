package javaReview;

public class SwitchDoHW {
public static void main(String args[]) {
	
	int num=20;
	int num1=20;
	
	while(num>=1) {
		System.out.println(num);
		num-=2;
		}
	
	
	System.out.println("--------2st way------");
	
	do {
		  
	    System.out.println(num1);
	    num1-=2;
	 
	}while (num1>=1) ;
	
	
	 System.out.println("---------3 way----------");
	 
	 for(int i=20;i>=1;i-=2) {
		 System.out.println(i);
	}
	 
	 System.out.println("----------4way-------");
	 
	 for (int i=20;i<=50;i++) {
		 
		 if(i%2 !=0) {
		 System.out.println(i);
	 }
	 }
}
}
	 
	 


        
	 
	 





