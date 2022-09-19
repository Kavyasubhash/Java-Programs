package com.Girmiti.Javaprogram;
/*
 * Author:Kavya
 */
import java.util.Scanner;

public class Rectangle {
	public static void main(String[] args)
	{
		/*Declaration of variables*/
	    double Length;
	    double  Width;
	    double  area;
	    double  Perimeter;

        /*Creating Scanner class object*/
	    Scanner input = new Scanner(System.in);
	    
	    /*Input for length of Rectangle*/
		System.out.println("Enter the value of Length");
		Length=input.nextDouble();
		
		/*Input for  width of the Rectangle*/
		System.out.println("Enter the value of Width");
		Width=input.nextDouble();
		
		/*Calculating Area of Rectangle*/
		area = Length * Width;
		
		/*Calculating Perimeter of Rectangle*/
          Perimeter = 2 * (Length + Width);
          
          
		/*Print the area of Rectangle*/
        System.out.println("area"+" "+ area);
        
		/*Print the perimeter of Rectangle*/
       System.out.println("Perimeter"+" "+ Perimeter);

		
	}

}
