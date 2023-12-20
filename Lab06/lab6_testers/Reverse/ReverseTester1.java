import java.util.Arrays;

public class ReverseTester1
{
	public static void main(String[] args)
	{
		//Sample input from lab documentation
		String[] arr = {"a","b","c","d","e"};
		ArrayUtil.reverse(arr);

		//Sample output from lab documentation
		String arrString = Arrays.toString(arr);
		System.out.println(arrString);

		//Check to expected answer and print result
		String result =  arrString.equals("[e, d, c, b, a]") ? "Correct!": "Wrong!";
		System.out.println(result);

	}
}