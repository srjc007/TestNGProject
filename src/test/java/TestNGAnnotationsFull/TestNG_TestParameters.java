package TestNGAnnotationsFull;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class TestNG_TestParameters {

	@BeforeClass
	@Parameters({ "browser", "platform" })
	public void beforeClass(String browser, String platform) {
		System.out.println("\nTestNG_TestParameters: Before class");
		System.out.println("\nThe browser working on: " + browser);
		System.out.println("\nThe platform working on: " + platform);
	}

	@Test
	@Parameters({ "response" })
	public void testmethod(int response) {
		System.out.println("\nTestNG_TestParameters: Running test method");
		System.out.println("\nThe response is: " + response);
	}

}
