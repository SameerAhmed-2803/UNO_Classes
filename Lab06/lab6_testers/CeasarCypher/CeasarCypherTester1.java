public class CeasarCypherTester1
{
	public static void main(String[] args)
	{
		//Sample input from lab documentation
		String message = "Hello World";
		String encrypted = CeasarCypher.encrypt(message, 13);
		String decrypted = CeasarCypher.decrypt(encrypted, 13);

		//Sample output from lab documentation
		System.out.println(encrypted);
		System.out.println(decrypted);
		
		//Check to expected answer and print result
		String result =  encrypted.equals("Uryy|-d|\177yq") && decrypted.equals("Hello World") ? "Correct!": "Wrong!";
		System.out.println(result);
	}
}