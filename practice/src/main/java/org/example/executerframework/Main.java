package org.example.executerframework;

public class Main {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        Thread[] threads = new Thread[9];
        for(int i = 1; i < 10; i++){
            int finalI = i;
            threads[i-1] = new Thread(
                    () -> {
                        long result = factorial(finalI);
                        System.out.println(result);
                    }
            );
            threads[i-1].start();
        }

        for(Thread thread: threads){
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
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
