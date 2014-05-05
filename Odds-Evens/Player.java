//******************************
//	models a Player
//
//
//******************************


import java.util.Scanner;

public class Player
	
{
	private boolean isHuman;
	private int sum;
	private double ThresholdVar;
	private Scanner input;

	public Player(int human)
	{
	if (human>0)
	isHuman=true;
	else
	isHuman=false;
	}

	public void play(double temp)	
	{
	ThresholdVar=temp;
	if(isHuman)
	  playHuman();
	else
	  playComp();
	}


// human gameplay
	public void playHuman()
	{
	input = new Scanner(System.in);
	sum=input.nextInt();
		while (sum > 2 || sum < 1) // restricts player 1's declarations
		{
		System.out.println("Decarabia can only declare 1 or 2, now choose again.");
		sum = input.nextInt();
		}
	}

// computer gameplay
	public void playComp()
	{
	double random = Math.random();
	if (random >= ThresholdVar)
	  sum = 2;
	else
	  sum = 1;
	}

// sum of the declarations
	public int getSum()
	{
	return sum;
	}

} // end class  
