package com.Girmiti.Javaprogram;
/*Area of Circle Program*/

import java.util.Scanner;

public class Circle {
	public static void main(String[] args) {
		/*Area of circle=PI*r*r*/
		//PI=22/7 OR 3.14
		
		/*Variable Declaration*/
		double PI=3.14;
		double area;
		int r;
		
		/*Input for  Radius  of Circle*/
        System.out.println("Enter radius of circle");
         Scanner ref = new Scanner(System.in);
	    r = ref.nextInt();
	    
	    /*Calculating Area of Circle*/
	      area = PI*r*r;
	    
		/*Print the area of Circle*/
        System.out.println("Area of circle"+"="+area);


		
	}

}
