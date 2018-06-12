/*

USING CONSTRUCTORS AND THE OVERLOADING OF METHODS/CONSTRUCTORS
-------------------

Class name: 	Circle
File name: 		Circle.java
Date:			13.02.2018
Author:			Hardus Lourens

Source: 		'PROGRAMMING JAVA', Joyce Farrel; chapter 4 'Programming Exercises' - p.241

Description: 	The class behind an app that does some 'circular' calculations 
 
 */
import java.lang.Math;

public class Circle
{
	private double radius, diameter, area;

	 public Circle()
	 {
	 	radius = 1;
	 	diameter = 2*radius;
	 	area = java.lang.Math.PI*radius*radius;

	 }
	 public Circle(double r)
	 {
	 	radius = r;
	 	diameter = 2*radius;
	 	area = java.lang.Math.PI*radius*radius;
	 }
	 public void setRadius(double r)
	 {
	 	radius = r;
	 	diameter = radius*2;
	 	area = java.lang.Math.PI*2*radius;
	 }
	 public double getRadius()
	 {
	 	return radius;
	 }
	 public void Display()
	 {
	 	System.out.println("Radius: " +radius);
	 	System.out.println("Diameter: " + diameter);
	 	System.out.println("Area: " + area);
	 }
}