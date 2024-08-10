package com.jba;

import java.util.List;
import java.util.Optional;

public class OptionalExample1 {
	
	public static void main(String[] args) {
		
		String temp = "Atif";
		Optional<String> option = Optional.ofNullable(temp);
		
		//option.ifPresent(value->System.out.println("value of arg "+value));
		option.ifPresentOrElse(value->System.out.println("value is present "+value), ()->System.out.println("Value is empty"));
		
			
		
		
		
	}

}
