import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println(addition(4, 2));
        System.out.println(subtraction(4, 2));
        System.out.println(multiplication(4, 2));
        System.out.println(division(4, 2));

        getFactorial();

        rollDice();
    }

    public static long addition (long x, long y) {
        return x + y;
    }

    public static long subtraction (long x, long y) {
        return x - y;
    }

    public static long multiplication (long x, long y) {
        return x * y;
    }

    public static long division (long x, long y) {
        return x / y;
    }

    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a number between %d and %d: ", min, max);
        int userInt = sc.nextInt();
        if (userInt < min || userInt > max) {
            System.out.println("Not within the correct boundaries!");
            getInteger(min, max);
        }
        return userInt;
    }

    //Recursive factorial calculation in progress
//    public static long calculateFactorial (long factorialNum) {
//        if (factorialNum > 1) {
//            return factorialNum * calculateFactorial(factorialNum - 1);
//        }
//        return factorialNum;
//    }

    public static void getFactorial() {
        Scanner sc = new Scanner(System.in);
        int factorialNum = getInteger(1, 10);
        long factorialResult = 1;
        System.out.printf("Your number was: %d\n", factorialNum);
        System.out.print("Would you like to continue? [y/n] ");
        String userVerification = sc.nextLine().toLowerCase();
        if (userVerification.contains("y")) {
            System.out.printf("%d! = ", factorialNum);
            for (int i = 1; i < factorialNum; i++) {
                factorialResult *= i;
                System.out.printf("%d X ", i);
            }
            factorialResult *= factorialNum;
            System.out.printf("%d = %d", factorialNum, factorialResult);
        }
    }

    public static int generateRoll(int diceSide) {
        int roll = (int) ((Math.random() * diceSide) + 1);
        return roll;
    }

    public static void rollDice () {
        Scanner sc = new Scanner(System.in);
        boolean wantsToRoll = true;
        do {
            System.out.print("What sided dice would you like to roll? ");
            int diceSides = sc.nextInt();
            System.out.printf("You wanted %d-sided dice. Type 'roll' to roll the dice! ", diceSides);
            String rollConfirm = sc.next();
            if (rollConfirm.contains("roll")) {
                int roll1 = generateRoll(diceSides);
                int roll2 = generateRoll(diceSides);
                System.out.printf("Your first roll was %d, your second roll was %d, and your total was " + (roll1 + roll2) + "\n", roll1, roll2);
            }
            System.out.print("Would you like to roll again? [y/n] ");
            if (sc.next().contains("n")) {
                wantsToRoll = false;
            }
        } while (wantsToRoll);
    }
}
