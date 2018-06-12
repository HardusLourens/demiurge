/*

USING CONSTRUCTORS AND THE OVERLOADING OF METHODS/CONSTRUCTORS
-------------------

Class name: 	Sandwhich
File name: 		Sandwhich.java
Date:			10.02.2018
Author:			Hardus Lourens

Source: 		'PROGRAMMING JAVA', Joyce Farrel; chapter 4 'Programming Exercises' - p.239

Description: 	The main class behind a bakery's sandwhich application 
 
 */

public class Sandwhich
{
	private Bread bread;
	private SandwhichFilling sandwhichFilling;

	
	public Sandwhich(Bread bread, SandwhichFilling sandwhichFilling)
	{
		
		this.bread = bread;
		this.sandwhichFilling = sandwhichFilling;
 	}
 	public Bread getBread()
 	{
 		return bread;
 	}
 	public SandwhichFilling getSandwhichFilling()
 	{
 		return sandwhichFilling;
 	}

}

//