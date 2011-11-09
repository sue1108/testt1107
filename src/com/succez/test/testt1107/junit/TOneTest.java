package com.succez.test.testt1107.junit;


import java.util.ArrayList;
import java.util.List;


import com.succez.test.testt1107.onesort.SortClass;
import com.succez.test.testt1107.pojo.AClass;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TOneTest {

	@Test
	public void test() {
//		fail("Not yet implemented");
		List<AClass> aList = new ArrayList<AClass>();
    	aList = new SortClass().getListValues(aList ,10);
    	Logger logger = LoggerFactory.getLogger(TOneTest.class);
//    	if (logger.isDebugEnabled()){
//    		logger.debug("auto add private component[{}] to component's model.", 1);
//    		}
    			
//    	System.out.println("v1-v2");
    	logger.info("v1-v2");
    	for (AClass class1 : aList) {
//			System.out.println(class1.getV1() + "-" + class1.getV2());
    		logger.info("{}-{}" ,class1.getV1() , class1.getV2());
		}
    	System.out.println("\nv1-v2");
    	aList = new SortClass().sort(aList);
    	for (AClass class1 : aList) {
//			System.out.println(class1.getV1() + "-" + class1.getV2());
			logger.info("{}-{}" ,class1.getV1() , class1.getV2());
    	}
	}

}
