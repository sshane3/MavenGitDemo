package com.lti.demos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTests {
	Calculator c=new Calculator();
	
	@Test
	public void testSayHello() {
	String msg=c.sayHello();
	Assertions.assertEquals("Hello LTI",msg);
}
	
	@Test
	public void testAddNos() {
		int result=c.addNos(200,300);
		Assertions.assertEquals(500, result);
		
	}
}
