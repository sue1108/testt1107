package com.succez.test.testt1107.junit;


import java.util.ArrayList;
import java.util.List;


import com.succez.test.testt1107.onesort.SortClass;
import com.succez.test.testt1107.pojo.AClass;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * <p>Copyright: Copyright (c) 2011<p>
 * <p>第一道题：对列表进行排序的测试类<p>
 * @author sue
 * @createdate 2011-11-10
 */
public class TOneTest {

	@Test
	public void test() {
//		fail("Not yet implemented");
		List<AClass> aList = new ArrayList<AClass>();
    	aList = new SortClass().getListValues(aList ,5);
    	Logger logger = LoggerFactory.getLogger(TOneTest.class);
//    	if (logger.isDebugEnabled()){
//    		logger.debug("auto add private component[{}] to component's model.", 1);
//    		}
    			
//    	System.out.println("v1-v2");
    	logger.info("v1-v2");
    	for (AClass class1 : aList) {
			System.out.println(class1.getV1() + "-" + class1.getV2());
//    		logger.info("{}-{}" ,class1.getV1() , class1.getV2());
		}
    	System.out.println("\nv1-v2");
    	aList = new SortClass().sort(aList);
    	for (AClass class1 : aList) {
			System.out.println(class1.getV1() + "-" + class1.getV2());
//			logger.info("{}-{}" ,class1.getV1() , class1.getV2());
    	}
	}

}
