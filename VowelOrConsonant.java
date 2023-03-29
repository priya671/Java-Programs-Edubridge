package com.edu;
import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		char alphabet;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a character: ");
		alphabet = scan.next().charAt(0);
		
		
		if(alphabet=='a' || alphabet=='e' || alphabet=='i' || alphabet=='o' || alphabet=='u' || alphabet=='A' || alphabet=='E' || alphabet=='I' || alphabet=='O' || alphabet=='U') {
			System.out.println("It is a vowel");
		}
		else {
			System.out.println("It is a consonant");
		}

	}

}
