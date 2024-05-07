package org.example.day1.overloadingandoverriding;

public class Vehicle {
    public Vehicle start(Vehicle v) {
        System.out.println("vehicle starting");
        return new Vehicle();
    }

    // overloading, zelfde naam, verschillende parameters
    public void start(String name) {
        System.out.println(name + " is starting");
    }
}
