package TestNGAnnotationsFull;

import org.testng.annotations.Test;

public class TestNG_Grouping extends BaseClassSuite {

	@Test(groups={"cars","hatchback"})
	public void testMethod1() {
		System.out.println("Running --> Tata Altroz");
	}

	@Test(groups={"cars","hatchback"})
	public void testMethod2() {
		System.out.println("Running --> Hyundai i20");
	}

	@Test(groups="bike")
	public void testMethod3() {
		System.out.println("Running --> Royal Enfield Classic 350");
	}

	@Test(groups={"cars","suv"})
	public void testMethod4() {
		System.out.println("Running --> MG Hector");
	}
	
	@Test(groups={"cars","suv"})
	public void testMethod5() {
		System.out.println("Running --> BMW X6");
	}
}
