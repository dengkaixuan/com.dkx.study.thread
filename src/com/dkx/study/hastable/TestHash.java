package com.dkx.study.hastable;

import java.io.Console;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestHash {

	
	
	
//	public static void main(String[] args) {
//		Map<String, String> map = new HashMap<String, String>();
//		map.put("Rajib Sarma","100");
//		map.put("Rajib Sarma","200");//The value "100" is replaced by "200".
//		map.put("Sazid Ahmed","200");
//
//		Iterator<?> iter = map.entrySet().iterator();
//		while (iter.hasNext()) {
//		    Map.Entry entry = (Map.Entry) iter.next();
//		    Object key = entry.getKey();
//		    Object val = entry.getValue();
//		}
//		
//	}
	
public static void main(String[] args) {
		
		/*set 无序 不重复
		 * 	无序 — 是指元素存入顺序和集合内存储的顺序不同
		 */
		
		
		/*
		 * 1. Set是“无序”的（利用hash算法存的 假无序，每次结果都一样）
		 * 		即：程序存放的顺序和执行的set顺序无关
		 * 
		 * 2. Set是不重复的。
		 */
		//采用哈希技术存储乱序
		Set s = new HashSet();
		
		//存储是按照排序存储的 注意 S内的内容要格式统一，符合排序的原则
		//Set s = new TreeSet();
		s.add("1");
		s.add("3");
		s.add("2");
		//对格式不限制
		//s.add(new Integer(4));
		//自动去重
		s.add("3");
		
		System.out.println(s);
		
		/*
		 * 遍历set类型的数据
		 */
		
		//迭代器Iterator
		
		Iterator it = s.iterator();
		while(it.hasNext())
		{
			String str = (String)it.next();
			
			System.out.println(str);
		}
		
		HashMap mp = new HashMap<>();
		mp.put(null, null);
		
		System.out.println(mp.containsKey(null));
		
		System.out.println("===="+mp.get(null));
		
		Hashtable tb = new Hashtable<>();
		tb.put("1", "2");
		System.out.println("----"+tb.get("1"));
		
	}

}
