package org.lua.demo.test;

import junit.framework.TestCase;

import org.lua.HelloWorld;

public class TestCases extends TestCase {    
	protected void setUp() throws Exception {
		super.setUp();
		System.loadLibrary("lua");
	}

	public void testHelloWorld() throws Exception {
		HelloWorld hw = new HelloWorld();
		
		/* Allocate the interpreter. */
		long L = hw.newInterp();
		
		/* Subsequent call to retrieve the value. */
		String str = hw.getWorld(L);
		
		/* Validate that it is the value expected. */
		assertTrue(str.contentEquals("Hello from JNI!"));
	}
}
