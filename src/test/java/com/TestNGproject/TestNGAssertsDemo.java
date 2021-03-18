package com.TestNGproject;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


import TestNGAnnotationsFull.BaseClassSuite;

public class TestNGAssertsDemo extends BaseClassSuite {
	
  @Test(priority=2)
  public void testMethod1() {
	  System.out.println("\nTestNGAssertsDemo: Test Method 1");
	  CalculatorClass cal = new CalculatorClass();
	  int sum = cal.add(1 , 2);
	  Assert.assertEquals(sum, 3); //If an Assert is failed, it'll fail the entire test
	  //and skip the next line
	  System.out.println("\nTestNGAssertsDemo: The sum is: " +sum);
  }
  
  @Test(priority=1)
  public void testMethod2() {
	  System.out.println("\nTestNGAssertsDemo: Test Method 2");
	  
	  SoftAssert sa = new SoftAssert();
	  
	  CalculatorClass cal = new CalculatorClass();
	  int prod1 = cal.multiply(2 , 2);
	  sa.assertEquals(prod1, 3);
	  System.out.println("\nTestNGAssertsDemo: The product is: " + prod1);
	  
	  int prod2 = cal.multiply(2 , 2);
	  sa.assertEquals(prod2, 4);
	  System.out.println("\nTestNGAssertsDemo: The product is: " + prod2);
	  sa.assertAll(); //If there is any failures in softAsserts, this method will fail the test.
	  //Otherwise the test will be passed.
	  
  }
  
  @Test(priority=0)
  public void testMethod3() {
	  System.out.println("\nTestNGAssertsDemo: Test Method 3");
  }
}
