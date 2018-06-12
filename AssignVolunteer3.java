/*

USING AN 'IF...ELSE' STATEMENT
----------------------------

Class name: 	AssignVolunteer3
File name: 		AssignVolunteer3.java
Date:			27.02.2018
Author:			Hardus Lourens

Source: 		'PROGRAMMING JAVA', Joyce Farrel; chapter 5-MAKING DECISIONS 'You Do IT' - p.252

Description: 	An app to assign a volunteer to price an item based on the condition of an 'if...else' statement
 
 */

import java.util.Scanner;

public class AssignVolunteer3 
{
	public static void main (String[] args)
	{
		int donationType;
		String volunteer = "";
		final int CLOTHING_CODE = 1;
		final int OTHER_CODE = 2;
		final String CLOTHING_PRICER = "Regina";
		final String OTHER_PRICER = "Marco";
		final String NO_PRICER = "DEAD!";
		String message;

		Scanner input = new Scanner(System.in);
		System.out.println("What type of donation is this?");
		System.out.println("Enther "+CLOTHING_CODE+" for clothing, "
			+OTHER_CODE+" for anything else...");
		donationType = input.nextInt();


		if(donationType == CLOTHING_CODE)
			{
				volunteer = CLOTHING_PRICER;
				message = "a clothing donation";
			}
		else if(donationType == OTHER_CODE)
			{
				volunteer = OTHER_PRICER;
				message = "another donation";
			}
		else
			{
				volunteer = NO_PRICER;
				message = "an error! Check the codes and try again...";
			}


		System.out.println("You entered "+donationType+".");
		System.out.println("The assistant who will help you is "+volunteer+".");
		System.out.println("This is " + message);

	}
}