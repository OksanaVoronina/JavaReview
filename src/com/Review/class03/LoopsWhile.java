package com.Review.class03;

public class LoopsWhile {
public static void main(String args[]) {
	int sumEven=0;
	int sumOdd=0;
	//int i=1;
	System.out.println("========1way=======");
	//while (i<=50) {
	//	 if(i%2==0) {
	//		 sumEven+=i;
	//	 }else {
	//		sumOdd+=i;
	//	 }
	//	i++;
	//}
		//System.out.println("sum of even =" +sumEven);
		//System.out.println("sum of odd= "+sumOdd);
		 
		
		System.out.println("========2way========");
		
		//int count=1;
		//do {
			//sumEven+=count;
			//count+=2;
			
		//}while(count<=50);
			
		//System.out.println("sum of even =" +sumEven);
		//System.out.println("sum of odd= "+sumOdd);
		//}
System.out.println("===========3way========");


for(int a=1;a<=50;a++) {
	if(a%2==0) {
		sumEven+=a;
	}else {
		sumOdd+=a;
	}
}
	System.out.println("sum of even =" +sumEven);
	System.out.println("sum of odd= "+sumOdd);

}
}

	
	


