import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/*Tester for DateUtil class */
public class TestDateUtil
{
	/* main method: executes tests & counts number of successes*/
	public static void main(String[] args){
		int passed = 0;
		int tests = 4;
		System.out.println("\nTest: DateUtil");
		System.out.println("------------------------------");
		passed += testFormatWith3xInt();
		passed += testFormatWith1xStringAnd1xInt();
		passed += testFormatWith1xStringAnd2xInt();
		passed += testFormatWith3xString();
		System.out.println("------------------------------");
		System.out.printf("Passed %d of %d tests\n\n",passed, tests);
	}

	@Test
	/*tester: return 1  if a success or 0 if a failure & log errors*/
	private static int testFormatWith3xInt(){
		String result, hint, errorLog = "";

		result = DateUtil.format(1,1,2000);
		hint = "DateUtil.format(1,1,2000) -> \"01/01/2000\"";
		errorLog += checkResult("01/01/2000", result, hint);

		printTestResults(errorLog, "testFormatWith3xInt");
		return successCounter(errorLog);
	}

	@Test
	/*tester: return 1 if a success or 0 if a failure & log errors*/
	private static int testFormatWith1xStringAnd1xInt(){
		String result, hint, errorLog = "";

		result = DateUtil.format("Sept 30", 1999);
		hint = "DateUtil.format(\"Sept 30\", 1999) -> \"Sept 30, 1999\"";
		errorLog = checkResult("Sept 30, 1999", result, hint);
		
		printTestResults(errorLog, "testFormatWith1xStringAnd1xInt");
		return successCounter(errorLog);
	}

	@Test
	/*tester: return 1 if a success or 0 if a failure & log errors*/
	private static int testFormatWith1xStringAnd2xInt(){
		String result, hint, errorLog = "";

		result = DateUtil.format("October", 31, 2018);
		hint = "DateUtil.format(\"October\", 31, 2018) -> \"October 31, 2018\"";
		errorLog += checkResult("October 31, 2018", result, hint);

		printTestResults(errorLog, "testFormatWith1xStringAnd2xInt");
		return successCounter(errorLog);
	}

	@Test
	/*tester: return 1 if a success or 0 if a failure & log errors*/
	private static int testFormatWith3xString(){
		String result, hint, errorLog = "";

		result = DateUtil.format("Oct", "31st", "twenty-18");
		hint = "DateUtil.format(\"Oct\", \"31st\", \"twenty-18\") -> \"Oct 31st, twenty-18\"";
		errorLog += checkResult("Oct 31st, twenty-18",result, hint);		
		
		printTestResults(errorLog, "testFormatWith3xString");
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
