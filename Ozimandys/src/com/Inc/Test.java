package com.Inc;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Test {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) 
	{
		
		
		Set <String> set = new HashSet<String>();
		set.add("a");
		set.add("B");
		
		Iterator<String>iter = set.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
		
		
		
		
		
//		List <Integer> list = new ArrayList();
//		
//		list.add(2);
//		list.add(5);
//		
//		System.out.println(list.get(1));
//		
//		list.remove(0);
//		System.out.println(list.get(0));
//		
//		for(int x: list)
//		{
//			System.out.println(x);
//		}
//		System.out.println("--------");
//		
//		Iterator<Integer> iterator = list.iterator();
//		
//		while(iterator.hasNext())
//		{
//			System.out.println(iterator.next());
//		}
//		System.out.println("--------");
//		
//	
//		System.out.println(list.isEmpty());
	
	}

}
