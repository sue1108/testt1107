package test1107.ttwo;

public class TwoClass {

	
	/**
	 * 完善后的代码
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
	
	
	public static void main(String args[]){
		TwoClass two = new TwoClass();
//		System.out.println(two.intToHexOld(1234345));
		System.out.println(two.intToHex(1234345));
/*		System.out.println(1/6);
		System.out.println(1%16);
		int i = 65;
		char a = (char)i;
		String b = String.valueOf(a);
		System.out.println(b);*/
	}
}
