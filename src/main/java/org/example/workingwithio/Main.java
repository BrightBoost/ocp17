package org.example.workingwithio;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.setMake("honda");
        c.setModel("jazz");
        c.setYear(2024);
        c.setEngine(new Engine());
        File f = new File("car.txt");
        try {
            f.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        saveCar(c, f);
    }

    public static void saveCar(Car c, File f) {
        try(ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(f)))) {
            out.writeObject(c);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
