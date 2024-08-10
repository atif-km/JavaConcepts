
package com.jba;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LambdaExample {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		String[] arr = {"atif","Asif","Amir","Junaid","Farhan"};
		
		list =	Arrays.asList(arr);
		
		list.stream().map(x->x.toUpperCase()).forEach(x->System.out.print(x+" "));
		
		System.out.println("==================");
		
		list.stream().filter(x->x.toLowerCase().startsWith("a")).forEach(e->System.out.print(e+" "));
		
		Collections.sort(list);
		
		System.out.println(list);
		
	int sumEvenPos =	IntStream.range(0, list.size()).filter(x->x%2==0).sum();
	System.out.println(sumEvenPos);
		
		
		
		
	}

}

