public class Cell
{
	private int xcoordinate;
	private int ycoordinate;

	// corresponds the row and column to x and y coordinates
	public Cell(int r, int c)
	{
		xcoordinate = r;
		ycoordinate = c;
	}
	
	public int getX()
	{
		return xcoordinate;
	}
     
	public int getY()
	{
		return ycoordinate;
	}

}