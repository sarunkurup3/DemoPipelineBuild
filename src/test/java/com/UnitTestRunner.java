package com;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UnitTestRunner {

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before test");
	}

	@Test
	public void testMethod() {
		System.out.println("Test Method");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}
}
