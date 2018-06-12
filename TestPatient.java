/*

USING CONSTRUCTORS AND THE OVERLOADING OF METHODS/CONSTRUCTORS
-------------------

Class name: 	TestPatient
File name: 		TestPatient.java
Date:			08.02.2018
Author:			Hardus Lourens

Source: 		'PROGRAMMING JAVA', Joyce Farrel; chapter 4 'Programming Exercises' - p.239

Description: 	This class makes us of the BloodData class to assign a patient a blood group
 */
public class TestPatient
{
	public static void main(String[] args)
	{
		BloodData patient2Blood = new BloodData("AB", "-");
		Patient patient1 = new Patient();
		Patient patient2 = new Patient(666, 666, patient2Blood);

		System.out.println("Patient 1's particulars....");
		System.out.println("Identity >> " + patient1.getID());
		System.out.println("Age >> " + patient1.getAge());
		System.out.println("Blood group >> " + patient1.bloodGroup.getBloodType());
		System.out.println("RH Factor >> " + patient1.bloodGroup.getRHFactor());
		System.out.println("");

		System.out.println("Patient 2's particulars....");
		System.out.println("Identity >> " + patient2.getID());
		System.out.println("Age >> " + patient2.getAge());
		System.out.println("Blood group >> " + patient2.bloodGroup.getBloodType());
		System.out.println("RH Factor >> " + patient2.bloodGroup.getRHFactor());
		System.out.println("");
		System.out.println();

	}
}