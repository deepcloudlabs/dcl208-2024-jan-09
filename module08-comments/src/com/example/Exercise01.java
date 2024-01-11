package com.example;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Exercise01 {

	public static void main(String[] args) {
		gun(List.of(1,2,3));
	}
	
	/**
	 * @param items constains bla bla bla...
	 * @return
	 * @author 
	 * 
	 * 
	 * 
	 * 
	 * */
	public static void gun(List<Integer> items) {
		if (skipIfExcessiveItems(items)) {
			
		}
		
	}
	private static boolean skipIfExcessiveItems(List<Integer> items) {
		return items.size() > 10 && items.get(0) > 5;
	}
	public int fun(int x) {
		// if (x<42) return 2*x+3;
		return 42;
	}
	public void diplay(TimeUnit unit) {
		if (unit == null) {
			// do not render object
			return;
		}
	}
}
