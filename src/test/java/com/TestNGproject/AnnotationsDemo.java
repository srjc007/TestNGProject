package com.TestNGproject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class AnnotationsDemo {
	
	@BeforeClass
	public void beforeClassMethod(){
		System.out.println("\nRuns once before class --> @BeforeClass");
	}
	
	@AfterClass
	public void afterClassMethod(){
		System.out.println("\nRuns once after class --> @AfterClass");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("\nRuns before every test method --> @BeforeMethod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("\nRuns after every test method --> @AfterMethod");
	}

	@Test
	public void testMethod1() {
		System.out.println("\nRunning Test method 1 --> @Test");
	}

	@Test
	public void testMethod2() {
		System.out.println("\nRunning Test method 2 --> @Test");
	}

}
