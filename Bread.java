/*

USING CONSTRUCTORS AND THE OVERLOADING OF METHODS/CONSTRUCTORS
-------------------

Class name: 	Bread
File name: 		Bread.java
Date:			08.02.2018
Author:			Hardus Lourens

Source: 		'PROGRAMMING JAVA', Joyce Farrel; chapter 4 'Programming Exercises' - p.239

Description: 	The class behind a bakery application 
 
 */
import java.util.Scanner;
import java.time.*;

public class Bread
{

	private String breadType;
	private int caloriesPerSlice;
	public final static String MOTTO = "The Staff of Life";

	public Bread(String bType, int cPerS)
	{
		breadType = bType;
		caloriesPerSlice = cPerS;
	}
	public void setBreadType(String bType)
	{
		breadType = bType;
	}
	public void setCaloriesPerSlice(int cPerS)
	{
		caloriesPerSlice = cPerS;
	}
	public String getBreadType()
	{
		return breadType;
	}
	public int getCaloriesPerSlice()
	{
		return caloriesPerSlice;
	}
}