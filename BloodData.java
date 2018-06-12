/*

USING CONSTRUCTORS AND THE OVERLOADING OF METHODS/CONSTRUCTORS
-------------------

Class name: 	BloodData
File name: 		BloodData.java
Date:			09.02.2018
Author:			Hardus Lourens

Source: 		'PROGRAMMING JAVA', Joyce Farrel; chapter 4 'Programming Exercises' - p.239

Description: 	The class behind a blood group application 
 
 */
import java.util.Scanner;
import java.time.*;

public class BloodData
{
	private String bloodType;
	private String rHFactor;

	public BloodData()
	{
		bloodType = "O";
		rHFactor = "+";
	}
	public BloodData(String t, String f)
	{
		bloodType = t;
		rHFactor = f;
	}
	public void setBloodType(String t)
	{
		bloodType = t;
	}
	public String getBloodType()
	{
		return bloodType;
	}
	public void setRHFactor(String f)
	{
		rHFactor = f;
	}
	public String getRHFactor()
	{
		return rHFactor;
	}
}

