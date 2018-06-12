/*

USING AN 'IF...ELSE' STATEMENT (cont...)
----------------------------

Class name: 	Payroll
File name: 		Payroll.java
Date:			27.02.2018
Author:			Hardus Lourens

Source: 		'PROGRAMMING JAVA', Joyce Farrel; chapter 5-MAKING DECISIONS 'You Do IT' - p.252

Description: 	An app that displays decision making using 'if...else' statements.
 
 */

import java.util.Scanner;

public class Payroll 
{
	public static void main (String[] args)
	{
		double rate;
		double hoursWorked;
		double regularPay;
		double overtimePay;
		final int FULL_WEEK = 40;
		final double OT_RATE = 1.5;

		Scanner input = new Scanner(System.in);
		System.out.print("How many hours did you work this week? >> ");
		hoursWorked = input.nextDouble();
		System.out.print("What is your regular payrate? >> ");
		rate = input.nextDouble();

		if(hoursWorked > FULL_WEEK)
		{
			regularPay = FULL_WEEK * rate;
			overtimePay = (hoursWorked - FULL_WEEK)*rate*OT_RATE;
		}
		else
		{
			regularPay = hoursWorked * rate;
			overtimePay = 0.0;
		}
		System.out.println("RegularPay is " + regularPay + "\nOVertime pay is " + overtimePay);
	}
}