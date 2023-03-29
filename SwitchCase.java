package com.edu;
import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		int day;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter day of the week: ");
		day = s.nextInt();
		
		switch(day) {
		case 1:
			System.out.println("Sunday is the first day of the week");
			break;
		case 2:
			System.out.println("Monday is the second day of the week");
			break;
		case 3:
			System.out.println("Tuesday is the third day of the week");
			break;
		case 4:
			System.out.println("Wednesday is the fourth day of the week");
			break;
		case 5:
			System.out.println("Thursday is the fifth day of the week");
			break;
		case 6:
			System.out.println("Friday is the sixth day of the week");
			break;
		case 7:
			System.out.println("Saturday is the seventh day of the week");
			break;
		default:
			System.out.println("Invalid Input");
		}

	}

}
