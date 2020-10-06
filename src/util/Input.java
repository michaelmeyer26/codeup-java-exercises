package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo() {
        String answer = scanner.nextLine();
        if (answer.contains("y")) {
            return true;
        } else {
            return false;
        }
    }

    public int getInt() {
        return scanner.nextInt();
    }

    public int getInt(int min, int max) {
        System.out.printf("Please enter a number from %d to %d: ", min, max);
        int userInt = scanner.nextInt();
        if (userInt > max || userInt < min) {
            System.out.println("Invalid response");
            getInt(min, max);
        }
        return userInt;
    }

    public double getDouble() {
        return scanner.nextDouble();
    }

    public double getDouble(double min, double max) {
        System.out.printf("Please enter a number from %f to %f: ", min, max);
        double userDouble = scanner.nextDouble();
        if (userDouble > max || userDouble < min) {
            System.out.println("Invalid response");
            getDouble(min, max);
        }
        return userDouble;
    }
}
