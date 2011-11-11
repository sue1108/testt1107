package com.succez.test.testt1107.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.succez.test.testt1107.two.TwoClass;

/**
 * 
 * <p>Copyright: Copyright (c) 2011<p>
 * <p>第二道题：将正整数转为对应的16进制的测试类<p>
 * @author sue
 * @createdate 2011-11-10
 */
public class TTwoTest {

	@Test
	public void test() {
//		fail("Not yet implemented");
		TwoClass two = new TwoClass();
		System.out.println(two.intToHex(125));
	}

}
