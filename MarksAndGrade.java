package com.edu;
import java.util.Scanner;

public class MarksAndGrade {

	public static void main(String[] args) {
		int marks;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter marks: ");
		marks = s.nextInt();
		
		if(marks>=90 && marks<=100) {
			System.out.println("Grade A");
		}
		else if(marks>=70 && marks<=89) {
			System.out.println("Grade B");
		}
		else if(marks>=40 && marks<=69) {
			System.out.println("Grade C");
		}
		else if(marks>=0 && marks<=39) {
			System.out.println("Grade D");
		}else {
			System.out.println("Invalid Marks");
		}

	}

}





/*
 * package com.edu;
 * 
 * import java.util.Scanner;
 * 
 * public class GradeMain {
 * 
 * public static void main(String[] args) { int m; Scanner sc=new
 * Scanner(System.in); System.out.println("Enter marks"); m=sc.nextInt(); if(m<0
 * || m>100) { System.out.println("Invalid input"); System.exit(0); } else {
 * if(m>=90 && m<=100){ System.out.println("Grade A"); } else if(m>=70 &&
 * m<=89){ System.out.println("Grade B"); } else if(m>=40 && m<=69){
 * System.out.println("Grade C"); } else if(m>=0 && m<=30){
 * System.out.println("Grade D"); }else{ System.out.println("Invalid Input"); }
 * } }
 * 
 * }
 */
