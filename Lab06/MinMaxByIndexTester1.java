import java.util.Arrays;

public class MinMaxByIndexTester1
{
	public static void main(String[] args)
	{
		//Sample input from lab documentation
		int[] arr = {1,2,3,3,2,1};
 		int[] min = ArrayUtil.findMinIndex(arr);
 		int[] max = ArrayUtil.findMaxIndex(arr);


		//Sample output from lab documentation
		String minString = Arrays.toString(min);
		String maxString = Arrays.toString(max);
		System.out.println(minString);
		System.out.println(maxString);

		//Check to expected answer and print result
		String result =  (minString.equals("[0, 5]") && maxString.equals("[2, 3]")) ? "Correct!": "Wrong!";
		System.out.println(result);

	}
}