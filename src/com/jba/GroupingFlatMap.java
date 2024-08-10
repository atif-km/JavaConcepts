package com.jba;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class GroupingFlatMap {
	
	public static void main(String[] args) {
		 List<Employee> employees = Arrays.asList(
		            new Employee(1, "Software Engineer", "John Doe", LocalDate.of(2020, 1, 15), Arrays.asList("123-456-7890", "098-765-4321")),
		            new Employee(2, "Senior Software Engineer", "Jane Smith", LocalDate.of(2018, 3, 10), Arrays.asList("234-567-8901")),
		            new Employee(3, "HR Manager", "Peter Johnson", LocalDate.of(2016, 7, 19), Arrays.asList("345-678-9012")),
		            new Employee(4, "HR Specialist", "Lucy Brown", LocalDate.of(2019, 6, 1), Arrays.asList("456-789-0123")),
		            new Employee(5, "Finance Manager", "Mike Davis", LocalDate.of(2017, 11, 11), Arrays.asList("567-890-1234")),
		            new Employee(6, "Finance Analyst", "Laura Wilson", LocalDate.of(2019, 5, 14), Arrays.asList("678-901-2345")),
		            new Employee(7, "Product Manager", "Kevin White", LocalDate.of(2021, 2, 21), Arrays.asList("789-012-3456")),
		            new Employee(8, "QA Engineer", "Rachel Green", LocalDate.of(2020, 9, 30), Arrays.asList("890-123-4567")),
		            new Employee(9, "DevOps Engineer", "James Brown", LocalDate.of(2018, 12, 25), Arrays.asList("901-234-5678", "012-345-6789")),
		            new Employee(10, "UI/UX Designer", "Samantha Black", LocalDate.of(2017, 4, 5), Arrays.asList("012-345-6789"))
		        );
		 
		 
		 List<String> desigList = employees.stream().map(x->x.getDesignation()).collect(Collectors.toList());
		 System.out.println(desigList);
		 
		 int id = 21;
		 
		 Optional<Employee> designation = employees.stream().filter(x->x.getId()==id).findFirst();
		 
		 designation.ifPresentOrElse(System.out::println,() -> System.out.println("No Employeed with id "+id));
		 
		 LocalDate fiveYearsAgo = LocalDate.now().minusYears(5);

		 
		 List<Employee> emplist = employees.stream().filter(x->x.getDateOfJoining().isBefore(fiveYearsAgo)).collect(Collectors.toList());
		 
		 emplist.forEach(System.out::println);
		 
		 Map<String, List<Employee>> employeesByDesignation  = employees.stream().collect(Collectors.groupingBy(Employee::getDesignation));
		 
		 
	}

}
