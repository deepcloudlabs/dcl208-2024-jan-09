package com.example;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class Exercise04 {

	public static void main(String[] args) {
		fun().thenAcceptAsync(System.out::println);
		for (var i=0;i<100;++i) {
			System.out.println(i);
			try {TimeUnit.MILLISECONDS.sleep(500);}catch(Exception e) {}
		}

	}
	public static CompletableFuture<Integer> fun() {
		return CompletableFuture.supplyAsync(() ->{
			try {TimeUnit.SECONDS.sleep(5);}catch(Exception e) {}
			return 42;			
		});
	}
}
