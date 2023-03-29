package com.edu;

import java.util.Scanner;

public class AreaOfFigures {

	public static void main(String[] args) {
		int choice;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Area Of Figures Calculator");
		System.out.println("1.To calculate area of Square");
		System.out.println("2.To calculate area of Rectangle");
		System.out.println("3.To calculate area of Circle");
		System.out.println("4.To calculate area of Triangle");
		System.out.println("5.Exit");
		System.out.println("Enter your choice: ");
		choice = scan.nextInt();
		
		switch(choice) {
		case 1: 
			System.out.println("Enter the side value: ");
			float side = scan.nextFloat();
			float sq_area = side * side;
			System.out.println("Area of Square is: " + sq_area);
			break;
			
		case 2:
			System.out.println("Enter length value: ");
			float l = scan.nextFloat();
			System.out.println("Enter breadth value: ");
			float b = scan.nextFloat();
			float rec_area = l*b;
			System.out.println("Area of Rectangle is: " + rec_area);
			break;
			
		case 3:
			System.out.println("Enter the radius value: ");
			float r = scan.nextFloat();
			double cir_area = Math.PI*r*r;
			System.out.println("Area of Circle: " + cir_area);
			break;
			
		case 4:
			System.out.println("Enter the value for base: ");
			float base = scan.nextFloat();
			System.out.println("Enter the value for height: ");
			float height = scan.nextFloat();
			double tri_area = (base*height)/2;
			System.out.println("Area of Traingle: " + tri_area);
			break;
			
		case 5:
			System.out.println("Program has been terminated");
			System.exit(0);
			break;
			
		default:
			System.out.println("Invalid Input");
		}

	}

}
