// *********************************
// Piggy Bank
// written by Nina B.
//
// converts coin to total value
// *********************************

import java.util.Scanner;

public class PiggyBank
{

	public static void main (String[] args)
	{
	// make a scanner called piggy
	Scanner input = new Scanner(System.in);

	//get number of coins from the user
	System.out.println("How many (pennies) are in the piggy bank?");
	int pennies = input.nextInt();
	System.out.println("How many (nickels) are in the piggy bank?");
	int nickels = input.nextInt();
	System.out.println("How many (dimes) are in the piggy bank?");
	int dimes = input.nextInt();
	System.out.println("How many (quarters)  are in the piggy bank?");
	int quarters = input.nextInt();

	//calculate user savings
	double total = (pennies*0.01)+(nickels*0.05)+(dimes*0.1)+(quarters*0.25);
	total = Math.round(total*100);
	total = total/100;

	System.out.println("That is " + total + " dollar(s).");
	
	//comment on user savings
	if (total<10)
	{
	System.out.println("Oink!! You need to make more oinking money! This piggy is hungry for more coins!");
	}
	if (total>100)
	{
	System.out.println("Oof! This poor piggy cannot bear to hold anymore coins in his gastronomical chamber...please go to the bank and cash everything in!");
	}
	
	} // end of the main method

} // end of the class
		
