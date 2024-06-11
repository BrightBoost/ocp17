package org.example.concurrencystuff;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SynchronizedExample {
    public static int nr = 0;

    public static synchronized void incrementNr() {
        nr = nr + 1;
    }
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for(int i = 0; i < 100; i++) {
            executorService.submit(() -> {
                incrementNr();
            });
        }

        Thread.sleep(1000);
        System.out.println(nr);


        executorService.shutdown();
    }
}
