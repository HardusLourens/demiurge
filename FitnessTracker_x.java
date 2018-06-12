/*

USING CONSTRUCTORS AND THE OVERLOADING OF METHODS
-------------------

Class name: 	Billing
File name: 		Billing.java
Date:			08.02.2018
Author:			Hardus Lourens

Source: 		'PROGRAMMING JAVA', Joyce Farrel; chapter 4 'Programming Exercises' - p.239

Description: 	The code required to make a little fitness tracker application work
 
 */
import java.util.Scanner;
import java.time.*;



public class FitnessTracker_x
{
	private String fitnessActivity;
	private int numberOfMinutes;
	private LocalDate today;

	public FitnessTracker_x()
	{
		fitnessActivity = "running";
		numberOfMinutes = 0;
		today = LocalDate.now();
	}
	public FitnessTracker_x(String fA, int nOm, LocalDate d)
	{
		fitnessActivity = fA;
		numberOfMinutes = nOm;
		today = d;
	}

	public void setFitnessActivity(String fA)
	{
		fitnessActivity = fA;
	}
	public String getFitnessActivity()
	{
		return fitnessActivity;
	}
	public void setNumberOfMinutes(int nOm)
	{
		numberOfMinutes = nOm;
	}
	public int getNumberOfMinutes()
	{
		return numberOfMinutes;
	}
	public void setDate()
	{
		today = LocalDate.now();
	}
	public LocalDate getDate()
	{
		return today;
	}

	public void display()
	{
		System.out.println("Activity >> " + fitnessActivity);
		System.out.println("Number of minutes >> " + numberOfMinutes);
		System.out.println("Date >> " + LocalDate.now());
	}
	
}