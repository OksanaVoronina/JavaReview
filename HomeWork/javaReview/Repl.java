package javaReview;
import java.util.Scanner;
public class Repl {
public static void main(String args[]) {
	

	//Write a for loop that will print out a series of numbers 
	//starting at 0 and ending at the doubled value of end
	//(value must be taken from a user), exclusive.
	 
	     int end;
			
	    System.out.print("Int:");
	    Scanner scan= new Scanner(System.in);
	    end=scan.nextInt();
	    //int doubled;
	    //doubled=end+end;
	    for(int i=0;i<(end+end);i++){
	      System.out.print(i+" ");
	    }      
}
}
