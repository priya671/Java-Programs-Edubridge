package com.edu;

public class BitwiseOR {

	public static void main(String[] args) {
		byte b = 3;
		int i = 0;
		
		switch(b) {
			case 3 | 4 : i = i + 4;
				System.out.println("i = " + i);
			case 2 | 3 : i = i + 2;
				System.out.println("i2 = " + i);
			
		}
		System.out.println(i);

	}

}
