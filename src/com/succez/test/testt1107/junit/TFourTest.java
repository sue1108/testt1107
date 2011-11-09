package com.succez.test.testt1107.junit;


import org.junit.Test;

import com.succez.test.testt1107.fourtree.NodeClass;
import com.succez.test.testt1107.pojo.TNode;


public class TFourTest {

	@Test
	public void test() {
//		fail("Not yet implemented");
		TNode node = NodeClass.setTreeValue();
		if( node != null)
		System.out.println(NodeClass.treeLevel(node,10));
	}

}
