package test1107.junittest;

import static org.junit.Assert.*;

import org.junit.Test;

import test1107.ttwo.TwoClass;

public class TTwoTest {

	@Test
	public void test() {
//		fail("Not yet implemented");
		TwoClass two = new TwoClass();
		System.out.println(two.intToHex(125));
	}

}
