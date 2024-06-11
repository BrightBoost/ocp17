package org.example.evenmorefunwithswitches;

public class Examples {
    public static void main(String[] args) {
        Object obj = "Guarded Patterns";

        if (obj instanceof String s && s.startsWith("Guard")) {
            System.out.println("The string starts with 'Guard'");
        } else if (obj instanceof String s && s.length() > 10) {
            System.out.println("The string has more than 10 characters");
        } else if (obj instanceof String s && s.endsWith("Patterns")) {
            System.out.println("The string ends with 'Patterns'");
        } else if (obj instanceof Integer i && i > 10) {
            System.out.println("The integer is greater than 10");
        } else {
            System.out.println("Unknown object or condition");
        }

        switch (obj) {
            case String s -> System.out.println("It's a string: " + s);
            case Integer i -> System.out.println("It's an integer: " + i);
            case Double d -> System.out.println("It's a double: " + d);
            case null, default -> System.out.println("Unknown type");
        }

        // JAVA 21 not for OCP 17
//        switch (obj) {
//            case String s when s.startsWith("Guard") -> System.out.println("The string starts with 'Guard'");
//            case String s when s.length() > 10 -> System.out.println("The string has more than 10 characters");
//            case String s when s.endsWith("Patterns") -> System.out.println("The string ends with 'Patterns'");
//            case Integer i when i > 10 -> System.out.println("The integer is greater than 10");
//            default -> System.out.println("Unknown object or condition");
//        }
    }
}
