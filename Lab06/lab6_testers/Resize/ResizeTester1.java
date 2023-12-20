import java.util.Arrays;

public class ResizeTester1
{
	public static void main(String[] args)
	{
		//Sample input from lab documentation
		String[] arr = {"a","b","c"};
		arr = ArrayUtil.resize(arr);

		//Sample output from lab documentation
		String arrString = Arrays.toString(arr);
		System.out.println(arrString);

		//Check to expected answer and print result
		String result =  arrString.equals("[a, b, c, null, null, null]") ? "Correct!": "Wrong!";
		System.out.println(result);

	}
}