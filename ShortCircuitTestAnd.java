/*

USING AN 'IF...ELSE' STATEMENT
----------------------------

Class name: 	ShortCircuitTestAnd
File name: 		ShortCircuitTestAnd.java
Date:			21.03.2018
Author:			Hardus Lourens

Source: 		'PROGRAMMING JAVA', Joyce Farrel; chapter 5-MAKING DECISIONS 'You Do IT' - p.252

Description: 	An app to assign a volunteer to price an item based on the condition of an 'if...else' statement
 
 */

import java.util.Scanner;

public class ShortCircuitTestAnd 
{
	public static void main(String[] args)
	{
		if(falseMethod() && trueMethod())
		{
			System.out.println("Both are true.");
		}else{
			System.out.println("Both are not true.");
		}
	}

	public static boolean trueMethod()
	{   
		System.out.println("truthy...");
		return true;
	}

	public static boolean falseMethod()
	{
		System.out.println("falsy...");
		return false;
	}
}
