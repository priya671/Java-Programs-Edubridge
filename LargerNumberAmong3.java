package com.edu;
import java.util.Scanner;

public class LargerNumberAmong3 {

	public static void main(String[] args) {
		int a,b,c;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		a = scan.nextInt();
		
		System.out.println("Enter second number: ");
		b = scan.nextInt();
		
		System.out.println("Enter third number: ");
		c = scan.nextInt();
		
		if(a>b && a>c) {
			System.out.println("First number is the largest");
		}
		else if(b>a && b>c){
			System.out.println("Second number is the greatest");
		}else {
			System.out.println("Third number is the largest");
		}
		

	}

}
