package javaReview;
import java.util.Scanner;
public class ForLoops {
public static void main (String args[]) {
	
	Scanner scan=new Scanner(System.in);
	
	int total=0;
	int input;
	System.out.println("enter positiv num.enter -1 to stop");
	input=scan.nextInt();
	
      for(;input!=-1;) {
		System.out.println("enter positiv num.enter -1 to stop");
	
total=input+total;
      input=scan.nextInt();
	}
	
	   System.out.println("the total is " +total);

//}
//2way--------
  while(input!=-1) {
	 System.out.println("enter positiv num.enter -1 to stop");
		total+=input;

	input=scan.nextInt();	
   }
   System.out.println("the total is " +total);
//}
//3way---------
   do {
	   System.out.println("enter positiv num.enter -1 to stop");
		total+=input;

	input=scan.nextInt();
   }while(input!=-1);
   
     System.out.println("total is " +total);
}
}
