package com.example;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class Exercise05 {

	public static void main(String[] args) throws InterruptedException {
		CompletableFuture<?>[] futures = List.of(fun(),gun()).toArray(new CompletableFuture<?>[0] );
		CompletableFuture.allOf(futures)
		         .thenAcceptAsync((done)->{
		        	 for(var future : futures)
						try {
							System.out.println(future.get());
						} catch (InterruptedException | ExecutionException e) {
							e.printStackTrace();
						}
		         });
		TimeUnit.SECONDS.sleep(5);
		System.out.println("Application is done");
	}

	public static CompletableFuture<Integer> fun() {
		return CompletableFuture.supplyAsync(() -> {
			return 42;
		});
	}

	public static CompletableFuture<Integer> gun() {
		return CompletableFuture.supplyAsync(() -> {
			return 108;
		});
	}
}
