package com.Revies.class06;

public class Baby {

	String fn;
	String ln;
  char gender;
  double weight;
  String hairColor;
  
  
  public void walk() {
  System.out.println(" Crawling");
}
public String cry( ) {//has no parameter but will return String
	  return "Cry every minute";                    //change void to string 
	
	
}
public void talk(int times) {// we add parameters
	for(int i=1;i<=times;i++) {
	System.out.print(" Bla ");
	}
}
public void babyDisplay() {
	System.out.println("Baby name is "+fn+" "+ln+ " and gendder is ");

}
public static void main(String args[]) {
	Baby baby1=new Baby();
	baby1.fn="DAVID";
	baby1.ln="Voronina";
	baby1.gender='M';
	baby1.weight=9;
	baby1.hairColor="Blond";
	baby1.babyDisplay();
	if (baby1.gender=='M') {
		System.out.println("boy");
	}else {
		System.out.println("Girl");
	}
    baby1.walk();
	baby1.talk(3);//provide argument
	System.out.println(baby1.cry());

	
	Baby baby2=new Baby();
	baby2.fn="Mary";
	baby2.ln="Voronina";
	baby2.gender='F';
	baby2.weight=9;
	baby2.hairColor="Blond";
	baby2.babyDisplay();
	if (baby2.gender=='M') {
		System.out.println("boy");
	}else {
		System.out.println("Girl");
	}
	baby2.walk();
    baby2.talk(2); //provide argument
	System.out.println(baby2.cry());
}
}
