package test1107.tone;

import java.util.ArrayList;
import java.util.List;

public class SortClass {
	
	
	/**
	 * 对alist赋值，值在0-100之间,alist的长度为n<br/>
	 * 1、如果传入的List对象为null，则new一个list对象<br/>
	 * 2、如果n小于0，则不作任何处理，直接返回list对象<br/>
	 * @param aList
	 * @param aList
	 * @return
	 */
	public List<AClass> getListValues(List<AClass> aList , int n){
		if( aList == null){   //对aList进行null判断，如果为空，则需要new对象，不为空，则不作操作
			aList = new ArrayList<AClass>();
		}
		
		if ( n > 0 ){   //如果传入的n值不是正整数，不作任何操作
			
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
		}
		
		return aList;
	}
	
	
	/**
	 * sort方法,使用的冒泡排序法<br/>
	 * 对aList进行排序，排序条件：<br/>
	 *    条件一：对V1进行降序排列<br/>
	 *    条件二：如果v1相等，则按v2的升序排列<br/>
	 * 1、如果传入的List对象为null，则new一个list对象并返回，不作其他任何处理<br/>
	 * @param aList
	 * @return
	 */
	public List<AClass> sort(List<AClass> aList ){
		if( aList != null ){
			int len = aList.size();
			AClass aTempI ;//不必创建对象
			AClass aTempJ ;//不必创建对象
			AClass aTemp ;//不必创建对象
			for( int i = 0 ; i < len ; i++){
				for( int j = i + 1 ; j < len ; j++){//多次使用的应该定义一个变量
					aTempI = aList.get(i);
					aTempJ = aList.get(j);
					
					if( aTempI.getV1() < aTempJ.getV1()  //如果i的v1小于j的v1，则替换（降序排列）
							//如果i的v1等于j的v1，则根据v2的升序排列
						  || ( aTempI.getV1() == aTempJ.getV1() && aTempI.getV2() > aTempJ.getV2() ) 
						){
						aTemp = aTempI;
						aList.set(i, aTempJ);
						aList.set(j, aTemp);
					}
				}
			}
		}else{
			aList = new ArrayList<AClass>();
		}
		
		return aList;
	}
	

}
