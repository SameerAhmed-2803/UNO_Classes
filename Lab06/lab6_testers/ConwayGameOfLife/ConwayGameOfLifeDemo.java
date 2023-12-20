import java.util.Scanner;

public class ConwayGameOfLifeDemo
{
	public static void main(String[] args) throws InterruptedException
	{

		boolean[][] grid = 
		{
			{false, false,  true, false, false, false, false, false, false, false},
			{false, false, false,  true, false, false, false, false, false, false},
			{false,  true,  true,  true, false, false, false, false, false, false},
			{false, false, false, false, false, false, false, false, false, false},
			{false, false, false, false, false, false, false, false, false, false},
			{false, false, false, false, false, false, false, false, false, false},
			{false, false, false, false, false, false, false, false, false, false},
			{false, false, false, false, false, false, false, false, false, false},
			{false, false, false, false, false, false, false, false, false, false}
		};

		while(true)
		{
			printGrid(grid);
			grid = ConwayGameOfLife.update(grid);
			Thread.sleep(100);
		}
	}

	public static void printGrid(boolean[][] grid)
	{
		clearScreen();
		int length = grid.length;
		int width = grid[0].length;
		for (int row=0; row<length; row++)
		{
			for(int col=0; col<width; col++)
			{
				if (grid[row][col] == true)
					System.out.print("\u001B[42m" + "  "); 	//ANSI GREEN
				else 
					System.out.print("\u001B[41m" + "  "); 	//ANSI RED
			}
			System.out.println("\u001B[0m"); 				//ANSI RESET
		}
	}

	public static void clearScreen() {    
    	System.out.print("\033[H\033[2J");  
	}	

}