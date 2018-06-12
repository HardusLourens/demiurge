/*

THE BANK BALANCE APP
-----------------------------------------------

Class name: 	EnterSmallValue
File name: 		EnterSmallValue.java
Date:			26.04.2018
Author:			Hardus Lourens

Source: 		'PROGRAMMING JAVA', Joyce Farrel; chapter 6: LOOPING 'Case Problems' - p.311

Description: 	An app to calculate the balance year on year at a set interest rate
*/

import java.util.Scanner;

public class EnterSmallValue {

	public static void main(String[] args)
	{
		int userEntry;
		final int LIMIT = 3;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter an integer no higher than " + LIMIT + " >> ");
		userEntry = input.nextInt();
		while(userEntry > LIMIT) 
		{
			System.out.println("The number you entered was too high");
			System.out.print("Please enter and integer no higher than " + LIMIT + " >> ");
			userEntry = input.nextInt();

		}

		System.out.println("You correctly entered " + userEntry+" !");
	}
}

