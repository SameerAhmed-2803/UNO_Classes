import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/*Tester for RelationalUtil class */
public class TestRelationalUtil
{
	/* main method: executes tests & counts number of successes*/
	public static void main(String[] args){
		int passed = 0;
		int tests = 6;
		System.out.println("\nTest: RelationalUtil");
		System.out.println("------------------------------");
		passed += testIsIncreasing();
		passed += testIsDecreasing();
		passed += testIsBetween();
		passed += testIsPositive();
		passed += testIsNegative();
		passed += testOverlaps();
		System.out.println("------------------------------");
		System.out.printf("Passed %d of %d tests\n\n",passed, tests);
	}

	@Test
	/*tester: return 1  if a success or 0 if a failure & log errors*/
	private static int testIsIncreasing(){
		String result, hint, errorLog = "";

		result = "" + RelationalUtil.isIncreasing(1,2,3);
		hint = "RelationalUtil.isIncreasing(1,2,3) -> true";
		errorLog += checkResult("true", result, hint);

		printTestResults(errorLog, "testIsIncreasing");
		return successCounter(errorLog);
	}

	@Test
	/*tester: return 1  if a success or 0 if a failure & log errors*/
	private static int testIsDecreasing(){
		String result, hint, errorLog = "";

		result = "" + RelationalUtil.isDecreasing(3,2,1);
		hint = "RelationalUtil.isDecreasing(3,2,1) -> true";
		errorLog = checkResult("true", result, hint);
		
		printTestResults(errorLog, "testIsDecreasing");
		return successCounter(errorLog);
	}

	@Test
	/*tester: return 1  if a success or 0 if a failure & log errors*/
	private static int testIsBetween(){
		String result, hint, errorLog = "";

		result = "" + RelationalUtil.isBetween(-1,0,1);
		hint = "RelationalUtil.isBetween(-1,0,1) -> true";
		errorLog += checkResult("true", result, hint);

		printTestResults(errorLog, "testIsBetween");
		return successCounter(errorLog);
	}

	@Test
	/*tester: return 1  if a success or 0 if a failure & log errors*/
	private static int testIsPositive(){
		String result, hint, errorLog = "";

		result = "" + RelationalUtil.isPositive(1);
		hint = "RelationalUtil.isPositive(1) -> true";
		errorLog += checkResult("true",result, hint);		
		
		printTestResults(errorLog, "testIsPositive");
		return successCounter(errorLog);
	}

	@Test
	/*tester: return 1  if a success or 0 if a failure & log errors*/
	private static int testIsNegative(){
		String result, hint, errorLog = "";

		result = "" + RelationalUtil.isNegative(-1);
		hint = "RelationalUtil.isNegative(-1) -> true";
		errorLog += checkResult("true", result, hint);
		
		printTestResults(errorLog, "testIsNegative");
		return successCounter(errorLog);
	}

	@Test
	/*tester: return 1  if a success or 0 if a failure & log errors*/
	private static int testOverlaps(){
		String result, hint, errorLog = "";

		result = "" + RelationalUtil.overlaps(0,1,-1,2);
		hint = "RelationalUtil.overlaps(0,1,-1,2) -> true";
		errorLog += checkResult("true", result, hint);

		result = "" + RelationalUtil.overlaps(0,1,2,3);
		hint = "RelationalUtil.overlaps(0,1,2,3) -> false";
		errorLog += checkResult("false", result, hint);
		
		printTestResults(errorLog, "testOverlaps");
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