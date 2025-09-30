package org.example.executerframework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        ExecutorService executor = Executors.newFixedThreadPool(2);
        for(int i = 1; i < 10; i++){
            int finalI = i;
            executor.submit(() -> {
                long result = factorial(finalI);
                System.out.println(result);
            });
        }
        executor.shutdown();

        try {
            executor.awaitTermination(6, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Total time: " + (System.currentTimeMillis() - startTime));
    }


    private static long factorial(int n){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        long res = 1;
        for(int i = 2; i <= n; i++){
            res *= i;
        }
        return res;
    }
}
