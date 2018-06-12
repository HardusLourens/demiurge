/*

USING CONSTRUCTORS AND THE OVERLOADING OF METHODS/CONSTRUCTORS
-------------------

Class name: 	TestSandwhichFilling
File name: 		TestSandwhichFilling.java
Date:			10.02.2018
Author:			Hardus Lourens

Source: 		'PROGRAMMING JAVA', Joyce Farrel; chapter 4 'Programming Exercises' - p.239

Description: 	App to test SandwhichFilling class instantiation and methods
 
 */



public class TestSandwhichFilling
{

	public static void main(String[] args)
	{
		SandwhichFilling filling1 = new SandwhichFilling("egg mayonnaise", 456);
		SandwhichFilling filling2 = new SandwhichFilling("tuna mayonnaise", 384);
		SandwhichFilling filling3 = new SandwhichFilling("peanut butter", 602);


		System.out.println("Filling >> " + filling1.getSandwhichFilling());
		System.out.println("Calories per serving >> " + filling1.getCaloriesPerServing());
		System.out.println("");
		
		System.out.println("Filling >> " + filling2.getSandwhichFilling());
		System.out.println("Calories per serving >> " + filling2.getCaloriesPerServing());
		System.out.println("");
		
		System.out.println("Filling >> " + filling3.getSandwhichFilling());
		System.out.println("Calories per serving >> " + filling3.getCaloriesPerServing());
		System.out.println("");
	}
}