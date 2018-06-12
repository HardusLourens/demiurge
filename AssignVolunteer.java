/*

USING AN 'IF...ELSE' STATEMENT
----------------------------

Class name: 	AssignVolunteer
File name: 		AssignVolunteer.java
Date:			27.02.2018
Author:			Hardus Lourens

Source: 		'PROGRAMMING JAVA', Joyce Farrel; chapter 5-MAKING DECISIONS 'You Do IT' - p.252

Description: 	An app that does some 'circular' calculations with the Circle class
 
 */

import java.util.Scanner;

public class AssignVolunteer 
{
	public static void main (String[] args)
	{
		int donationType;
		String volunteer;
		final int CLOTHING_CODE = 1;
		final int OTHER_CODE = 2;
		final String CLOTHING_PRICER = "Regina";
		final String OTHER_PRICER = "Marco";

		Scanner input = new Scanner(System.in);
		System.out.println("What type of donation is this?");
		System.out.println("Enther "+CLOTHING_CODE+" for clothing, "
			+OTHER_CODE+" for anything else...");
		donationType = input.nextInt();


		if(donationType == CLOTHING_CODE)
			{
				volunteer = CLOTHING_PRICER;
			}
		else
			{
				volunteer = OTHER_PRICER;
			}


		System.out.println("You entered "+donationType+".");
		System.out.println("The assistant who will help you is "+volunteer+".");

	}
}