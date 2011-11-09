package test1107.junittest;

import static org.junit.Assert.*;

import org.junit.Test;

import test1107.TFour.NodeClass;
import test1107.TFour.TNode;

public class TFourTest {

	@Test
	public void test() {
//		fail("Not yet implemented");
		TNode node = NodeClass.setTreeValue();
		if( node != null)
		System.out.println(NodeClass.treeLevel(node,10));
	}

}
