import java.util.ArrayList;
import java.util.Scanner;

public class GameOfLife
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);		
		
		ArrayList<Cell> startboard = new ArrayList<Cell>();
						
				System.out.println("Welcome to The Game of Life!");
				System.out.println("In this game, X represents live cells, O represents dead ones.");
				System.out.println("Note: The board will be surrounded by a ring of dead cells.");
				
				System.out.print("How many rows shall your starting board have? ");
				int rows = scan.nextInt();
				System.out.print("How many columns shall your starting board have? ");
				int columns = scan.nextInt();
                
                System.out.println("Please enter the positions of the live cells in the starting board...");
                
                boolean done = false;
                while (!done)
                {
                	int r;
                	int c;

                	System.out.print("Row for live cell (-1 to display board): ");
        			r = scan.nextInt();
        			
                		while (r > rows || r < -1)
                		{
                			System.out.print("That's outside of the starting board. Enter row again: ");
                			r = scan.nextInt();
                		}
                	
                	if (r==-1) done = true;
                	
                    else
                    {
                    	
                    	System.out.print("Column for live cell: ");
            			c = scan.nextInt();
                    
                    	while (c > columns || c < -1)
                    	{
                    		System.out.println("That's outside of the starting board. Enter column again: ");
                    		c = scan.nextInt();
                    	}
                    
                    
                    	Cell newcell = new Cell(r, c);
                        startboard.add(newcell);
                    
                    }
                
                }
              
                int generation = 0;
                Game newgame = new Game(startboard, generation);
                newgame.run();
                System.out.println(newgame.toString());
                
                System.out.print("This is your starting board. After how many generations later would you like to view it again? ");
               
                generation = scan.nextInt();
               
		 while (generation < 1)
                {
                	System.out.print("That value is too small. After how many generations later would you like to view the board again? ");
                	generation = scan.nextInt();
                }
                
		for (int i = 0; i < generation; i++)
		{
                newgame = new Game(startboard, generation);
                newgame.run();
                }

                System.out.println(newgame.toString());
                System.out.println("This is the board after " + generation + " generations.");
                
        }
}
