package org.example.executerframework;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        scheduler.schedule(() -> System.out.println("Task executed after 5 secs delay"), 5, TimeUnit.SECONDS);
        scheduler.shutdown();
    }

}
