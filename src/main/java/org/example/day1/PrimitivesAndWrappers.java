package org.example.day1;

public class PrimitivesAndWrappers {
    public static void main(String[] args) {

        // round nrs
        int i = 8;
        long l = 8L;
        byte b = 12;
        short s = 300;
        char c = 'c';

        // decimals
        double d = 4.5;
        float f = 4.5f;

        //boolean
        boolean bool = true;

        // wrapper classes
        Integer i1 = 8;
        Long l1 = 8L;
        Byte b1 = 12;
        Short s1 = 300;
        Character c1 = 'c';

        // decimals
        Double d1 = 4.5;
        Float f1 = 4.5f;

        //boolean
        Boolean bool1 = true;

        // dit mag niet - deprecated
        Integer i2 = new Integer(54);

        // valueof
        Integer i3 = Integer.valueOf(3);

        System.out.println("wat" + i3);

        // pas op met dit soort vragen (getal te groot voor integer, moet L achter)
        long l2 = 1231231231233L;

        // integer grapjes
        System.out.println(Integer.MAX_VALUE + 1);
    }
}
