package test1107.tfour;


public class NodeClass {
	
	/**
	 * 递归为二叉树设置值
	 * @param tree
	 * @return
	 */
	
	private static String treeValues[] = {"A" , 
		"B" , "D" ,
		"G" , "H" , "C" , "F" ,
		"H1" , "C1" , "F1" , "H" , "C" , "F" , "H1" , "C1" , 
		"F1" ,"G" , "H" , "C" , "F" ,"#"}; 
	
	private static int index =0;

	public NodeClass(){
		index = 0;
	}
//	, "#"
	/**
	 * 递归为二叉树赋值
	 * @return
	 */
	public static TNode setTreeValue( ){
		TNode tree = new TNode();
		if( treeValues!= null && treeValues.length > 0 && index >= 0){
			if( index > treeValues.length-1 || treeValues[index].equals("#")) //
				return tree;
			else{
				
				tree.setValue(treeValues[index]);
				index = index * 2 +1; //left
				tree.setLeft(setTreeValue());
				index ++;
				tree.setRight(setTreeValue());  //right
				index = index/2 - 1;
				return tree;
			}
			
		}else
			return null;
		
	}

	/**
	 * 按层遍历，遍历第n层的数，放入一个数组中
	 * @param tree
	 * @param n
	 * @return
	 */
	public static String treeLevel( TNode tree , int n){
		String str = null;
		if(n>0 ){
			int endLen = (int)Math.pow(2, n)-1;   //到第N层止的总共节点数
			int startLen = (int)Math.pow(2, n-1)-1;  //到第N-1层止的总共节点数
			int treeLen = treeValues.length -1 ;//二叉树的总共节点数
			if( startLen <= treeLen ){
				//如果第N-1层止的节点数大于二叉树的整个节点数，则说明没有第N层
					TNode nodeArr[] = new TNode[treeLen*2];
					nodeArr[0] = tree;
					int i = 0;  //
					int j = 1;  //
					int tmp =0;
					if( treeLen >  endLen)  //说需要返回的不是最后一层的节点
						tmp = endLen;
					else    //说明需要返回的是最后一层的节点
						tmp = treeLen ;
					while( j <=  tmp){ //按层次遍历二叉树
						if( nodeArr[i].getLeft() != null){
							nodeArr[j++] = nodeArr[i].getLeft();  //左
						}
						if( nodeArr[i].getRight() != null ){
							nodeArr[j++] = nodeArr[i].getRight(); //右
						}
					    i++;
					}
					StringBuffer sbf = new StringBuffer();
					for( int m = startLen ; m < tmp  ; m++ )
					{
						sbf.append(nodeArr[m].getValue() + "-");
					}
					str = sbf.substring(0, sbf.length()-1).toString();
			}else{
				str = "没有第N层";
			}
		}else{
			str = "N应该为正整数";
		}
		return str;
	}
	
	public static void main(String args[]){
		TNode node = NodeClass.setTreeValue();
//		System.out.println(node.getValue());
		if( node != null)
		System.out.println(NodeClass.treeLevel(node, -1));
//		NodeClass.treeLevel(node, 2);
	}
}
