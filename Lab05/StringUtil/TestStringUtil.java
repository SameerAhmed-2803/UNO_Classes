import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/*Tester for StringUtil class */
public class TestStringUtil
{
	/* main method: executes tests & counts number of successes*/
	public static void main(String[] args)
	{
		int passed = 0;
		int tests = 6;
		System.out.println("\nTest: StringUtil");
		System.out.println("------------------------------");
		passed += testToStringWithDouble();
		passed += testToStringWithFloat();
		passed += testToStringWithInt();
		passed += testToStringWithLong();
		passed += testToStringWithChar();
		passed += testToStringWithBoolean();
		System.out.println("------------------------------");
		System.out.printf("Passed %d of %d tests\n\n",passed, tests);
	}

	/*tester: return 1  if a success or 0 if a failure & log errors*/
	@Test
	public static int testToStringWithDouble()
	{
		String result, hint, errorLog = "";

		result = StringUtil.toString(1.0);
		hint = "StringUtil.toString(1.0) -> \"1.0\"";
		errorLog += checkResult("1.0", result, hint);

		result = StringUtil.toString(Math.PI);
		hint = "StringUtil.toString(Math.PI) -> \"3.141592653589793\"";
		errorLog += checkResult("3.141592653589793", result, hint);

		result = StringUtil.toString(Math.E);
		hint = "StringUtil.toString(Math.E) -> \"2.718281828459045\"";
		errorLog += checkResult("2.718281828459045", result, hint);

		printTestResults(errorLog, "testToStringWithDouble");
		return successCounter(errorLog);
	}

	/*tester: return 1  if a success or 0 if a failure & log errors*/
	@Test
	public static int testToStringWithFloat(){
		String result, hint, errorLog = "";

		result = StringUtil.toString(1.0f);
		hint = "StringUtil.toString(1.0f) -> \"1.0\"";
		errorLog = checkResult("1.0", result, hint);
		
		printTestResults(errorLog, "testToStringWithFloat");
		return successCounter(errorLog);
	}

	/*tester: return 1  if a success or 0 if a failure & log errors*/
	@Test
	public static int testToStringWithInt(){
		String result, hint, errorLog = "";

		result = StringUtil.toString(1);
		hint = "StringUtil.toString(1) -> \"1\"";
		errorLog += checkResult("1", result, hint);

		printTestResults(errorLog, "testToStringWithInt");
		return successCounter(errorLog);
	}

	/*tester: return 1  if a success or 0 if a failure & log errors*/
	@Test
	public static int testToStringWithLong(){
		String result, hint, errorLog = "";

		result = StringUtil.toString(1L);
		hint = "StringUtil.toString(1L) -> \"1\"";
		errorLog += checkResult("1",result, hint);		
		
		printTestResults(errorLog, "testToStringWithLong");
		return successCounter(errorLog);
	}

	/*tester: return 1  if a success or 0 if a failure & log errors*/
	@Test
	public static int testToStringWithChar(){
		String result, hint, errorLog = "";

		result = StringUtil.toString('1');
		hint = "StringUtil.toString('1') -> \"1\"";
		errorLog += checkResult("1", result, hint);
		
		printTestResults(errorLog, "testToStringWithChar");
		return successCounter(errorLog);
	}

	/*tester: return 1  if a success or 0 if a failure & log errors*/
	@Test
	public static int testToStringWithBoolean(){
		String result, hint, errorLog = "";

		result = StringUtil.toString(true);
		hint = "StringUtil.toString(true) -> \"true\"";
		errorLog += checkResult("true", result, hint);
		
		printTestResults(errorLog, "testToStringWithBoolean");
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
		return expected.equals(result) ? "" : String.format("\t[Expected] %s", hint);
	}

}



@Retention(RetentionPolicy.RUNTIME)
@interface Test{}