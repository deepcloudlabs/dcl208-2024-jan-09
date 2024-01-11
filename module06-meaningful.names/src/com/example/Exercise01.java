package com.example;

import java.time.Duration;
import java.util.List;

@SuppressWarnings("unused")
public class Exercise01 {
	public static void main(String[] args) {
		// number of accounts
		PositiveInteger numberOfAccounts;
		Size fileSize;
		Duration elapsedDaysBetweenTasks;
		// bad practice
		var grades = List.of(1,2,3,4,5);
		var names = new String[]{"jack", "kate", "james"};
		// for loop
		for(int i=0;i<names.length;++i) {
			var name = names[i];
			System.out.println(name);
		}
		// for-each: imperative
		for (var name : names)
			System.out.println(name);
		// for-each: declarative
		grades.forEach(System.err::println);
		
	}
}

record PositiveInteger(int value) {}
enum SizeUnit { B, KB, MB, GB, TB}
record Size(int value,SizeUnit unit) {
	
}