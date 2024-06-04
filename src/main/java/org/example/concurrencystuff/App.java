package org.example.concurrencystuff;

import java.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class App {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("Main method is on thread: " + Thread.currentThread());
        Thread t = new Thread(new ThreadExample());
        t.start();
        ThreadExampleClass tec = new ThreadExampleClass();
        tec.start();
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        // callable
        Future<Integer> result = executorService.submit(() -> 3);
        Future<?> result2 = executorService.submit(() -> System.out.println("blabla"));
        Optional<User> user = getUserById(1);
        User u = user.orElseGet(() -> new User());
        executorService.shutdown();
    }

    public static Optional<User> getUserById(long id) {
        // its van een dummy functie
        User u = new User();
        return Optional.of(u);
    }
}
class User{}