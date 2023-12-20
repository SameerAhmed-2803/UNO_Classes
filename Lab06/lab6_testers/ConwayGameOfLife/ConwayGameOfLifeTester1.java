import java.util.Arrays;

public class ConwayGameOfLifeTester1
{
	public static void main(String[] args)
	{

		//Sample input from lab documentation
		 boolean[][] grid = 
		 {
		   { true, false, false},
		   {false,  true, true },
		   {false,  true, true }
		 };

		grid = ConwayGameOfLife.update(grid);

		//Sample output from lab documentation
		String gridString = Arrays.deepToString(grid);
		System.out.println(gridString);

		//Check to expected answer and print result
		String result =  gridString.equals("[[false, false, false], [false, false, false], [false, false, false]]") ? "Correct!": "Wrong!";
		System.out.println(result);
	}
}