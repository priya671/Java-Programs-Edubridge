package com.edu;

public class ReverseThreeDigitNumber {

	public static void main(String[] args) {
		int num = 432;
		int r;
		
		// / and %
		// without loops
		
		r = num%10;
		System.out.print(r);//2
		
		num=num/10; //43
		r=num%10;
		System.out.print(r); //3
		
		num = num/10; //4
		r = num%10;//4
		System.out.print(r); //4
		
		

	}

}
