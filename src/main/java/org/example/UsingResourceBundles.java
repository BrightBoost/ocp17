package org.example;

import java.util.Locale;
import java.util.ResourceBundle;

public class UsingResourceBundles {
        public static void main(String[] args){

            Locale nl = new Locale("nl", "NL");

            Locale us = new Locale("en", "US");

            printExample(nl);

            printExample(us); 

        }

        public static void printExample(Locale l){

            ResourceBundle rb = ResourceBundle.getBundle("example", l);
            System.out.println(rb.getString("hello"));

        }
    
}
