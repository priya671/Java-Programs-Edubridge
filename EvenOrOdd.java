package com.edu;
import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		int n;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		n = s.nextInt();
		
		if(n%2==0) {
			System.out.println("Number is EVEN");
		}else {
			System.out.println("Number is ODD");
		}

		
	}

}
