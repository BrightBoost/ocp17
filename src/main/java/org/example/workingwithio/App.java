package org.example.workingwithio;

import java.io.File;

public class App {
    public static void main(String[] args) {
        String sep = System.getProperty("file.separator");
        File file = new File("/Users/maaikevanputten/IdeaProjects/ocp11of17");
        File file2 = new File("bla/bla.txt");
        showFolderContent(file);
        System.out.println(file.length());
        System.out.println(file2.exists());
    }

    public static void showFolderContent(File file) {
        for( File f : file.listFiles()) {
            System.out.println(f.getAbsolutePath());
            if(f.isDirectory()) {
                showFolderContent(f);
            }
        }
    }
}
