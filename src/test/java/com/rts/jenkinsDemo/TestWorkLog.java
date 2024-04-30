package com.rts.jenkinsDemo;

import org.junit.Test;

import junit.framework.TestCase;

public class TestWorkLog extends TestCase {

	Working w1=new Working();
	@Test
	public void testAddLog1() {
		assertEquals("Addedd Log for Jothi",w1.addToLog("Jothi"));
	}
	@Test
	public void testAddLog2() {
		assertEquals("Addedd Log for Sherin",w1.addToLog("Sherin"));
	}
	@Test
	public void testAddLogins1() {
		assertEquals("Addedd Login Log for Vino",w1.addLogins("Vino"));
	}
	@Test
	public void testAddLogins2() {
		assertEquals("Addedd Login Log for Abi",w1.addLogins("Abi"));
	}
}
