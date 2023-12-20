import java.util.Arrays;

public class AddTester1
{
	public static void main(String[] args)
	{
		//Sample input from lab documentation
		String[] arr = {"a","b","c"};
		arr = ArrayUtil.add("d", arr);

		//Sample output from lab documentation
		String arrString = Arrays.toString(arr);
		System.out.println(arrString);

		//Check to expected answer and print result
		String result =  arrString.equals("[a, b, c, d, null, null]") ? "Correct!": "Wrong!";
		System.out.println(result);

	}
}