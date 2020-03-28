package com.epaam.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DeleteAinFirsttwoPlacesTest {
	/*TODO List for my feature
	 * 1.1A 4 char :ABCD=>BCD
	 * 2.2A 4 char :AACD=>CD
	 * 3.2nd A 4 char:BACD=>BCD
	 * 4.0A 4 char:BBAA=>BBAA
	 * 5.2A n char :AABAA=>BAA
	 */
	DeleteAinFirsttwoPlaces Del1stA;
	@BeforeEach
	void setUp()
	{
		Del1stA=new DeleteAinFirsttwoPlaces();
	}
	
	
	@Test
	void Test1stChar() {
	assertEquals("BCD",Del1stA.Delete("ABCD"));
	}
	
	@Test
	void Test1st2Char() {
	assertEquals("CD",Del1stA.Delete("AACD"));
	}
	
	@Test
	void Test2ndChar() {
	assertEquals("BCD",Del1stA.Delete("BACD"));
	}
	
	@Test
	void Test4Char() {
		assertEquals("BBAA",Del1stA.Delete("BBAA"));
	}
	
	
	@Test
	void TestnChar() {
	assertEquals("BAA",Del1stA.Delete("AABAA"));
	}
}
