package TestNGAnnotationsFull;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGClass2 extends BaseClassSuite {
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("\nTestNGClass2: Runs before every test method --> @BeforeMethod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("\nTestNGClass2: Runs after every test method --> @AfterMethod");
	}

	@Test
	public void testMethod1() {
		System.out.println("\nTestNGClass2: Running Test method 1 --> @Test");
	}

	@Test(priority=0)
	public void testMethod2() {
		System.out.println("\nTestNGClass2: Running Test method 2 --> @Test");
	}

}
