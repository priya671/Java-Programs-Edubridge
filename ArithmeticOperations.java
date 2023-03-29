package com.edu;

public class ArithmeticOperations {
	public static void main(String args[]) {
		float fno,sno,ans;
		fno=45.87f;
		sno=12.89f;
		
		System.out.println("**********Calculator*************");
		
		//Addition
		ans=fno+sno;
		System.out.println("The addition of " + fno + " and " + sno + " is " + ans);
		
		//Subtraction
		ans=fno-sno;
		System.out.println("The subtraction of " + fno + " and " + sno + " is " + ans);
		
		//Multiplication
		ans=fno*sno;
		System.out.println("The Multiplication of " + fno + " and " + sno + " is " + ans);
		
		//Division
		ans=fno/sno;
		System.out.println("The Division of " + fno + " and " + sno + " is " + ans);
	}

}
