import java.util.ArrayList;

public class Board
{
	private ArrayList<Cell> originalBoard; //array lists
	private ArrayList<Cell> newBoard;
	private int[][] board; // 2d array
	private int[][] nCells; //array of individual cell and neighboring cells
	private int deltaX; // the width and height of the board (w/o bordering cells)
	private int deltaY;
	
	// using the positions determined by the user for live cells to create an
	// array list for initial board with the appropriate number of cells
	// (this was hard to do!)
	public Board(ArrayList<Cell> startBoard)
	{	
		originalBoard = startBoard;
		
		Cell a = originalBoard.get(0);
		int maxX = a.getX();
		for (int i =1; i < originalBoard.size(); i++)
		{
			Cell b = originalBoard.get(i);
			if (b.getX() > maxX)
				maxX = b.getX();
		}
		
		a = originalBoard.get(0);
		int maxY = a.getY();
		for (int i =1; i < originalBoard.size(); i++)
		{
			Cell b = originalBoard.get(i);
			if (b.getY() > maxY)
				maxY = b.getY();
		}
		
		a = originalBoard.get(0);
		int minX = a.getX();
		for (int i =1; i < originalBoard.size(); i++)
		{
			Cell b = originalBoard.get(i);
			if (b.getX() < minX)
				minX = b.getX();
		}
        
		a = originalBoard.get(0);
		int minY = a.getY();
		for (int i =1; i < originalBoard.size(); i++)
		{
			Cell b = originalBoard.get(i);
			if (b.getY() < minY)
				minY = b.getY();
		}
	
		deltaX = maxX - minX + 1; //starts from board[0][0], not 1
		deltaY = maxY - minY + 1;
        board = new int[deltaX+4][deltaY+4]; //counting the padding of the cells
		// default values of board[i][j]=0
        // determining the live cells and giving them values of 1
        for (Cell e : originalBoard)
		{
			int x = e.getX();
			int y = e.getY();
			board[x][y]= 1;
		}
      }

	// making array list into array (so we can compare neighbors based on coordinates)
	public int[][] listToArray()
	{
		board = new int[deltaX+4][deltaY+4];
                
		for (Cell e : originalBoard)
		{
			int x = e.getX();
			int y = e.getY();
			board[x][y]= 1;
		}
		return board;
	}

	// creating a new board based on all 8 neighboring cells
	public void countNCells()
	{
		nCells = new int[board.length][board[0].length];
		for (int i = 1; i < board.length - 1; i++)
			for (int j = 1; j < board[0].length - 1; j++)
			{
				nCells [i][j] = board[i-1][j+1] + board[i][j+1] +
				board[i+1][j+1] + board[i-1][j] + board[i+1][j] + board[i-1][j-1] +
				board[i][j-1] + board[i+1][j-1];
			}
	}
	
	//implementing the rules of the Game of Life to make new board!
	public void newBoard()
	{
		for (int i = 0; i < nCells.length; i++)
			for (int j = 0; j < nCells[0].length; j++)
			{
				if (nCells[i][j]<=1 || nCells[i][j]>=4) // death from loneliness or overcrowding
					board[i][j]=0;
				if (nCells[i][j]==3) // survival and birth (for 2 there is no change either way)
					board[i][j]=1;
			}
	}

	// making array back into array list and returning the new board
	public ArrayList<Cell> arrayToList()
	{
		newBoard = new ArrayList<Cell>();
		for (int i = 0; i < board.length; i++)
			for (int j = 0; j < board[0].length; j++)
			{
				if (board [i][j] == 1)
					newBoard.add(new Cell(i,j));
			}
		return newBoard;
	}
	
	//return the new board as 2d array
	public int[][] getBoard()
	{
		return board;
	}
	

	
 }
