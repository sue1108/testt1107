package test1107.ttwo;

public class TwoClass {

	/**
	 * 将正整数转换成16进制的串
	 * @param intNum
	 * @return
	 */
	public String intToHex( int intNum){
		if ( intNum < 0){  //如果为负数，则提示错误
			return "参数有误，应该为正整数！";
			
		}else{
			StringBuffer sbf = new StringBuffer();
			int tmp = 0;
			if( intNum > 10){
				while ( intNum/16 > 0  || intNum > 0){  
					tmp = intNum%16;
					if( tmp > 10)
						sbf.append(this.replaceNumToChar(tmp));
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
	public String replaceNumToChar(int num){
//		A的asc为65
		char a = (char)(num + 55);
		return String.valueOf(a);
	}

}
