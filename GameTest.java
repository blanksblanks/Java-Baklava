//******************************
//	Test class for Game
//
//
//******************************


import java.util.Scanner;

public class GameTest
{

	public static void main(String[] args)

	{
	System.out.println("");
	System.out.println("Abandon all hope, ye who enter here.");
	System.out.println("");
	System.out.println("There are two bored demons playing a game. Player 1 is called Decarabia, Player 2 is called Beelzebub.");
	System.out.println("");
	System.out.println("THE RULES OF THE GAME:");
	System.out.println("1. Each round, both players shall simultaneously declare the number 1 or 2.");
	System.out.println("2. If the sum is odd, Decarabia wins. If the sum is even, Beelzebub wins.");
	System.out.println("3. The loser pays the winner the sum in dollars.");
	System.out.println("");

	Game g = new Game();
	
	// Quitting option
	Scanner input = new Scanner(System.in);
	int playon = 1;
	while (playon == 1)
	{
	g.play();
	System.out.println("");
	System.out.println("Play on? (1 to keep going, 0 to run away)");
	playon = input.nextInt();
	while (playon > 1 || playon < 0) // restricts player 1's wrong decisions
		{
		System.out.println("There is no option besides playing or escape, now choose either 1 or 0.");
		playon = input.nextInt();
		}
	}

	System.out.println("");	
	System.out.println("Never trust a demon to pay up. Decarabia and Beelzebub furiously part ways in a torrent of black blood.");

	} // end main

} // end class  

