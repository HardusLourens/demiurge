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

public class TestFitnessTracker_x2
{
	public static void main(String[] args)
	{


		FitnessTracker_x2 tracker1 = new FitnessTracker_x2();
		FitnessTracker_x2 tracker2 = new FitnessTracker_x2();
		FitnessTracker_x2 tracker3 = new FitnessTracker_x2("cycling", 35, LocalDate.now());
		//FitnessTracker_x2 tracker4 = new FitnessTracker_x2();
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
		System.out.println("");

		





	}



}