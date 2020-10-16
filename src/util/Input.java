package util;

import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);

    public static String getString() {
        return scanner.nextLine().trim();
    }

    public static boolean yesNo() {
        String answer = scanner.next().toLowerCase();
        if (answer.contains("y")) {
            return true;
        } else {
            return false;
        }
    }

    public static int getInt() {
        try{
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e){
            System.out.println("Must provide an integer.");
            return getInt();
        }
    }

    public static int getInt(int min, int max) {
        try {
            System.out.printf("Please enter a number from %d to %d: ", min, max);
            int userInt = Integer.parseInt(scanner.nextLine());
            if (userInt > max || userInt < min) {
                System.out.printf("Invalid response, must be between %d and %d\n", min, max);
                getInt(min, max);
            }
            return userInt;
        } catch (NumberFormatException e) {
            System.out.println("Must provide an integer.");
            return getInt(min, max);
        }
    }

    public static double getDouble() {
        try{
            return Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e){
            System.out.println("Must provide a number.");
            return getDouble();
        }
    }

    public static double getDouble(double min, double max) {
        try {
            System.out.printf("Please enter a number from %f to %f: ", min, max);
            Double userDouble = Double.parseDouble(scanner.nextLine());
            if (userDouble > max || userDouble < min) {
                System.out.printf("Invalid response, must be between %f and %f\n", min, max);
                getDouble(min, max);
            }
            return userDouble;
        } catch (NumberFormatException e) {
            System.out.println("Must provide a number.");
            return getDouble(min, max);
        }
    }

    public static int getBinary() {
        try{
            return Integer.valueOf(scanner.nextLine(), 2);
        } catch (Exception e) {
            System.out.println("Must provide a binary number.");
            return getBinary();
        }
    }

    public static int getHexadecimal() {
        try{
            return Integer.valueOf(scanner.nextLine(), 16);
        } catch (Exception e) {
            System.out.println("Must provide a hexadecimal number.");
            return getHexadecimal();
        }
    }
}
