/*

USING CONSTRUCTORS AND THE OVERLOADING OF METHODS/CONSTRUCTORS
-------------------

Class name: 	TestCircle
File name: 		TestCircle.java
Date:			13.02.2018
Author:			Hardus Lourens

Source: 		'PROGRAMMING JAVA', Joyce Farrel; chapter 4 'Programming Exercises' - p.241

Description: 	An app that does some 'circular' calculations with the Circle class
 
 */

public class TestCircle
{


	public static void main (String[] args)
	{
		Circle small = new Circle();
		Circle defacti = new Circle();
		Circle medium = new Circle();
		Circle mediumF = new Circle();
		Circle large = new Circle();

		small.setRadius(0.5);
		defacti.setRadius(1);
		medium.setRadius(2);
		mediumF.setRadius(2.7861);
		large.setRadius(25000);

		System.out.println("The areas of the various circles are....");

		small.Display();
		defacti.Display();
		medium.Display();
		mediumF.Display();
		large.Display();



	}
}