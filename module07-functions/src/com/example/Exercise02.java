package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Exercise02 {

	public static void main(String[] args) {
		var repository = new EmployeeRepository();
		repository.findByIdentity("1").ifPresent(Employee::increaseSalary);
		getEvenNumbers2(List.of(4, 8, 15, 16, 23, 42))
		       .forEach(System.out::println);

	}

	public static List<Integer> getEvenNumbers(List<Integer> numbers) {
		var evenNumbers = new ArrayList<Integer>();
		for (var number : numbers)
			if (number % 2 == 0)
				evenNumbers.add(number);
		return evenNumbers;
	}

	public static Stream<Integer> getEvenNumbers2(List<Integer> numbers) {
		return numbers.stream()
				      .peek(System.out::println)
				      .filter(n -> n % 2 == 0);
	}
}

class Employee {
	public void increaseSalary() {
	}
}

@SuppressWarnings("serial")
class EmployeeNotFoundException extends RuntimeException {
}

class EmployeeRepository {
	Optional<Employee> findByIdentity(String identity) {
		// throw new EmployeeNotFoundException();
		return Optional.empty();
	}

	List<Employee> findByAge(int age) {
		return List.of(); // no need to throw exception if empty
	}
}
