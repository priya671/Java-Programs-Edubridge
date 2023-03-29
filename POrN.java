package com.edu;
import java.util.Scanner;

public class POrN {

	public static void main(String[] args) {
		int a;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		a = scan.nextInt();
		
		if(a<0) {
			System.out.println("Number is negative");
		}
		else if(a>0) {
			System.out.println("Number is positive");
		}
		else {
			System.out.println("Number is zero");
		}

	}

}
