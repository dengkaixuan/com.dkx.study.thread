package com.dkx.test.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTest {

	public static void main(String[] args) {
		//IntStream.range(0, 10).forEach(value -> System.out.println(value));

		String str = "selects";
		
		for(int i = 0; i<str.length(); i++){
			//System.out.println(str.substring(0, i));
			if(str.substring(0, 1).equals(str.substring(0, i))){
				System.out.println(str.substring(0,i));
			}
		}
		
		int d = 3;
		int s = 3;
		
		int u = s * d;
		System.out.println(s + "*" + d +"="+(s*d));
		
		
		StringBuffer strBuf = new StringBuffer();
		
		StringBuilder strBul = new StringBuilder();
		
		List <String> list = new ArrayList<>();
		
		Set <String> set = new HashSet<>();
		
		list.add("12");
		list.add("34");
		list.add("56");
		
		set.add("12");
		set.add("34");
		set.add("56");
		set.add("78");
		
		for(String attribute : list){
			System.out.println(attribute);
		}
		
		for (String strs : set) {  
		      System.out.println(strs);  
		} 
		
		Iterator <String> it = set.iterator();
		while(it.hasNext()) {
		  System.out.println(it.next());
		}
		
		//List<Integer> list = IntStream.range(1, 100).boxed().collect(Collectors.toList());
		System.out.println(list.stream().count());
	}

}
