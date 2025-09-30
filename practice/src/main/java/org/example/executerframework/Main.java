package org.example.executerframework;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        int numberOfServices = 3;
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfServices);

        // CyclicBarrier with a barrier action (optional)
        CyclicBarrier barrier = new CyclicBarrier(numberOfServices, () -> {
            System.out.println("All services reached barrier. Main can proceed.");
        });

        // Submit tasks
        executorService.submit(new DependentService(barrier));
        executorService.submit(new DependentService(barrier));
        executorService.submit(new DependentService(barrier));

        // Shutdown after tasks complete
        executorService.shutdown();
    }
}

class DependentService implements Runnable {  // Runnable works better with CyclicBarrier
    private final CyclicBarrier barrier;

    public DependentService(CyclicBarrier barrier) {
        this.barrier = barrier;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " Service started");
            Thread.sleep(2000);

            System.out.println(Thread.currentThread().getName() + " waiting at barrier");
            barrier.await();  // Wait for other threads

            System.out.println(Thread.currentThread().getName() + " proceeding after barrier");
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
