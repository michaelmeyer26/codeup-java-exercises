package util;

import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);

    public static String getString() {
        return scanner.nextLine();
    }

    public static boolean yesNo() {
        String answer = scanner.next();
        if (answer.contains("y")) {
            return true;
        } else {
            return false;
        }
    }

    public static int getInt() {
        return scanner.nextInt();
    }

    public static int getInt(int min, int max) {
        System.out.printf("Please enter a number from %d to %d: ", min, max);
        int userInt = scanner.nextInt();
        if (userInt > max || userInt < min) {
            System.out.println("Invalid response");
            getInt(min, max);
        }
        return userInt;
    }

    public static double getDouble() {
        return scanner.nextDouble();
    }

    public  static double getDouble(double min, double max) {
        System.out.printf("Please enter a number from %f to %f: ", min, max);
        double userDouble = scanner.nextDouble();
        if (userDouble > max || userDouble < min) {
            System.out.println("Invalid response");
            getDouble(min, max);
        }
        return userDouble;
    }
}
