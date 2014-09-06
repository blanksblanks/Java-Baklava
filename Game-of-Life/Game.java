

import java.util.ArrayList;
public class Game

{
        private int[][] newBoard;
        private Board board;
        private int generation;
        private ArrayList<Cell> startBoard;

        //game class with the user-decided array and number of generations
        public Game(ArrayList<Cell> start, int g)
        {
                startBoard = start;
                generation = g;
                board = new Board(startBoard);
                newBoard = board.listToArray();
        }

        //run the board for the given amount of generations
        public void run()
    	{
		
		for (int i = 0; i < generation; i++)
		{
                board = new Board(startBoard);
                board.countNCells();
                board.newBoard();
                newBoard = board.getBoard();
		}
        }

        public String toString()
        {
           String r = "\n";
           for (int i = 0; i < newBoard.length; i++)
           {
              r = r + "     ";
              for (int j = 0; j < newBoard[i].length; j++)
            	  if (newBoard[i][j]==1)
            		  r = r + "X ";
            	  else
            		  r = r + "O ";
              r = r + "\n";
           }
           return r;
        }

}
