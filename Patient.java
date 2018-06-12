/*

USING CONSTRUCTORS AND THE OVERLOADING OF METHODS/CONSTRUCTORS
-------------------

Class name: 	Patient
File name: 		Patient.java
Date:			08.02.2018
Author:			Hardus Lourens

Source: 		'PROGRAMMING JAVA', Joyce Farrel; chapter 4 'Programming Exercises' - p.239

Description: 	This class makes us of the BloodData class to assign a patient a blood group
 */

import java.util.Scanner;
import java.time.*;

public class Patient
{

	private int identity, age;
	public BloodData bloodGroup;

	public Patient()
	{
		identity = 0;
		age = 0;
		bloodGroup = new BloodData();

	}
	public Patient(int id, int a, BloodData blood)
	{
		identity = id;
		age = a;
		bloodGroup = blood;
		
	}
	public int getID()
	{
		return identity;
	}
	public int getAge()
	{
		return age;
	}
	public BloodData getBloodGroup(BloodData bloodGroup)
	{
		return bloodGroup;
	}

}