package com.succez.test.testt1107.onesort;

import java.util.ArrayList;
import java.util.List;

import com.succez.test.testt1107.common.StaticConstant;
import com.succez.test.testt1107.pojo.AClass;

/**
 * 1、用于对List<AClass>的值进行排序<br/>
 * 2、类有2个方法:<br/>
 * 	public List<AClass> getListValues(List<AClass> aList , int n);<br/>
 * 	此方法是使用随机数对AClass的属性赋值，并将AClass的对象添加到aList中，aList的长度为n<br>
 * 	public List<AClass> sort(List<AClass> aList );<br/>
 * 	此方法是将aList的内容进行排序
 * @author sue
 * @createdate 2011-11-9
 */
public class SortClass {
	
	
	/**
	 * 1、循环n次，在循环体中，对AClass对象的2个属性赋值，值在0-100之间,将初始化的Aclass对象添加到aList中<br/>
	 * 2、aList参数允许为null，当为null时，此方法会为aList创建对象；<br/>
	 * 	参数n为aList的长度，输入的参数应该是正整数，如果小于0，则不作任何处理，直接返回list对象<br/>
	 * 3、此方法不会抛出异常现象<br/>
	 * 4、此方法的返回值为List<AClass>对象，在传入的参数n小于0时，如果传入的aList为null，则创建list对象并返回；<br/>
	 * 	如果传入的aList不为null，原样返回
	 * @param aList
	 * @param aList
	 * @return
	 */
	public List<AClass> getListValues(List<AClass> aList , int n){
		if( aList == null){   //对aList进行null判断，如果为空，则需要new对象，不为空，则不作操作
			int len = StaticConstant.LIST_LEN;
			if( len <= 0 )
				len = 5;
			aList = new ArrayList<AClass>(len);
		}
		
		if ( n > 0 ){   //如果传入的n值不是正整数，不作任何操作
			
			int v1 = 0;
			int v2 = 0;
			for( int i = 0 ; i < n ; i++){
				AClass aClass = new AClass();
				v1 = (int) (Math.random()*100);
				v2 = (int) (Math.random()*100);
				aClass.setV1(v1);
				aClass.setV2(v2);
				aList.add(aClass);
			}
		}
		
		return aList;
	}
	
	
	/**
	 * 1、sort方法,使用冒泡排序法对List<AClass>进行排序<br/>
	 * 2、参数aList对象不能为null，如果为null，则会为它创建对象，不作任何操作并返回此对象<br/>
	 * 对aList进行排序，排序条件：<br/>
	 *    条件一：对V1进行降序排列<br/>
	 *    条件二：如果v1相等，则按v2的升序排列<br/>
	 * 3、此方法的返回值为List<AClass>对象，如果传入的aList为null，则创建list对象并返回；<br/>
	 * 	如果传入的aList不为null，则进行排序后返回操作后的aList
	 * @param aList
	 * @return
	 */
	public List<AClass> sort(List<AClass> aList ){
		if( aList != null ){
			int lenList = aList.size();
			AClass aTempI ;//不必创建对象
			AClass aTempJ ;
			AClass aTemp ; 
			for( int i = 0 ; i < lenList ; i++){
				for( int j = i + 1 ; j < lenList ; j++){//多次使用的应该定义一个变量
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
			int len = StaticConstant.LIST_LEN;
			if( len <= 0 )
				len = 5;
			aList = new ArrayList<AClass>(len);
		}
		
		return aList;
	}
	

}
