package com.jba;

public class SingletonClass {
	
	private static volatile SingletonClass instance;
	
	private  SingletonClass() {
		
	}
	
	public static SingletonClass getInstance() {		
		if(instance==null) {
			synchronized (SingletonClass.class) {
				if (instance==null) {
					instance = new SingletonClass();
				}
				
			}
		}
		return instance;
	}
	
	//add the moethod to avoid breaking singleton nature if serialized and then deserialize
	 // Ensure that deserialization does not create a new instance
	/*
	 * private Object readResolve() 
	 * { 
	 * return getInstance();
	 *  }
	 */
}
