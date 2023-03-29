package com.edu;

import java.util.Scanner;

public class LargerNumber {

	public static void main(String[] args) {
		int a,b;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number: ");
		a=scan.nextInt();
		System.out.println("Enter second number: ");
		b=scan.nextInt();
		
		if(a>b) {
			System.out.println("First number is greater");
		}
		else if(b>a) {
			System.out.println("Second number is greater");
		}
		else {
			System.out.println("Both are equal");
		}
		scan.close();


	}

}
