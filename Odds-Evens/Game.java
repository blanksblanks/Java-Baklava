//******************************
//	Game class
//
//
//******************************

import java.util.Scanner;

public class Game

{
	private Player p1; // Decarabia
	private Player p2; // Beelzebub
	private int p1Total = 0; // Decarabia's money, begins with none
	private int p2Total = 0; // Beelzebub's money, begins with none
	private int sum; // sum of player declarations for each round

	public Game()
	{
	Scanner input = new Scanner (System.in);
	int p1Choice;
	System.out.println("Shall you, human, play as Decarabia? (1 to play, 0 to let computer play)");
	p1Choice = input.nextInt();
	p1 = new Player(p1Choice);
	p2 = new Player(0);
	}

	public void play()

	{

	System.out.println("");
	System.out.println("Declare either 1 or 2.");

	// setting the threshold variable for computer gameplay
	{
	double p1ThresholdVar = 0.75; // if Player 1 is computer, higher chances of declaring 1
	double p2ThresholdVar = 0.5;
	p1.play(p1ThresholdVar);
	p2.play(p2ThresholdVar);
	}
	
	sum = p1.getSum() + p2.getSum();
	System.out.println("Decarabia declares " +  p1.getSum() + " and Beelzebub declares " + p2.getSum() + ". The sum is " + sum + ".");

	// identifying winner and loser
	if(sum%2 == 1)
	{
	System.out.println("Decarabia wins $" + sum + "!");
	System.out.println("Beelzebub loses $" + sum + "!");
	p1Total = p1Total + sum;
	p2Total = p2Total - sum;
	}
	else
	{
	System.out.println("Beelzebub wins $" + sum + "!");
	System.out.println("Decarabia loses $" + sum + "!");
	p1Total = p1Total - sum;
	p2Total = p2Total + sum;
	}

	// stating money owed winner by loser
	if (p1Total > p2Total)
	{
	System.out.println("END OF ROUND: Beelzebub owes Decarabia a total of $" + p1Total + ".");
	}
	else
	{
	System.out.println("END OF ROUND: Decarabia owes Beelzebub a total of $" + p2Total + ".");
	}

	} // end of play method
   
} // end class  

