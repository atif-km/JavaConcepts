package com.jba;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class ConmplexStream {
	
	
	public static void main(String[] args) {
		  List<Integer> numbers = Arrays.asList(5, 3, 9, 7, 8, 2, 6,2,3,5,9);
		  
	Optional<Integer> secHighest =  numbers.stream().sorted(Comparator.reverseOrder()).distinct()
		  .skip(1).findFirst();
	secHighest.ifPresent(System.out::println);


	List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "fig", "grape");
	
	Map<Integer,List<String>> groupByLen = words.stream().collect(Collectors.groupingBy(String :: length));
	//groupByLen.forEach((length,group)->System.out.println("Length "+length+" group "+group));
	
	for(Entry<Integer, List<String>> e : groupByLen.entrySet()) {
		System.out.println(e.getKey() +" "+e.getValue());
		
	}
	
	
	  List<List<String>> listOfLists = Arrays.asList(
	            Arrays.asList("a", "b", "c"),
	            Arrays.asList("d", "e", "f"),
	            Arrays.asList("g", "h", "i")
	        );
	  
	  listOfLists.stream().flatMap(List::stream).collect(Collectors.toList());
	

	
		  
		  
		  
		  
	}

}
