import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import java.util.Scanner;
import java.io.*;

public class TestFlipIt
{
	//private static PrintStream systemOut = System.out;
	private static PrintStream systemOut;
	private static ByteArrayOutputStream output;
	private static ByteArrayInputStream input;

	public static void main(String[] args)
	{
		int passes = 0;
		int count = 3;
		System.out.println("\nTest: FlipIt");
		System.out.println("------------------------------");
		passes += testCase1();
		passes += testCase2();
		passes += testCase3();
		System.out.println("------------------------------");
		System.out.printf("Passed %d of %d tests\n\n",passes, count);
		
	}

	@Test
	private static int testCase1 (){
		String answer, result, hint, errorLog = "";
		
		answer = "dlroW olleH\n";
		result = runCase("1\nHello World");
		hint = "1\\nHello World" + " -> " + "dlroW olleH\\n";
		errorLog += checkResult(answer, result, hint);
		printTestResults(errorLog, "testCase1");
		return successCounter(errorLog);
		
	}

	@Test
	private static int testCase2 (){
		String answer, result, hint, errorLog = "";
		
		answer = "54321\n";
		result = runCase("1\n12345");
		hint = "1\\n12345" + " -> " + "54321\\n";
		errorLog += checkResult(answer, result, hint);
		printTestResults(errorLog, "testCase2");
		return successCounter(errorLog);
		
	}

	@Test
	private static int testCase3 (){
		String answer, result, hint, errorLog = "";
		
		answer = "siht daer nac I\n";
		result = runCase("1\nI can read this");
		hint = "1\\nI can read this" + " -> " + "siht daer nac I\\n";
		errorLog += checkResult(answer, result, hint);
		printTestResults(errorLog, "testCase3");
		return successCounter(errorLog);
		
	}

	private static String runCase(String args){
		setTesterIO(args);
		FlipIt.main(null);
		String results = getTesterIO();
		return results;
	}

	private static void setTesterIO(String args){
		systemOut = System.out;
		output = new ByteArrayOutputStream();
		System.setOut(new PrintStream(output));
		input = new ByteArrayInputStream( args.getBytes() );
		System.setIn(input);
	}

	private static String getTesterIO(){
		System.setOut(systemOut);
		return output.toString();
	}

	/*helper: prints results for a tester*/
	private static void printTestResults(String error, String test){
		if ( error.equals("") ){
			System.out.println("[PASS]: " + test);
		}
		else{
			error = "[FAIL]: " + test + "\n" + error;
			System.out.println(error);
		}
	}

	/*helper: returns 1 if errorLog is empty otherwise return 0 */
	private static int successCounter(String error){
		return error.equals("") ? 1 : 0;
	}

	/*helper: checks that result matches expected value and return error log*/
	private static String checkResult(String expected, String result, String hint){
		return expected.equals(result) ? "" : String.format("\t[Expected] %s",hint);
	}

}

@Retention(RetentionPolicy.RUNTIME)
@interface Test{}