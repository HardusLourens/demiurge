/*

USING CONSTRUCTORS AND THE OVERLOADING OF METHODS/CONSTRUCTORS
-------------------

Class name: 	TestBread
File name: 		TestBread.java
Date:			10.02.2018
Author:			Hardus Lourens

Source: 		'PROGRAMMING JAVA', Joyce Farrel; chapter 4 'Programming Exercises' - p.239

Description: 	The class behind a blood group application 
 
 */



public class TestBread
{

	public static void main(String[] args)
	{
		Bread bread1 = new Bread("rye", 123);
		Bread bread2 = new Bread("wholeheat", 234);
		Bread bread3 = new Bread("white", 345);

		System.out.println(Bread.MOTTO);
		System.out.println("Bread type >> " + bread1.getBreadType());
		System.out.println("Calories per slice >> " + bread1.getCaloriesPerSlice());
		System.out.println("");
		System.out.println(Bread.MOTTO);
		System.out.println("Bread type >> " + bread2.getBreadType());
		System.out.println("Calories per slice >> " + bread2.getCaloriesPerSlice());
		System.out.println("");
		System.out.println(Bread.MOTTO);
		System.out.println("Bread type >> " + bread3.getBreadType());
		System.out.println("Calories per slice >> " + bread3.getCaloriesPerSlice());
		System.out.println("");
	}
}