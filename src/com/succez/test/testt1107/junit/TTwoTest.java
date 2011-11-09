package com.succez.test.testt1107.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.succez.test.testt1107.two.TwoClass;


public class TTwoTest {

	@Test
	public void test() {
//		fail("Not yet implemented");
		TwoClass two = new TwoClass();
		System.out.println(two.intToHex(125));
	}

}
