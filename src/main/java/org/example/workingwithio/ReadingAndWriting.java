package org.example.workingwithio;

import java.io.*;

public class ReadingAndWriting {
    public static void main(String[] args) {
        File f = new File("blabla.txt");
        try {
            f.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String s = "blablablabla";

        try(FileWriter fr = new FileWriter(f)) {
            fr.write(s);
        } catch(IOException e) {
            throw new RuntimeException(e);
        }

        try(FileReader fr = new FileReader(f)) {
            int c;
            while((c = fr.read()) != -1) {
                System.out.println((char)c);
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }

        try(BufferedReader br = new BufferedReader(new FileReader(f))) {
            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }
}
