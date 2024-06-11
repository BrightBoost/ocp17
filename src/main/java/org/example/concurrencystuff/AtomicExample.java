package org.example.concurrencystuff;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicExample {
    public static AtomicInteger nr = new AtomicInteger(0);
   // public static int nr = 0;
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for(int i = 0; i < 100; i++) {
            executorService.submit(() -> {
               nr.getAndIncrement();
            });
        }

        Thread.sleep(1000);
        System.out.println(nr);


        executorService.shutdown();
    }
}
