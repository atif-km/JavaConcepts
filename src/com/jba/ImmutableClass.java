package com.jba;

import java.util.ArrayList;
import java.util.List;

/*Declare the Class as final
This prevents other classes from subclassing it, which can help ensure immutability.
*/
public final class ImmutableClass {
	
	 private final String name;
	    private final int age;
	    
	    private final List<String> favoriteColors;

		public ImmutableClass(String name, int age, List<String> favoriteColors) {
			this.name = name;
			this.age = age;
			this.favoriteColors = new ArrayList<String>(favoriteColors);
		}
	
	//Initialize All Fields via a Constructor
	
		  // Return a copy of the list to ensure immutability
	    public List<String> getFavoriteColors() {
	        return new ArrayList<>(favoriteColors);
	    }
	
	


	

}
