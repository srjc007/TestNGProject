package TestNGAnnotationsFull;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClassSuite {
	
	@BeforeClass(alwaysRun=true)
	public void beforeClassMethod() {
		System.out.println("\nBaseClassSuite: Runs once before class --> @BeforeClass");
	}

	@AfterClass(alwaysRun=true)
	public void afterClassMethod() {
		System.out.println("\nBaseClassSuite: Runs once after class --> @AfterClass");
	}

	@BeforeTest(alwaysRun=true)
	public void beforeTest() {
		System.out.println("\nBaseClassSuite: Runs once before test tag --> @BeforeTest");
	}

	@AfterTest(alwaysRun=true)
	public void afterTest() {
		System.out.println("\nBaseClassSuite: Runs once after test tag --> @AfterTest");
	}

	@BeforeSuite(alwaysRun=true)
	public void beforeSuite() {
		System.out.println("\nBaseClassSuite: Runs once before test suite --> @BeforeSuite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("\nBaseClassSuite: Runs once after test suite --> @AfterSuite");
	}

}
