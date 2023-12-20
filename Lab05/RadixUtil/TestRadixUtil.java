import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/*Tester for RadixUtil class */
public class TestRadixUtil
{
	/* main method: executes tests & counts number of successes*/
	public static void main(String[] args){
		int passed = 0;
		int tests = 6;
		System.out.println("\nTest: RadixUtil");
		System.out.println("------------------------------");
		passed += testBase2WithString();
		passed += testBase2WithInt();
		passed += testBase8WithString();
		passed += testBase8WithInt();
		passed += testBase16WithString();
		passed += testBase16WithInt();
		System.out.println("------------------------------");
		System.out.printf("Passed %d of %d tests\n\n",passed, tests);
	}

	@Test
	/*tester: return 1  if a success or 0 if a failure & log errors*/
	private static int testBase2WithString(){
		String result, hint, errorLog = "";

		result = "" + RadixUtil.base2("111");
		hint = "RadixUtil.base2(\"111\"); -> 7";
		errorLog += checkResult("7", result, hint);

		printTestResults(errorLog, "testBase2WithString");
		return successCounter(errorLog);
	}

	@Test
	/*tester: return 1 if a success or 0 if a failure & log errors*/
	private static int testBase2WithInt(){
		String result, hint, errorLog = "";

		result = "" + RadixUtil.base2(7);
		hint = "RadixUtil.base2(7) -> \"111\"";
		errorLog = checkResult("111", result, hint);
		
		printTestResults(errorLog, "testBase2WithInt");
		return successCounter(errorLog);
	}

	@Test
	/*tester: return 1 if a success or 0 if a failure & log errors*/
	private static int testBase8WithString(){
		String result, hint, errorLog = "";

		result = "" + RadixUtil.base8("10");
		hint = "RadixUtil.base8(\"10\") -> 8";
		errorLog += checkResult("8", result, hint);

		printTestResults(errorLog, "testBase8WithString");
		return successCounter(errorLog);
	}

	@Test
	/*tester: return 1 if a success or 0 if a failure & log errors*/
	private static int testBase8WithInt(){
		String result, hint, errorLog = "";

		result = "" + RadixUtil.base8(8);
		hint = "RadixUtil.base8(8) -> \"10\"";
		errorLog += checkResult("10",result, hint);		
		
		printTestResults(errorLog, "testBase8WithInt");
		return successCounter(errorLog);
	}

	@Test
	/*tester: return 1  if a success or 0 if a failure & log errors*/
	private static int testBase16WithString(){
		String result, hint, errorLog = "";

		result = "" + RadixUtil.base16("f");
		hint = "RadixUtil.base16(\"f\")-> 15";
		errorLog += checkResult("15", result, hint);
		
		printTestResults(errorLog, "testBase16WithString");
		return successCounter(errorLog);
	}

	@Test
	/*tester: return 1  if a success or 0 if a failure & log errors*/
	private static int testBase16WithInt(){
		String result, hint, errorLog = "";

		result = "" + RadixUtil.base16(15);
		hint = "RadixUtil.base16(15)-> \"f\"";
		errorLog += checkResult("f", result, hint);
		
		printTestResults(errorLog, "testBase16WithInt");
		return successCounter(errorLog);
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