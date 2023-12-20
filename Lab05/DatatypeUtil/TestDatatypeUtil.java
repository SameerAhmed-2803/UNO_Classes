import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/*Tester for DatatypeUtil class */
public class TestDatatypeUtil
{
	/* main method: executes tests & counts number of successes*/
	public static void main(String[] args){
		int passed = 0;
		int tests = 7;
		System.out.println("\nTest: DatatypeUtil");
		System.out.println("------------------------------");
		passed += testGetTypeWithDouble();
		passed += testGetTypeWithFloat();
		passed += testGetTypeWithInt();
		passed += testGetTypeWithLong();
		passed += testGetTypeWithChar();
		passed += testGetTypeWithBoolean();
		passed += testGetTypeWithString();
		System.out.println("------------------------------");
		System.out.printf("Passed %d of %d tests\n\n",passed, tests);
	}

	@Test
	/*tester: return 1  if a success or 0 if a failure & log errors*/
	private static int testGetTypeWithDouble(){
		String result, hint, errorLog = "";

		result = DatatypeUtil.getType(1.0);
		hint = "DatatypeUtil.getType(1.0) -> \"double\"";
		errorLog += checkResult("double", result, hint);

		printTestResults(errorLog, "testGetTypeWithDouble");
		return successCounter(errorLog);
	}

	@Test
	/*tester: return 1 if a success or 0 if a failure & log errors*/
	private static int testGetTypeWithFloat(){
		String result, hint, errorLog = "";

		result = DatatypeUtil.getType(1.0f);
		hint = "DatatypeUtil.getType(1.0f) -> \"float\"";
		errorLog = checkResult("float", result, hint);
		
		printTestResults(errorLog, "testGetTypeWithFloat");
		return successCounter(errorLog);
	}

	@Test
	/*tester: return 1 if a success or 0 if a failure & log errors*/
	private static int testGetTypeWithInt(){
		String result, hint, errorLog = "";

		result = DatatypeUtil.getType(1);
		hint = "DatatypeUtil.getType(1) -> \"int\"";
		errorLog += checkResult("int", result, hint);

		printTestResults(errorLog, "testGetTypeWithInt");
		return successCounter(errorLog);
	}

	@Test
	/*tester: return 1 if a success or 0 if a failure & log errors*/
	private static int testGetTypeWithLong(){
		String result, hint, errorLog = "";

		result = DatatypeUtil.getType(1L);
		hint = "DatatypeUtil.getType(1L) -> \"long\"";
		errorLog += checkResult("long", result, hint);		
		
		printTestResults(errorLog, "testGetTypeWithLong");
		return successCounter(errorLog);
	}

	@Test
	/*tester: return 1  if a success or 0 if a failure & log errors*/
	private static int testGetTypeWithChar(){
		String result, hint, errorLog = "";

		result = DatatypeUtil.getType('1');
		hint = "DatatypeUtil.getType('1') -> \"char\"";
		errorLog += checkResult("char", result, hint);
		
		printTestResults(errorLog, "testGetTypeWithChar");
		return successCounter(errorLog);
	}

	@Test
	/*tester: return 1  if a success or 0 if a failure & log errors*/
	private static int testGetTypeWithBoolean(){
		String result, hint, errorLog = "";

		result = DatatypeUtil.getType(true);
		hint = "DatatypeUtil.getType(true) -> \"boolean\"";
		errorLog += checkResult("boolean", result, hint);
		
		printTestResults(errorLog, "testGetTypeWithBoolean");
		return successCounter(errorLog);
	}

	@Test
	/*tester: return 1  if a success or 0 if a failure & log errors*/
	private static int testGetTypeWithString(){
		String result, hint, errorLog = "";

		result = DatatypeUtil.getType("Hello");
		hint = "DatatypeUtil.getType(\"Hello\") -> \"String\"";
		errorLog += checkResult("String", result, hint);
		
		printTestResults(errorLog, "testGetTypeWithString");
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