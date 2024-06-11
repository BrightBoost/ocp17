package org.example.recordexamples;

import java.util.Objects;

public record Person(int age, String name, String email) {
    public Person(String name) {
        //Objects.requireNonNull(name);
        this(10, name, name+"@gmail.com");
    }
}
