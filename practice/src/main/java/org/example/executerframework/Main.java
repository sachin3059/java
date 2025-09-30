package org.example.executerframework;


import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        int numberOfServices = 3;
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        CountDownLatch latch = new CountDownLatch(numberOfServices);
        // CountDownLatch is used when one or more threads need to wait until a set of operations in other threads completes.


        executorService.submit(new DependentService(latch));
        executorService.submit(new DependentService(latch));
        executorService.submit(new DependentService(latch));
        latch.await();

        System.out.println("Main");
        executorService.shutdown();




    }
}


class  DependentService implements Callable<String> {
    private final CountDownLatch latch;

    public DependentService(CountDownLatch latch){
        this.latch = latch;
    }

    @Override
    public String call() throws  Exception {
        System.out.println(Thread.currentThread().getName() + "Service started");
        Thread.sleep(2000);
        latch.countDown();
        return  "ok";
    }
}
