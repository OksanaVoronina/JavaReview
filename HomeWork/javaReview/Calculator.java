package javaReview;
import java.util.Scanner;
public class Calculator {
public static void main(String args[]) {
	
	Scanner scan =new Scanner(System.in);
	System.out.println("enter number");
	int num1=scan.nextInt();
	System.out.println("enter operation");
	char operator=scan.next().charAt(0);
	System.out.println("Enter num2");
	int num2=scan.nextInt();
	
	if(operator=='+') {
		System.out.println(num1 +num2);
	}
	else if(operator=='-') {
		System.out.println(num1-num2);
	}
	else if(operator=='*') {
		System.out.println(num1*num2);
	}
	else {
		System.out.println(num1/num2);
	}
	
}
}
