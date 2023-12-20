import java.util.Arrays;

public class ContainsTester1
{
	public static void main(String[] args)
	{
		//Sample input from lab documentation
		String[] arr = {"a","b","c"};
		boolean hasB = ArrayUtil.contains("b", arr);
		boolean hasD = ArrayUtil.contains("d", arr);

		//Sample output from lab documentation
		System.out.println(hasB);
		System.out.println(hasD);

		//Check to expected answer and print result
		String result =  (hasB && !hasD) ? "Correct!": "Wrong!";
		System.out.println(result);

	}
}