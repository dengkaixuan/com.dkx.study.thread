package com.dkx.study.spring;

import java.util.HashMap;
import java.util.Hashtable;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 2;
		byte b = 3;
		System.out.println(a+b);
		int s = 2;
		int k = 3;
		
		System.out.println(((s++ == k)?k+++s:++s+k--));
		
		//System.out.println(String.format("%","%", s,k));
		
		HashMap mp = new HashMap();
		mp.put("1", "1");
		mp.put("1", "2");
		
		System.out.println(mp.get("1"));
		
		Hashtable tb = new Hashtable();
		tb.put("2", "2");
		tb.put("2", "3");
		System.out.println(tb.get("2"));
	}

}
