import java.util.Arrays;

public class MinMaxByValueTester1
{
	public static void main(String[] args)
	{
		//Sample input from lab documentation
		int[] arr = {1,2,3,3,2,1};
 		int min = ArrayUtil.findMinValue(arr);
 		int max = ArrayUtil.findMaxValue(arr);


		//Sample output from lab documentation
		System.out.println(min);
		System.out.println(max);

		//Check to expected answer and print result
		String result =  (min==1 && max==3) ? "Correct!": "Wrong!";
		System.out.println(result);

	}
}