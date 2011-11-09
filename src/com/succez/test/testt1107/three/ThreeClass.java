package com.succez.test.testt1107.three;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;

import com.succez.test.testt1107.common.StaticConstant;

public class ThreeClass {

	/**
	 * 1、得到路径为fobj文件的内容
	 * 2、输入值应该为文件的路径，例如：D:\\test.txt,如果参数异常或者不存在此文件，则返回""
	 * @param fobj
	 * @return
	 */
	public static String getFileString( File fobj){
		if( fobj.isFile()){
			int temp = 0;
			int len = StaticConstant.STRINGBUFFER_LEN;
			if( len <= 0 )
				len = 8;
			StringBuffer buf = new StringBuffer(len);
			FileInputStream in = null;
			Reader read = null;
			try {
				in = new FileInputStream(fobj);
				read = new InputStreamReader(in);  //处理16位,文件可能包含中文
				while( (temp = read.read()) != -1  ){
					buf.append((char)temp);
				}
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}catch (IOException e) {
				e.printStackTrace();
			}finally{
				try {
					if( read != null )
					    read.close();
					if( in != null)
					    in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
			return buf.toString();
		}
		else
			return "";
		
	}
	
	
	
	/**
	 * 将服务器端的字符串格式化为js端的常量
	 * @param s
	 * @return
	 */
	public final static String formatJsStr(String s){
//		String str = "";
		int len = StaticConstant.STRINGBUFFER_LEN;
		if( len <= 0)
			len = 8;
		StringBuffer sbf = new StringBuffer(len);
		byte bt[] = null;
		try {
			bt = s.getBytes("utf-8");  
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}//getBytes不使用
		byte newBt[] = new byte[bt.length * 2];
		int j = 0;
/*		for( int i = 0 ; i < bt.length ; i++)
			System.out.print(bt[i] + "-");*/
		
		for( int i = 0 ; i < bt.length ; i++){
//			":34  \:92  tab:9  92+116:\t   回车换行:10,13
			if( bt[i] == 34 || bt[i] == 92 ){
				newBt[j++] = 92;
				newBt[j++] = bt[i];
			}else if(bt[i] == 9){
				newBt[j++] = 92;
				newBt[j++] = 116;
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
			sbf.append((char)newBt[i]);
//			str += String.valueOf((char)newBt[i]);
		}
		
		return sbf.toString();
	}
	
	
	
	public static byte[] file2buf( File fobj){
		if( !fobj.exists())
			return null;
		else{
			byte bt[]  = new byte[1024];
			int temp = 0;  
			int i = 0;  //byte数组的索引
			FileInputStream in = null;
			Reader read = null;
			try {
				in = new FileInputStream(fobj);
				read = new InputStreamReader(in);  //处理16位
				while( (temp = read.read()) != -1  ){
					bt[i] = (byte) temp;
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}catch (IOException e) {
				e.printStackTrace();
			}finally{
				try {
					if( read != null )
					    read.close();
					if( in != null)
					    in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
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
