package org.example.concurrencystuff;

public class ThreadExampleClass extends Thread {
    @Override
    public void run() {
        System.out.println("Hello from class thread with id: " + Thread.currentThread());
    }
}
