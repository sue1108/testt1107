package com.succez.test.testt1107.junit;
import static org.junit.Assert.*;

import java.io.File;
//import org.slf4j.Logger;

import org.junit.Test;

import com.succez.test.testt1107.three.ThreeClass;

/**
 * 
 * <p>Copyright: Copyright (c) 2011<p>
 * <p>第三题的测试类<p>
 * @author sue
 * @createdate 2011-11-10
 */
public class TThreeTest {

	@Test
	public void test() {
//		fail("Not yet implemented");
		File file = new File("d:\\test.txt");
		byte bt[] = ThreeClass.file2buf(file);  //将文件内容转换为字节数组
//		Logger logger = 
//		if (logger.isDebugEnabled()){    logger.debug("auto add private component[{}] to component's model.", depend);}
		System.out.println("初始字符串:"+ThreeClass.getFileString(file));
		System.out.println("转换后字符串:"+ThreeClass.formatJsStr(ThreeClass.getFileString(file)));
	}

}
