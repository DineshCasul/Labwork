package com.capgeminilab9.all;



import static org.junit.Assert.*;

import org.junit.Test;

public class DateTest {

	@Test
	public void testGetDate() {
		System.out.println("from DateTest");   
		Date d1 = new Date(23,5,2019); 
		assertEquals("23/5/2019", d1.toString()); 
		}
	@Test (expected=IllegalArgumentException.class) 
	public void test() {   
		System.out.println("from DateTest testing exceptions");  
		Date d2 = new Date(0, 0, 0);    
		}

}
