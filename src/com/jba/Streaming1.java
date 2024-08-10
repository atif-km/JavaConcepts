package com.jba;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Streaming1 {
	
	
	public static void main(String[] args) {
		/*
		 * Integer as[]= {1,2,23,4,4,5,45,6,78,79,12,5,45}; List<Integer> asList =
		 * Arrays.asList(as);
		 * 
		 * asList.stream().forEach(System.out::println);
		 * 
		 * Set asSet = new HashSet<Integer>(asList);
		 * 
		 * System.out.println("----------Remove Duplicate-------");
		 * 
		 * List<Integer> uniqueList = (List<Integer>)
		 * asSet.stream().collect(Collectors.toList()); System.out.println(uniqueList);
		 * 
		 * System.out.println("----------Even List-------");
		 * uniqueList.stream().filter(x->x%2==0).forEach(System.out::println);
		 * 
		 * System.out.println("-------Odd List-------");
		 * 
		 * uniqueList.stream().filter(x->x%2!=0).forEach(System.out::println);
		 * 
		 * System.out.println("------Add 10 to each element---------");
		 * uniqueList.stream().map(x->x+10).forEach(System.out::println);
		 */
		
		
		String [] str = {"atif","majid","suhail","laxman","xavier","zain","Arif"};
		
		List<String> nameList = Arrays.asList(str);
		
		nameList.stream().forEach(System.out::println);
		
		System.out.println("=====to Upper==========");
		
		nameList.stream().map(x->x.toUpperCase()).forEach(System.out::println);
		System.out.println("=====alternate String==========");
		 
		List<String>	alternateString = IntStream.range(0, nameList.size()).filter(x->x%2==0).mapToObj(nameList::get).collect(Collectors.toList());
		alternateString.stream().forEach(System.out::println);
		Collections.sort(nameList);
		System.out.println("=====Sorted List==========");
		nameList.stream().forEach(System.out::println);
			
			
			

	}

}
