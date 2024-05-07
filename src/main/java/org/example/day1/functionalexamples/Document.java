package org.example.day1.functionalexamples;

public class Document implements Printable{
    @Override
    public void print() {
        System.out.println("printing document");
    }
}
