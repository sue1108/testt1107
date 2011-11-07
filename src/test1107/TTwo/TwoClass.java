package test1107.TTwo;

public class TwoClass {

	/**
	 * 将正整数转换成16进制的串
	 * @param intNum
	 * @return
	 */
	public String intToHex( int intNum){
		String str = "";
		int tmp = 0;
//		int init = intNum;
		if( intNum > 10){
			while ( intNum/16 > 0 ){
				tmp = intNum%16;
				if( tmp > 10)
				    str = this.replaceNumToChar(tmp) + str;
				else
					str = tmp + str;
				intNum = intNum/16;
			}
			if( intNum > 10)
			    str = this.replaceNumToChar(intNum) + str;
			else
				str = intNum + str;
		}else{
			str = intNum + "";
		}
		return str;
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
	
/*	public int fun(int intNum){
		while (intNum/16 > 0)
			;
		return intNum/16;
	}*/
	
	public static void main(String args[]){
		TwoClass two = new TwoClass();
		System.out.println(two.intToHex(125));
/*		System.out.println(1/6);
		System.out.println(1%16);
		int i = 65;
		char a = (char)i;
		String b = String.valueOf(a);
		System.out.println(b);*/
	}
}
