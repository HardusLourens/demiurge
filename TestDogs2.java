/*

USING STATIC AND NON-STATIC FINAL FIELDS
----------------------------------------

Class name: 	TestDogs
File name: 		TestDogs.java
Date:			24.01.2018
Author:			Hardus Lourens

Source: 		'PROGRAMMING JAVA', Joyce Farrel; chapter 4 'You Do It' - p.217

Description: 	This is the code for the client application that makes use of the DogTriathlonParticipant clss

 
 */
public class TestDogs2
{
	public static void main(String[] args)
	{
		DogTriathlonParticipant2 dog1 = new DogTriathlonParticipant2("Bowser", 3, 85, 89, 0);
		dog1.display();
		DogTriathlonParticipant2 dog2 = new DogTriathlonParticipant2("Rush", 3, 1, 72, 80);
		dog2.display();
		DogTriathlonParticipant2 dog3 = new DogTriathlonParticipant2("Ginger", 1, 0, 0, 72);
		dog3.display();		
	}

}


