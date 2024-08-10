package com.jba;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Streaming {
	
	public static void main(String[] args) {
		
		List<Integer> numList = Arrays.asList(12,3,4,55,7,8,9,23) ;
		
		List<Integer> numList1  = numList.stream().filter(x->x%2==0).collect(Collectors.toList());
		
		int numList2 = 	IntStream.range(0, numList.size()).filter(x->x%2==0).map(numList::get).sum();
		
		System.out.println(numList2);
		
	}

}

