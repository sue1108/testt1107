package test1107.TFour;

public class NodeClass {
	
	/**
	 * 递归为二叉树设置值
	 * @param tree
	 * @return
	 */
	
	private static String treeValues[] = {"A" , "B" , "D" , "G" , "H" , "C" , "F" , "#"}; 
	
	private static int index = 0;
	
	public static TNode setTreeValue( TNode tree ){
		if( index > treeValues.length || treeValues[index].equals("#")) //
			return tree;
		else{
			TNode node = new TNode();
			tree.setValue(treeValues[index]);
			index = index * 2 +1; //left
			tree.setLeft(setTreeValue(node));
			index ++;
			tree.setRight(setTreeValue(node));
			index = index/2 - 1;
		}
		return tree;
	}

	public String treeLevel( TNode tree , int n){
		String str = "";
		return str;
	}
	
	public static void main(String args[]){
		TNode tree = new TNode();
		NodeClass.setTreeValue(tree);
	}
}
