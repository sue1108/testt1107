package test1107.TThree;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.regex.Pattern;

public class ThreeClass {

	public static String getFileString( File fobj){
		int temp = 0;
		String str = "";
		try {
			Reader read = new InputStreamReader(new FileInputStream(fobj));  //处理16位
			while( (temp = read.read()) != -1  ){
				str += String.valueOf((char)temp);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		return str;
	}
	
	public final static String formatJsStr(String s){
		String str = "";
		byte bt[] = s.getBytes();
		byte newBt[] = new byte[bt.length * 2];
		int j = 0;
		for( int i = 0 ; i < bt.length ; i++){
//			System.out.print(bt[i] + "-");
//			":34  \:92  tab:9  92+116:\t   回车换行:10,13
			if( bt[i] == 34 || bt[i] == 92 ){
				newBt[j++] = 92;
				newBt[j++] = bt[i];
			}else if(bt[i] == 9){
				newBt[j++] = 92;
				newBt[j++] = 116;
				i++;
			}else if(bt[i] == 13 && bt[i+1] == 10){
				newBt[j++] = 92;
				newBt[j++] = 110;
				i++;
			}
			else{
				newBt[j++] = bt[i];
			}
			
		}
		for( int i = 0 ; i < newBt.length ; i++){
			str += String.valueOf((char)newBt[i]);
		}
		
		return str;
	}
	
	public static byte[] file2buf( File fobj){
		if( !fobj.exists())
			return null;
		else{
			byte bt[]  = new byte[1024];
			int temp = 0;
			int i = 0;
			try {
				Reader read = new InputStreamReader(new FileInputStream(fobj));  //处理16位
				while( (temp = read.read()) != -1  ){
					bt[i] = (byte) temp;
//					System.out.print((char)temp);
				}
				/*InputStream is = new FileInputStream(fobj)只能处理8位，中文出现乱码
				while ( (temp = is.read()) != -1 ){
					System.out.println((char)temp);
				}*/
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}catch (IOException e) {
				e.printStackTrace();
			}
			return bt;
		}
		
	}
	
	public static void main(String args[]){
//		System.out.println("ab\"c");
		File file = new File("D:\\test.txt");
		byte bt [] = ThreeClass.file2buf(file);

		System.out.println("初始字符串:"+ThreeClass.getFileString(file));
		System.out.println("转换后字符串:"+ThreeClass.formatJsStr(ThreeClass.getFileString(file)));
	}
}
