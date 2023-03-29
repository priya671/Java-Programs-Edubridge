package com.edu;
import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a positive number: ");
		num = sc.nextInt();
		
		switch(num%2){
		case 0: System.out.println(num + " is even number"); //will return 0
			break;
		case 1: System.out.println(num + " is odd number"); //will return 1
		}	

	}

}
