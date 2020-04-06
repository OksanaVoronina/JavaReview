package javaReview;
import java.util.Scanner;
public class Pract {
public static void main(String args[]) {
String name;
    String subject=null;
    
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter name of the instructor");
    name=scan.nextLine();

   
    
  	  if (name!="Asel" || name!="Weqas") {
    switch(name){
      case "Shiva":
        subject="Java";
        break;
      case "Sandish":
        subject="SDLC";
        break;
      case "Weqas":
        subject="Selenium";
        break;
      case "Asel":
        subject="every";
        break;
        default:
        	//
        	break;
        	}
  //if (name=="Asel" || name=="Weqas") {
          System.out.println("Will take care of "+subject+" Assignment");
          
  	  }else{
          System.out.println(" not walid");
  }
  	  }
  	  }
    
      




