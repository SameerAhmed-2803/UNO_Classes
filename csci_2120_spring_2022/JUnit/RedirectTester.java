import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
// JUNit 5 imports
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class RedirectTester {

	private ByteArrayOutputStream output = new ByteArrayOutputStream();
	private ByteArrayOutputStream errorOutput = new ByteArrayOutputStream();

    private String lineseparator = System.getProperty("line.separator");
     
    @BeforeEach
	public void setup() {
		System.setOut(new PrintStream(output));
		System.setErr(new PrintStream(errorOutput));
	} // end @Before method

	@Test
	public void testStdOut() {
		System.out.println("hello");
		assertEquals("hello" + lineseparator, output.toString());
	}

	@Test
	public void testStdErr() {
		System.err.println("good bye");
		assertEquals("good bye" + lineseparator, errorOutput.toString());
	}


	@AfterEach
	public void resetStreams() {
		System.setOut(System.out);
		System.setErr(System.err);
	} // end @After method

} // end class RedirectTester

