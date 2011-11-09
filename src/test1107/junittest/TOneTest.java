package test1107.junittest;


import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import test1107.tone.AClass;
import test1107.tone.SortClass;

public class TOneTest {

	@Test
	public void test() {
//		fail("Not yet implemented");
		List<AClass> aList = new ArrayList<AClass>();
    	aList = new SortClass().getListValues(aList ,10);
    	
    	System.out.println("v1-v2");
    	for (AClass class1 : aList) {
			System.out.println(class1.getV1() + "-" + class1.getV2());
		}
    	System.out.println("\nv1-v2");
    	aList = new SortClass().sort(aList);
    	for (AClass class1 : aList) {
			System.out.println(class1.getV1() + "-" + class1.getV2());
    	}
	}

}
