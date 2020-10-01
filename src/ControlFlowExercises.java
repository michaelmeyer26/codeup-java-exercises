import java.sql.SQLOutput;
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main (String[] args) {
        for (int i = 5; i <= 15; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (long a = 2; a < 1000000; a = a * a) {
            System.out.println(a);
        }


        //FizzBuzz
        for (int j = 1; j <= 100; j++) {
            if (j % 3 == 0 & j % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (j % 3 == 0) {
                System.out.println("Fizz");
            } else if (j % 5 == 0) {
                System.out.println("Buzz");
            }else {
                System.out.println(j);
            }
        }

        //table of powers
        boolean wantsToContinue = true;
        Scanner sc = new Scanner(System.in);
        while (wantsToContinue) {
            System.out.print("What number would you like to go up to? ");
            int userNumber = sc.nextInt();
            System.out.println("Here is your table!");
            System.out.println();
            System.out.println("Number | Squared | Cubed");
            System.out.println("------ | ------- | -----");
            for (int k = 1; k <= userNumber; k++) {
                System.out.println(k + "      | " + (k * k) + "       | " + (k * k * k));
            }
            System.out.println();
            System.out.print("Would you like to continue? [y/n] ");
            String userAnswer = sc.next();
            if (userAnswer.contains("n")) {
                wantsToContinue = false;
            }
        }

        //converting grades
        System.out.print("Enter a grade from 1 - 100 ");
        int userGrade = sc.nextInt();
        System.out.println("Your grade was " + userGrade);
        System.out.println("Would you like to continue? [y/n] ");
        String wantsLetterGrade = sc.next();
        if (wantsLetterGrade.contains("y")) {
            if (userGrade >= 88) {
                System.out.println("You got an A!");
            } else if (userGrade >= 80) {
                System.out.println("You got an B");
            } else if (userGrade >= 67) {
            System.out.println("You got an C");
            } else if (userGrade >= 60) {
                System.out.println("You got an D");
            } else {
                System.out.println("Unfortunately, you failed");
            }
        }

    }
}
