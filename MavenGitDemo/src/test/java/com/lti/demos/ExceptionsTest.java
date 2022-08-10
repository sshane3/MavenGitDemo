package com.lti.demos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ExceptionsTest {

	public void testExceptions() {
		Assertions.assertThrows(IllegalArgumentException.class,
				()->{Integer.parseInt("one");}  );
	}
	@Test
	public void testmethodExc()
	{
		Calculator c=new Calculator();
		final Exception e=assertThrows(ArithmeticException.class,
				()->{c.searchEmp(0);});
		
		Assertions.assertEquals("u entered zero",e.getMessage());
	}
}
