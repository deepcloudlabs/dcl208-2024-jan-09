package com.example;

import java.util.List;
import java.util.function.Consumer;

@SuppressWarnings("unused")
public class Exercise01 {

	public static void main(String[] args) {
		// 1. Functional Programming -> 1-statement
		// Stream API: filter/map/reduce -> 1-statement
		// method chaining -> 1-statement
		// HoF -> Pure Function -> Lambda Expression -> 1-statement
		var numbers = List.of(4, 8, 15, 16, 23, 42);
		var total = getEvenTotal(numbers);
		// 2. Procedural Programming
		// 3. OOP
		// TDD: Red -> Green -> Refactoring: 
		//                      SonarQube/Pair Programming/Code Review/AI/...

	}

	static public int getEvenTotal(List<Integer> numbers) {
		return numbers.stream() // 1-statement
				.filter(NumberUtils::isEven)
				.map(NumberUtils::toCube)
				.mapToInt(Integer::intValue)
				.sum();
	}

}

interface NumberUtils {
	public static boolean isEven(int n) {
		return n % 2 == 0;
	}
	public static int toCube(int u) {
		return u * u * u;
	}
}

class Account {
	private double balance;

	public void withdraw(double amount) {
		validateParameters(amount);
		balance -= amount;
	}

	private void validateParameters(double amount) {
		runValidations(amount, List.of(
				this::validateIfPositive, 
				this::validateBusinessRule1, 
				this::validateBusinessRule2,
				this::validateBusinessRule3, 
				this::validateBusinessRule4, 
				this::validateBusinessRule5));
	}

	private void runValidations(double amount, List<Consumer<Double>> validators) {
		validators.forEach(validator -> validator.accept(amount));
	}

	private void validateBusinessRule1(Double amount) {
		if (amount < balance)
			throw new IllegalArgumentException("Amount must be less than balance");
	}

	private void validateBusinessRule2(Double amount) {
		if (amount < balance)
			throw new IllegalArgumentException("Amount must be less than balance");
	}

	private void validateBusinessRule3(Double amount) {
		if (amount < balance)
			throw new IllegalArgumentException("Amount must be less than balance");
	}

	private void validateBusinessRule4(Double amount) {
		if (amount < balance)
			throw new IllegalArgumentException("Amount must be less than balance");
	}

	private void validateBusinessRule5(Double amount) {
		if (amount < balance)
			throw new IllegalArgumentException("Amount must be less than balance");
	}

	private void validateIfPositive(Double amount) {
		if (amount <= 0)
			throw new IllegalArgumentException("Amount must be positive");
	}
}