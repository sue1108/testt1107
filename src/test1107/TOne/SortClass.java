package test1107.TOne;

import java.util.ArrayList;
import java.util.List;

public class SortClass {
	
	
	/**
	 * 对alist赋值，值在0-100之间
	 * @param aList
	 * @return
	 */
	public List<AClass> getListValues(List<AClass> aList , int n){
		int tmp1 = 0;
		int tmp2 = 0;
		for( int i = 0 ; i < n ; i++){
			AClass a = new AClass();
			tmp1 = (int) (Math.random()*100);
			tmp2 = (int) (Math.random()*100);
			a.setV1(tmp1);
			a.setV2(tmp2);
			aList.add(a);
		}
		
		return aList;
	}
	
	/**
	 * 排序,V1降序排列，如果V1相等，则V2升序排列
	 * @param aList
	 * @return
	 */
	public List<AClass> sort(List<AClass> aList ){
		int len = aList.size();
		int tmp = 0;
		AClass aTemp = new AClass();//多余行
		for( int i = 0 ; i < len ; i++){
			for( int j = i + 1 ; j < len ; j++){
				if( aList.get(i).getV1() < aList.get(j).getV1() ){ //如果i的v1小于j的v1，则替换
					aTemp = aList.get(i);
					aList.set(i, aList.get(j));
					aList.set(j, aTemp);
				}else if(  aList.get(i).getV1() == aList.get(j).getV1() ){//如果i的v1等于j的v1，则根据v2的升序排列
					if( aList.get(i).getV2() > aList.get(j).getV2() ){ 
						aTemp = aList.get(i);
						aList.set(i, aList.get(j));
						aList.set(j, aTemp);
					} 
				}
			}
		}
		
		return aList;
	}
	
    public static void main(String args[]){
	
    	List<AClass> aList = new ArrayList<AClass>();
    	aList = new SortClass().getListValues(aList , 10);
    	
    	System.out.println("v1-v2");
    	for (AClass class1 : aList) {
			System.out.println(class1.getV1() + "-" + class1.getV2());
		}
    	System.out.println("\nv1-v2");
    	aList = new SortClass().sort(aList);
    	for (AClass class1 : aList) {
			System.out.println(class1.getV1() + "-" + class1.getV2());
		}
	}

}
