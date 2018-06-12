/*

USING CONSTRUCTORS AND THE OVERLOADING OF METHODS
-------------------

Class name: 	Billing
File name: 		Billing.java
Date:			28.02.2018
Author:			Hardus Lourens

Source: 		'PROGRAMMING JAVA', Joyce Farrel; chapter 4 'Programming Exercises' - p.239

Description: 	The code required to make a little fitness tracker application work
 
 */

import java.time.*;

public class TestFitnessTracker_x
{
	public static void main(String[] args)
	{


		FitnessTracker_x tracker1 = new FitnessTracker_x();
		FitnessTracker_x tracker2 = new FitnessTracker_x();
		FitnessTracker_x tracker3 = new FitnessTracker_x("cycling", 35, LocalDate.now());

		//tracker1.setFitnessActivity();
		//tracker1.setNumberOfMinutes();
		tracker1.setDate();
		System.out.println("For activity 1....");
		System.out.println("Activity >> " + tracker1.getFitnessActivity());
		System.out.println("Number of minutes >> " + tracker1.getNumberOfMinutes());
		System.out.println("Date >> " + tracker1.getDate());
		System.out.println("");

		tracker2.setFitnessActivity("swimming");
		tracker2.setNumberOfMinutes(45);
		tracker2.setDate();
		System.out.println("For activity 2...");
		System.out.println("Activity >> " + tracker2.getFitnessActivity());
		System.out.println("Number of minutes >> " + tracker2.getNumberOfMinutes());
		System.out.println("Date >> " + tracker2.getDate());
		System.out.println("");

		System.out.println("For activity 3..");
		tracker3.display();





	}



}