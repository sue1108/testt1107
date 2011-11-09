package com.succez.test.testt1107.junit;
import static org.junit.Assert.*;

import java.io.File;
//import org.slf4j.Logger;

import org.junit.Test;

import com.succez.test.testt1107.three.ThreeClass;


public class TThreeTest {

	@Test
	public void test() {
//		fail("Not yet implemented");
		File file = new File("d:\\test.txt");
		ThreeClass.file2buf(file);
//		Logger logger = 
//		if (logger.isDebugEnabled()){    logger.debug("auto add private component[{}] to component's model.", depend);}
		System.out.println("初始字符串:"+ThreeClass.getFileString(file));
		System.out.println("转换后字符串:"+ThreeClass.formatJsStr(ThreeClass.getFileString(file)));
	}

}
