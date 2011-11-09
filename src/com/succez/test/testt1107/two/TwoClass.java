package com.succez.test.testt1107.two;

import com.succez.test.testt1107.common.StaticConstant;

/**
 * @author sue
 * @createdate 2011-11-9
 */
public class TwoClass {

	/**
	 * 1、将正整数转换成16进制的串<br/>
	 * 2、参数intNum应该为正整数<br/>
	 * 3、如果intNum为正整数，则会返回intNum的16进制数；<br/>
	 * 如果intNum小于0，则会返回参数错误提示
	 * @param intNum
	 * @return
	 */
	public String intToHex( int intNum){
		if ( intNum < 0){  //如果为负数，则提示错误
			return "参数有误，应该为正整数！";
			
		}else{
			int len = StaticConstant.STRINGBUFFER_LEN;
			if( len <= 0 )
				len = 8;
			StringBuffer sbf = new StringBuffer(len);
			int tmp = 0;
			if( intNum > 10){
				while ( intNum/16 > 0  || intNum > 0){  
					tmp = intNum%16;
					if( tmp > 10)
//						将10-15的十进制转换为A-F，A的ASCII为65
						sbf.append( (char)(tmp+55) );    
					else
						sbf.append(tmp);
					intNum = intNum/16;
				}
			}else{
				sbf.append(intNum);
			}
			return sbf.reverse().toString();
		}
	}
	
	
	/**
	 * 将10-15的十进制转换为A-F
	 * @param num
	 * @return
	 */
/*	public char replaceNumToChar(int num){
//		A的asc为65
		return (char)(num + 55);
	}*/

}
