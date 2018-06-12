/*

THE BANK BALANCE APP
-----------------------------------------------

Class name: 	BankBalance
File name: 		BankBalance.java
Date:			26.04.2018
Author:			Hardus Lourens

Source: 		'PROGRAMMING JAVA', Joyce Farrel; chapter 6: LOOPING 'Case Problems' - p.51

Description: 	An app to calculate the balance year on year at a set interest rate
*/

import java.util.Scanner;

public class BankBalance {

	public static void main(String[] args)
	{
		double balance;
		int response;
		int year = 1;
		final double INT_RATE = 0.03;

		Scanner input = new Scanner(System.in);
		System.out.print("Enter initial bank balance >> ");
		balance = input.nextDouble();
		System.out.println("Do you want to see next year's balance?");
		System.out.print("Enter 1 for yes");
		System.out.print(" or any other number for no >> ");
		response = input.nextInt();
		//input.nextLine();
		System.out.print("You're in");
		while(response == 1)
		{
			balance = balance + balance * INT_RATE;
			System.out.println("After year "  + year + " at interest rate of " + INT_RATE + ", balance is R" + balance);
			year = year + 1;
			System.out.println("\nDo you want to the balance " +
				"at the end of another year?");
			System.out.print("Enter 1 for yes");
			System.out.print(" or any other number for no >> ");

		}


	}
}

