package test1107.junittest;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

import test1107.TThree.ThreeClass;

public class TThreeTest {

	@Test
	public void test() {
//		fail("Not yet implemented");
		File file = new File("D:\\test.txt");
		ThreeClass.file2buf(file);

		System.out.println("初始字符串:"+ThreeClass.getFileString(file));
		System.out.println("转换后字符串:"+ThreeClass.formatJsStr(ThreeClass.getFileString(file)));
	}

}
