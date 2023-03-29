package com.edu;

import java.util.Scanner;

public class VowelOrConsonantSwitch {

	public static void main(String[] args) {
		char a1;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a character: ");
		a1 = scan.next().charAt(0);
		
		switch(a1) {
		case 'a': System.out.println(a1 + " is a vowel");
			break;
		case 'e': System.out.println(a1 + " is a vowel");
			break;
		case 'i': System.out.println(a1 + " is a vowel");
			break;
		case 'o': System.out.println(a1 + " is a vowel");
			break;
		case 'u': System.out.println(a1 + " is a vowel");
			break;
		case 'A': System.out.println(a1 + " is a vowel");
			break;
		case 'E': System.out.println(a1 + " is a vowel");
			break;
		case 'I': System.out.println(a1 + " is a vowel");
			break;
		case 'O': System.out.println(a1 + " is a vowel");
			break;
		case 'U': System.out.println(a1 + " is a vowel");
			break;
		default:
			System.out.println(a1 + " is a consonant");
		}

	}

}
