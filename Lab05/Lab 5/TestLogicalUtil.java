import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/*Tester for LogicalUtil class */
public class TestLogicalUtil
{
	/* main method: executes tests & counts number of successes*/
	public static void main(String[] args){
		int passed = 0;
		int tests = 6;
		System.out.println("\nTest: LogicalUtil");
		System.out.println("------------------------------");
		passed += testThereExists();
		passed += testForAll();
		passed += testMajority();
		passed += testMinority();
		passed += testImpliesWith2();
		passed += testImpliesWith3();
		System.out.println("------------------------------");
		System.out.printf("Passed %d of %d tests\n\n",passed, tests);
	}

	@Test
	/*tester: return 1  if a success or 0 if a failure & log errors*/
	private static int testThereExists(){
		String result, hint, errorLog = "";

		result = "" + LogicalUtil.thereExists(false, false, true);
		hint = "LogicalUtil.thereExists(false, false, true) -> true";
		errorLog += checkResult("true", result, hint);

		printTestResults(errorLog, "testThereExists");
		return successCounter(errorLog);
	}

	@Test
	/*tester: return 1 if a success or 0 if a failure & log errors*/
	private static int testForAll(){
		String result, hint, errorLog = "";

		result = "" + LogicalUtil.forAll(true, true, true);
		hint = "LogicalUtil.forAll(true, true, true) -> true";
		errorLog = checkResult("true", result, hint);
		
		printTestResults(errorLog, "testForAll");
		return successCounter(errorLog);
	}

	@Test
	/*tester: return 1 if a success or 0 if a failure & log errors*/
	private static int testMajority(){
		String result, hint, errorLog = "";

		result = "" + LogicalUtil.majority(true, true, false);
		hint = "LogicalUtil.majority(true, true, false) -> true";
		errorLog += checkResult("true", result, hint);

		printTestResults(errorLog, "testMajoirty");
		return successCounter(errorLog);
	}

	@Test
	/*tester: return 1 if a success or 0 if a failure & log errors*/
	private static int testMinority(){
		String result, hint, errorLog = "";

		result = "" + LogicalUtil.minority(false, false, false);
		hint = "LogicalUtil.minority(false, false, false) -> true";
		errorLog += checkResult("true",result, hint);		
		
		printTestResults(errorLog, "testMinority");
		return successCounter(errorLog);
	}

	@Test
	/*tester: return 1  if a success or 0 if a failure & log errors*/
	private static int testImpliesWith2(){
		String result, hint, errorLog = "";

		result = "" + LogicalUtil.implies(true, false);
		hint = "LogicalUtil.implies(true, false) -> false";
		errorLog += checkResult("false", result, hint);
		
		printTestResults(errorLog, "testImpliesWith2");
		return successCounter(errorLog);
	}

	@Test
	/*tester: return 1  if a success or 0 if a failure & log errors*/
	private static int testImpliesWith3(){
		String result, hint, errorLog = "";

		result = "" + LogicalUtil.implies(true, true, false);
		hint = "LogicalUtil.implies(true, true, false) -> false";
		errorLog += checkResult("false", result, hint);
		
		printTestResults(errorLog, "testImpliesWith3");
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