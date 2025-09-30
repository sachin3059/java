package org.example.executerframework;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CF {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(5000); // simulate long-running task
                System.out.println("Worker thread: " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "ok";
        }).thenApply(x -> x + x); // transform the result ("ok" -> "okok")

        // Wait for result
        String result = completableFuture.get(); // blocks main thread until done
        System.out.println("Result: " + result);
    }
}
