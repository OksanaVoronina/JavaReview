package javaReview;
import java.util.Scanner;
public class Logic {

	public static void main(String args []){
		  
		  Scanner scan=new Scanner(System.in);
		  System.out.println(" Are you thirsty?");
		  boolean thirsty =scan.nextBoolean();
		  System.out.println(" Are you sleepy?");
		  boolean sleepy = scan.nextBoolean();
		  String drink;
		  if (  thirsty==true && sleepy!=true ){
		    drink="Water";
		  }
		  else if (thirsty==true && sleepy==true){
		    drink="Coffee";
		  }
		  else if (thirsty!= true && sleepy==true){
		    drink="Tea";
		  }
		  else{
		    drink="Nothing";
		  }
		  System.out.println(" Looks like you need to drink " +drink);
}
}
