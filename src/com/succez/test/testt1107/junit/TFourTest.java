package com.succez.test.testt1107.junit;


import org.junit.Test;

import com.succez.test.testt1107.fourtree.NodeClass;
import com.succez.test.testt1107.pojo.TNode;

/**
 * 
 * <p>Copyright: Copyright (c) 2011<p>
 * <p>第四题：关于二叉树类的测试<p>
 * @author sue
 * @createdate 2011-11-10
 */
public class TFourTest {

	@Test
	public void test() {
//		fail("Not yet implemented");
		TNode node = NodeClass.setTreeValue();
		if( node != null)
		System.out.println(NodeClass.treeLevel(node,1));
	}

}
