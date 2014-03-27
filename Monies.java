
// *********************************
// Programming Homework 1.
// 2. Monies
// written by Nina B.
//
// prints the message converts double value fewest number of bills and coins
// *********************************

import java.util.Scanner;

public class Monies
{
	
	public static void main(String[] args)
	{
	// make a scanner called monies
	Scanner input = new Scanner(System.in);

	double tens=0;
	double fives=0;
	double ones=0;
	double quarters=0;
	double dimes=0;
	double nickels=0;
	double pennies=0;	

	// get a number from the user
	System.out.println("So how much (money) are we talking about here?");
	double money = input.nextDouble();
	money=money+0.00001; // to account for calculation errors

	// restrict the value
	while (money > 1999)
	{
		System.out.println("The amount of money to be evaluated cannot surpass $19.99. Try another (money) value.");
		money = input.nextDouble();
	}
		
	// finding number of bills and coins	
		tens = (int)(money/10);
		money = money%10;
		fives = (int)(money/5);
		money = money%5;
		ones = (int)(money/1);
		money = money%1;
		quarters = (int)(money/0.25);
		money = money%0.25;
		dimes = (int)(money/0.1);
		money = money%-0.1;
		nickels = (int)(money/0.05);
		money = money%0.05;
		pennies = (int)(money/0.01);
	
	// show user number of bills and coins
	System.out.println("You need " + tens +  " ten dollar bill(s),");
	System.out.println(fives + " five dollar bill(s),");
	System.out.println(ones + " one dollar bill(s),");
	System.out.println(quarters + " quarter(s),");
	System.out.println(dimes + " dime(s),");
	System.out.println(nickels + " nickel(s),");
	System.out.println("and " + pennies + " pennie(s).");

	} // end of the main method


} // end of the class
