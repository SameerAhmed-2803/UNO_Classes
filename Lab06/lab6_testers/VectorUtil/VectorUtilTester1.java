public class VectorUtilTester1
{
	public static void main(String[] args)
	{
		//Sample input from lab documentation
		double[] a = {1,2,3};
 		double[] b = {4,5,6};
 		double answer = VectorUtil.dotProduct(a,b);


		//Sample output from lab documentation
		System.out.println(answer);
		
		//Check to expected answer and print result
		String result =  (answer == 32.0) ? "Correct!": "Wrong!";
		System.out.println(result);
	}
}