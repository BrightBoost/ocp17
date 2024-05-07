package org.example.day1.functionalexamples;

public class Main {
    public static void main(String[] args) {

        // anonieme implementatie
        Printable p1 = new Printable() {
            @java.lang.Override
            public void print() {
                System.out.println("anonieme implementatie printing");
            }
        };

        p1.print();

        // verkorte versie van anonieme implementatie = lambda
        Printable p2 = () -> System.out.println("lambda print");
        p2.print();

        Calculator c1 = (double x) -> x + 2;

        Calculator c2 = x -> {
            System.out.println("blbala");
            return x + 2;
        };

        // let op de punt komma na de twee hier
        Calculator c3 = x -> { return x + 2; };
    }
}
