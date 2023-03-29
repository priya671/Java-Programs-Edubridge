package com.edu;

import java.util.Scanner;

public class CalculatorSwitch {

	public static void main(String[] args) {
		float num1,num2,ans;
		Scanner sc = new Scanner(System.in);

		System.out.println("Calculator");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("5.Exit");
		
		System.out.println("Enter 2 numbers: ");
		num1 = sc.nextFloat();
		num2 = sc.nextFloat();
		
		System.out.println("Enter your choice: ");
		int choice = sc.nextInt();
		
		switch(choice) {
			case 1: 
				ans = num1+num2;
				System.out.println("The sum of " + num1 + " " + num2 + " is " + ans);
				break;
			case 2 : 
				ans = num1-num2;
				System.out.println("The difference of " + num1 + " " + num2 + " is " + ans);
				break;
			case 3 : 
				ans = num1 * num2;
				System.out.println("The product of " + num1 + " " + num2 + " is " + ans);
				break;
			case 4 : 
				ans = num1 / num2;
				System.out.println("The division of " + num1 + " " + num2 + " is " + ans);
				break;
			case 5 : 
				System.out.println("The program is terminated");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Input");
				
		}

	}

}
