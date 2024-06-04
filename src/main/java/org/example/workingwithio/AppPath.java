package org.example.workingwithio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AppPath {
    public static void main(String[] args) {
        Path p = Paths.get("example");
        Path p1 = Paths.get("/","example", "log.txt");

        System.out.println(p1.subpath(0, p1.getNameCount()));
        try {
            if(!Files.exists(p)) {
                Files.createDirectories(p);
            }
            if(!Files.exists(p1)) {
                Files.createFile(p1);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }




    }
}
