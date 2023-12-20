import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import java.util.Scanner;
import java.io.*;

public class TestASMEmulator
{
	private static PrintStream systemOut;// = System.out;
	private static ByteArrayOutputStream output;
	private static ByteArrayInputStream input;

	public static void main(String[] args)
	{
		int passes = 0;
		int count = 4;
		System.out.println("\nTest: ASMEmulator");
		System.out.println("------------------------------");
		passes += testMOV();
		passes += testADD();
		passes += testIMUL();
		passes += testCMP();
		System.out.println("------------------------------");
		System.out.printf("Passed %d of %d tests\n\n",passes, count);
		
	}

	@Test
	private static int testMOV (){
		String input, answer, result, hint, errorLog = "";
		
		input = "MOV ecx 3\n" + "MOV ebx 5\n" + "CALL PRINT eax\n";
		answer = "[eax]: 0\n";
		result = runCase(input);
		hint = (input+" -> "+answer).replace("\n","\\n");
		errorLog += checkResult(answer, result, hint);
		printTestResults(errorLog, "testMOV");
		return successCounter(errorLog);
		
	}

	@Test
	private static int testADD (){
		String input, answer, result, hint, errorLog = "";
		
		input = "ADD ecx ebx\n" + "CALL PRINT eax\n";
		answer = "[eax]: 8\n";
		result = runCase(input);
		hint = (input+" -> "+answer).replace("\n","\\n");
		errorLog += checkResult(answer, result, hint);
		printTestResults(errorLog, "testADD");
		return successCounter(errorLog);
		
	}

	@Test
	private static int testIMUL (){
		String input, answer, result, hint, errorLog = "";
		
		input = "IMUL eax 2\n" + "CALL PRINT eax\n";
		answer = "[eax]: 16\n";
		result = runCase(input);
		hint = (input+" -> "+answer).replace("\n","\\n");
		errorLog += checkResult(answer, result, hint);
		printTestResults(errorLog, "testIMUL");
		return successCounter(errorLog);
		
	}

	@Test
	private static int testCMP (){
		String input, answer, result, hint, errorLog = "";
		
		input = "CMP eax 16\n" + "CALL PRINT eax\n"; 
		answer = "[eax]: 1\n";
		result = runCase(input);
		hint = (input+" -> "+answer).replace("\n","\\n");
		errorLog += checkResult(answer, result, hint);
		printTestResults(errorLog, "testCMP");
		return successCounter(errorLog);
		
	}

	private static String runCase(String args){
		setTesterIO(args);
		ASMEmulatorRunner.main(null);
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