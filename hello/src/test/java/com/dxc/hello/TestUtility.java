package com.dxc.hello;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestUtility {
	   Utility u = null;

	@Before
	public void setUp() 
	{
		u= new Utility();
	}

	@After
	public void tearDown() 
	{
		u = null;
	}

	@Test
	public void testPower()
	{
		assertEquals(125,u.power(5,3));
	}

}
