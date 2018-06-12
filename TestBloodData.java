/*

USING CONSTRUCTORS AND THE OVERLOADING OF METHODS/CONSTRUCTORS
-------------------

Class name: 	TestBloodData
File name: 		TestBloodData.java
Date:			08.02.2018
Author:			Hardus Lourens

Source: 		'PROGRAMMING JAVA', Joyce Farrel; chapter 4 'Programming Exercises' - p.239

Description: 	The blood group application makes use of the BloodData class
 
 */
public class TestBloodData
{
	public static void main(String[] args)
	{
		BloodData type1 = new BloodData();
		BloodData type2 = new BloodData("B", "-");

		System.out.println("BLOOD GROUP 1 ...");
		System.out.println("Blood type >> " + type1.getBloodType());
		System.out.println("RH Factor >> " + type1.getRHFactor());
		System.out.println("");

		//type2.setBloodType("B");
		//type2.setRHFactor("-");
		System.out.println("BLOOD GROUP 2 ...");
		System.out.println("Blood type >> " + type2.getBloodType());
		System.out.println("RH Factor >> " + type2.getRHFactor());
	}
}