package org.example.workingwithio;

import java.io.*;

public class MainDeserialize {
    public static void main(String[] args) {

        File f = new File("car.txt");

        Car c = readCar(f);
        System.out.println(c);

    }

    public static Car readCar(File f) {
        Car c = null;
        try(ObjectInputStream out = new ObjectInputStream(new BufferedInputStream(new FileInputStream(f)))) {
            c = (Car)out.readObject();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return c;

    }
}
