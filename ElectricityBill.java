package com.edu;
import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		int unit;
		double amount;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter units: ");
		unit = s.nextInt();
		
		if(unit>0 && unit<=100) { //till 100
			amount = unit*2.00;
		}
		else if(unit>100 && unit<=400) {
			amount = 100*2.00+(unit-100)*3.00;
		}
		else {
			amount = 100*2.00+300*3.00+(unit-400)*3.50;
		}
		
		System.out.println("Amount= " + amount);
		
		

	}

}
