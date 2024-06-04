package org.example.concurrencystuff;

public class App {
    public static void main(String[] args) {
        System.out.println("Main method is on thread: " + Thread.currentThread());
        Thread t = new Thread(new ThreadExample());
        t.start();

        ThreadExampleClass tec = new ThreadExampleClass();
        tec.start();
    }
}
