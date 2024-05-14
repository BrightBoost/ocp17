package org.example;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionsExample {
    public static void doSomething() throws Exception{
        try {
            throw new Exception();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("oh no");
        }
    }

    public static void doSomething2() throws Exception{
        try {
            doSomething();
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public static void main(String[] args) {
        try {
            doSomething2();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void readFile() {
        FileReader fr = null;
        try {
            fr = new FileReader("blabla");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(fr!=null) {
                    fr.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void readFileWithTryWithResources() {
        try(FileReader fr = new FileReader("blabla");
            FileWriter fw = new FileWriter("output.txt")) {
            // do stuff met fr
        } catch (FileNotFoundException e) {
            // handle
        } catch (IOException e) {
            // handle
        }
    }
}
