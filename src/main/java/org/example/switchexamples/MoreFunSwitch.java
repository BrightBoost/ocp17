package org.example.switchexamples;

public class MoreFunSwitch {
    public static void main(String[] args) {
        String day = "Sunday";
        String dayType;
        switch (day) {
            case "Saturday":
            case "Sunday":
                dayType = "Weekend";
                break;
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                dayType = "Weekday";
                break;
            default:
                throw new IllegalArgumentException("Invalid day: " + day);
        }

        System.out.println("Daytype: " + dayType);

    }

    public static String getDayTypeWithSwitchExpression() {
        String day = "Sunday";
        String dayType = switch(day) {
            case "Saturday", "Sunday" -> "Weekend";
            case "Monday", "Tuesday", "Wednesday" -> "Weekday";
            default -> throw new IllegalArgumentException("Invalid day: " + day);
        };
        return dayType;
    }

    enum Color { BLACK, WHITE }
    public static void carefulHere() {
        Color color = Color.BLACK;
        String value = switch (color) {
            case BLACK -> "zwart";
            case WHITE -> "wit";
        };
    }

    public static void multilineSwitch() {
        Color color = Color.BLACK;
        String value = switch (color) {
            case BLACK -> {
                System.out.println("My favorite color too!");
                yield "zwart";
            }
            case WHITE -> "wit";
        };
    }
}
