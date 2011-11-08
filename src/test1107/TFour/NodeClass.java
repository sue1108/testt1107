package test1107.TFour;


public class NodeClass {
	
	/**
	 * 递归为二叉树设置值
	 * @param tree
	 * @return
	 */
	
	private static String treeValues[] = {"A" , "B" , "D" , "G" , "H" , "C" , "F" , "U", "#"}; 
	
	private static int index = 0;
	
	/**
	 * 递归为二叉树赋值
	 * @return
	 */
	public static TNode setTreeValue( ){
		TNode tree = new TNode();
		if( index > treeValues.length-1 || treeValues[index].equals("#")) //
			return tree;
		else{
			
			tree.setValue(treeValues[index]);
			index = index * 2 +1; //left
			tree.setLeft(setTreeValue());
			index ++;
			tree.setRight(setTreeValue());  //right
			index = index/2 - 1;
		}
		return tree;
	}

	/**
	 * 按层遍历，遍历第n层的数，放入一个数组中
	 * @param tree
	 * @param n
	 * @return
	 */
	public static String treeLevel( TNode tree , int n){
		String str = "";
		TNode nodeArr[] = new TNode[20];
		nodeArr[0] = tree;
		int i = 0;  //
		int j = 1;  //
		int len = (int)Math.pow(2, n)-1;
		while( j <=  len){
			if( nodeArr[i].getLeft() != null){
				nodeArr[j++] = nodeArr[i].getLeft();  //左
			}
			if( nodeArr[i].getRight() != null ){
				nodeArr[j++] = nodeArr[i].getRight(); //右
			}
		    i++;
		}
		StringBuffer sbf = new StringBuffer();
		for( int m = 0 ; m < len ; m++ )
		{
			sbf.append(nodeArr[m].getValue() + "-");
		}
		str = sbf.substring(0, sbf.length()-1).toString();
		return str;
	}
	
	public static void main(String args[]){
		TNode node = NodeClass.setTreeValue();
//		System.out.println(node.getValue());
		System.out.println(NodeClass.treeLevel(node, 2));
//		NodeClass.treeLevel(node, 2);
	}
}
