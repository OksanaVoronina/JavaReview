package javaReview;
import java.util.Scanner;
public class NastedIfElse {
 public static  void main(String args[]) {
	    
	    Scanner scan=new Scanner(System.in);
	    System.out.println("Do you need a loan?");
	    String loan = scan.next();
	    String eligible;
	    
	        if(loan.equals("yes")){
	        System.out.println("What is your credit score?");
	          int score= scan.nextInt();
	      
	         if ( score < 600){
	            eligible="Not eligible";
	             }
	            else if (score>600 && score <700 ){
	              eligible=" Maybe eligible";
	            }
	            else if ( score > 701 && score <800){
	              eligible=" Eligible";
	            }
	            else {
	              eligible="Definitely eligible";
	            }
	         
	            
	        }else{
	          System.out.println(" Unknown");
	        } 
 }
}
