package org.example.concurrencystuff;

public class ThreadExample implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hello from thread with id: " + Thread.currentThread());
    }
}
