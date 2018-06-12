/*

* SIMPLE CASE PROBLEMS p.118
* class name: CarlysEventPrive
* File name: CarlysEventPrice.java
* author: Hardus Lourens
* date: 22.01.2017

======================>
*/

// import javax.swing.JOptionPane;
import java.util.Scanner;

public class CarlysEventPrice
{
	public static void main(String[] args)
	{

	 Scanner input = new Scanner(System.in);
	 int numberOfGuests;
	 final int pricePerGuest = 35;
	 int totalPrice;// = numberOfGuests * pricePerGuest;
	 boolean isLargeEvent = false;

	 System.out.println("****************************************************************");
	 System.out.println("*                                                              *");
	 System.out.println("*       Carly's makes the food that makes it a party.          *");
	 System.out.println("*                                                              *");
 	 System.out.println("****************************************************************");
	 
 	 input.nextLine();

 	 System.out.print("Enter the number of guests that will attend >> ");
 	 numberOfGuests = input.nextInt(); input.nextLine();
 	 totalPrice = numberOfGuests * pricePerGuest;
 	 System.out.println(numberOfGuests);
 	 System.out.println(pricePerGuest);
 	 System.out.println(totalPrice);
 	 System.out.println(isLargeEvent);



	}


}	