/*

MAKING USE OF THE MATHS CLASS TO DO CALCULATIONS
------------------------------------------------

Class name: 	MathTest
File name: 		MathTest.java
Date:			14.02.2018
Author:			Hardus Lourens

Source: 		'PROGRAMMING JAVA', Joyce Farrel; chapter 4 'Programming Exercises' - p.241

Description: 	An app that does some 'circular' calculations with the Circle class
 
 */

import java.lang.Math;
import java.util.Random;

public class MathTest
{
	
	public static void main(String[] args)
	{	
		double squareRoot37 = Math.sqrt(37);
		double sine300 = Math.sin(300);
		double cosine300 = Math.cos(300);
		double floor22point8 = Math.floor(22.8);
		double ceiling22point8 = Math.ceil(22.8);
		double round22point8 = Math.round(22.8);
		int random =(int)((Math.random()*100)%20 +1);



		System.out.println("The square root of 37 is "+squareRoot37);
		System.out.println("The sine of 300 is " + sine300);
		System.out.println("The cosine of 300 is " + cosine300);
		System.out.println("The floor of 22.8 is " + floor22point8);
		System.out.println("The ceiling of 22.8 is " + ceiling22point8);
		System.out.println("The round of 22.8 is " + round22point8); 
		System.out.println("The random number is " + random);
	}
}