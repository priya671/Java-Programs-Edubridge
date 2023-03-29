package com.user;

import java.util.*;

public class ProgramUser {

	public static void main(String[] args) {
		/*
		 * String name = "Priya Kothare"; int age = 21; String centre =
		 * "Salem - Alagapuram"; String deg = "Bsc Computer Science"; int mrks = 400;
		 */

		String name, surname, c, qual;
		int age;
		float marks=0.0f;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter name: ");
		name = s.nextLine();
		
		System.out.println("Enter Surname: ");
		surname = s.nextLine();
		
		System.out.println("Enter centre: ");
		c = s.nextLine();
		
		System.out.println("Enter Highest Qualification: ");
		qual = s.nextLine();
		
		System.out.println("Enter age: ");
		age = s.nextInt();
		
		System.out.println("Enter Average Marks: ");
		marks = s.nextFloat();
		
		System.out.println("**************************************");
		System.out.println("Data received: ");
		System.out.println("Name: " + name);
		System.out.println("Surname: " + surname);
		System.out.println("Centre Name: " + c);
		System.out.println("Degree Name: " + qual);
		System.out.println("Age:" + age);
		System.out.println("Average Marks: " + marks);
	}

}
