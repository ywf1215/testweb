package com.pactera;

import junit.framework.TestCase;

public class AppTest extends TestCase {
	
	public void testAdd() {
		int c = App.add(1, 6);
		assertEquals(c, 7);
	}

}
