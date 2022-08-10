package com.lti.demos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class TestBeforeAfter {
	
	Calculator c = new Calculator();
	
	@BeforeAll //runs only once before all test case
	public static void testDBConnection() {
		System.out.println("Database Connected");
	}
	
	
	
	@BeforeEach  //before each test case
	public void testStartup() {
		int sum = 0;
		System.out.println("Sum is zero");
	}
	
	@Test
	public void testAddNo() {
		int result = c.addNos(100, 200);
		Assertions.assertEquals(300, result, "Error in 'Add' code");
	}
	
	
	@Test
	public void testSubNo() {
		int result = c.subNos(500, 500);
		Assertions.assertEquals(0, result, "Error in 'Subtract' code"); //" " is optional, man marzi
	}
	
	@AfterEach
	public void testShutDown() {
		System.out.println("test done");
	}
	
	@AfterAll
	public static void testS() {
		System.out.println("Database Disconnected");
	}

}