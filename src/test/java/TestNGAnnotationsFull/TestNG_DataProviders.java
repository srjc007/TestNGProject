package TestNGAnnotationsFull;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG_DataProviders {
	
	@DataProvider(name="inputs")
	public Object[][] getData(){
		return new Object[][]{
				{"bmw", "x3"},
				{"benz", "sclass"}
		};
	}

	@Test(dataProvider="inputs")
	public void testMethod(String input1, String input2) {
		System.out.println("\nInput 1: " + input1);
		System.out.println("\nInput 2: " + input2 + "\n");
	}
}
