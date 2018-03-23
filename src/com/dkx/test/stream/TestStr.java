package com.dkx.test.stream;

import java.util.Scanner;

public class TestStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入字母信息：");
		Scanner in = new Scanner(System.in);
		
		String str = in.nextLine().toLowerCase();
		//System.out.println(str);
		String abs = "";
		int num = 1;
		StringBuffer strBuf = new StringBuffer();
		str = str.toLowerCase();
		
		
		for(int i = 0; i < str.length(); i++){
			if((i+1)<=str.length()){
				abs = str.substring(i, i+1);
				strBuf.append(abs);
				num = 1;
			}
			
			for(int j = i + 1; j < str.length(); j++){
				//System.out.println(str.substring(j, j+1));
				if(abs.equals(str.substring(j, j+1))){
					num ++;
				}else if(num > 1){
					strBuf.append(num);
					i = j - 1;
					break;
				}else{
					i = j - 1;
					break;
				}
			}
		}
		System.out.println("转换后输出："+strBuf);
	}
}
