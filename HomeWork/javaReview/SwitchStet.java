package javaReview;
import java.util.Scanner;
public class SwitchStet {

	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter moont");
		int month=scan.nextInt();
		String name=null;
		
		 switch (month) {
		 
		 case 1:
			 name="January";
		 break;
		 case 2 :
	           name="February";
		 break;
		
		 case 3 :
	           name="March";
		 break;
		 case 4 :
	           name="April";
		 break;
		 case 5 :
	           name="May";
		 break;
		 case  6 :
	      name="June";
	        break;
		 case 7 :
	           name="July";
		 break;
		 case 8 :
	            name="August";
		break;
		 case( 9) :
	          name="Sep";
		 break;
		 case(10) :
	           name="Oct";
		 break;
		 case( 11) :
	           name="Nov";
		 break;
		 case( 12) :
	           name="Dec";
	           break;
	      default:
	            System.out.println("Invalid Month");
	            break;
		 }
		 
	        System.out.println("today is"+ name);
		 }
	
}
