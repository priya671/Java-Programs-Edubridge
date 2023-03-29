package com.edu;

public class Areas {

	public static void main(String[] args) {
		System.out.println("****************Area Calculator*****************");
		
		
		//For Circle
		float pi = 3.14f;
		float r = 15.55f;
		float C;
		
		//Area of circle
		C = pi*r*r;
		System.out.println("Area of circle= " + C + " For pi value= " + pi + " radius value= " + r);
		
		//For Rectangle
		float l = 90.88f;
		float b = 120.99f;
		float R;
		
		//Area of Rectangle
		R = l*b;
		System.out.println("Area of Rectangle= " + R + " For l value= " + l + " b value= " + b);
		
		
		//For square
		float side = 100.789f;
		
		//Area of square
		float squ = side*side;
		System.out.println("Area of Square= " + squ + " For side value = " + side);
		
		
		//For Triangle
		float base = 56.77f;
		float height = 88.99f;
		
		//Area of Triangle
		float T = (base*height)/2;
		System.out.println("Area of Triangle= " + T + " For base value= " + base + " For height value= " + height );
		
		

	}

}
