package com.jba;

import java.util.Optional;

public class OptionalExample {
    
    public static void main(String[] args) {
        OptionalExample example = new OptionalExample();
        
        // Example with a non-null value
        Optional<String> optionalWithNonNull = Optional.ofNullable(example.getSomeValue(false));
        optionalWithNonNull.ifPresent(value -> System.out.println("Value is present: " + value));
        
        String resultWithNonNull = optionalWithNonNull.orElse("Default Value");
        System.out.println("Result with non-null value: " + resultWithNonNull);
        
        String resultFromSupplierWithNonNull = optionalWithNonNull.orElseGet(() -> "Value from Supplier");
        System.out.println("Result from Supplier with non-null value: " + resultFromSupplierWithNonNull);
        
        optionalWithNonNull.orElseThrow(() -> new IllegalArgumentException("Value is absent"));
        
        // Example with a null value
        Optional<String> optionalWithNull = Optional.ofNullable(example.getSomeValue(false));
        optionalWithNull.ifPresent(value -> System.out.println("Value is present: " + value));
        
        String resultWithNull = optionalWithNull.orElse("Default Value");
        System.out.println("Result with null value: " + resultWithNull);
        
        String resultFromSupplierWithNull = optionalWithNull.orElseGet(() -> "Value from Supplier");
        System.out.println("Result from Supplier with null value: " + resultFromSupplierWithNull);
        
        try {
            optionalWithNull.orElseThrow(() -> new IllegalArgumentException("Value is absent"));
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
    
    private String getSomeValue(boolean returnNonNull) {
        if (returnNonNull) {
            return "Hello, World!";
        } else {
            return null;
        }
    }
}
