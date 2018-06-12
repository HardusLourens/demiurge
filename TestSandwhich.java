/*

USING CONSTRUCTORS AND THE OVERLOADING OF METHODS/CONSTRUCTORS
-------------------

Class name: 	TestSandwhich
File name: 		TestSandwhich.java
Date:			10.02.2018
Author:			Hardus Lourens

Source: 		'PROGRAMMING JAVA', Joyce Farrel; chapter 4 'Programming Exercises' - p.239

Description: 	Tip Top Bakery's sandwhich application 
 
 */



public class TestSandwhich
{

	public static void main(String[] args)
	{

		System.out.println("TIP TOP BAKERY'S DELUXE SANDWHICHES");
		System.out.println("-----------------------------------");
		System.out.println("");

		Bread bread1 = new Bread("rye", 666);
		SandwhichFilling sandwhichFilling1 = new SandwhichFilling("chicken mayo", 777);
		Sandwhich sandwhich1 = new Sandwhich(bread1, sandwhichFilling1);	

		Bread bread2 = new Bread("wholewheat", 327);
		SandwhichFilling sandwhichFilling2 = new SandwhichFilling("tomato & cheese", 415);
		Sandwhich sandwhich2 = new Sandwhich(bread2, sandwhichFilling2);	

		Bread bread3 = new Bread("white", 789);
		SandwhichFilling sandwhichFilling3 = new SandwhichFilling("butter", 184);
		Sandwhich sandwhich3 = new Sandwhich(bread2, sandwhichFilling3);		
		
		System.out.println("Sandwhich 1 details.....");
		double totalCalories1 = (sandwhich1.getBread().getCaloriesPerSlice()*2) + sandwhich1.getSandwhichFilling().getCaloriesPerServing();
		System.out.println("The total calories you will imbibe with this sarmie is " +totalCalories1);
		System.out.println("");

		System.out.println("Sandwhich2 details.....");
		double totalCalories2 = (sandwhich2.getBread().getCaloriesPerSlice()*2) + sandwhich2.getSandwhichFilling().getCaloriesPerServing();
		System.out.println("The total calories you will imbibe with this sarmie is " +totalCalories2);
		System.out.println("");

		System.out.println("Sandwhich 3 details.....");
		double totalCalories3 = (sandwhich3.getBread().getCaloriesPerSlice()*2) + sandwhich3.getSandwhichFilling().getCaloriesPerServing();
		System.out.println("The total calories you will imbibe with this sarmie is " +totalCalories3);
		System.out.println("");


	}
}