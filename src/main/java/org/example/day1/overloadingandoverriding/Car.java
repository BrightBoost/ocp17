package org.example.day1.overloadingandoverriding;

public class Car extends Vehicle{
    @Override
    public Car start(Vehicle v){
        System.out.println("Car is starting");
        return new Car();
    }

    public static void main(String[] args) {
        System.out.println("bla");
    }
}
