package org.example;

import java.util.ListResourceBundle;
import java.util.Locale;
import java.util.ResourceBundle;

public class Example_fr extends ListResourceBundle {

    protected Object[][] getContents(){

        return new Object[][]{{"hello", "bonjour"}};

    }

            

    public static void main(String[]args){ 

        ResourceBundle rb = ResourceBundle.getBundle("org.example.Example", new Locale("fr"));

        System.out.println(rb.getObject("hello"));

    }

}