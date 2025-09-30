package org.example.executerframework;


import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

// CompletableFuture => used to handle asynchronous programming or non blocking execution
// comes in java 8
public class CF {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync( () -> {
            try{
                Thread.sleep(5000);
                System.out.println("Worker");
            } catch (Exception e){

            }
            return "ok";
        });
        String s = completableFuture.get();
        System.out.println(s);
        System.out.println("Main");
    }
}
