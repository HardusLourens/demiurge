/*

USING CONSTRUCTORS AND THE OVERLOADING OF METHODS/CONSTRUCTORS
-------------------

Class name: 	SandwhichFilling
File name: 		SandwhichFilling.java
Date:			08.02.2018
Author:			Hardus Lourens

Source: 		'PROGRAMMING JAVA', Joyce Farrel; chapter 4 'Programming Exercises' - p.239

Description: 	The anxilliary class behind a bakery application 
 
 */
import java.util.Scanner;
import java.time.*;

public class SandwhichFilling
{

	private String fillingType;
	private int caloriesPerServing;
	;

	public SandwhichFilling(String fType, int cPerServ)
	{
		fillingType = fType;
		caloriesPerServing = cPerServ;
	}
	public void setSandwhichFilling(String fType)
	{
		fillingType = fType;
	}
	public void setCaloriesPerServing(int cPerServ)
	{
		caloriesPerServing = cPerServ;
	}
	public String getSandwhichFilling()
	{
		return fillingType;
	}
	public int getCaloriesPerServing()
	{
		return caloriesPerServing;
	}
}