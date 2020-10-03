import java.util.Scanner;

public class HighLow {
    public static void main (String[] args) {
        boolean playGame = true;
        boolean guessedTrue = false;
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Let's play a guessing game! You have 15 guesses to get the number.");
        do {
            int numberToGuess = (int) (Math.random() * 99) + 1;
            System.out.println(numberToGuess);
            int totalGuesses = 15;
            do {
                guessedTrue = playRound(numberToGuess, totalGuesses);
                totalGuesses--;
            } while (!guessedTrue && totalGuesses > 0);
            System.out.print("Would you like to play another round? ");
            if (sc.nextLine().toLowerCase().contains("n")) {
                playGame = false;
                System.out.println();
                System.out.println("Goodbye");
            }
        } while (playGame);
    }

    public static boolean playRound (int numberToGuess, int totalGuesses) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("You have %d guesses remaining.\n", totalGuesses);
        System.out.print("Enter a number between 1 and 100: ");
        int userGuess = sc.nextInt();
        if (userGuess > 100 || userGuess < 1) {
            System.out.println("That is not a valid guess, must choose a number between 1 and 100");
            playRound(numberToGuess, totalGuesses);
        } else if (userGuess == numberToGuess) {
            System.out.println("GOOD GUESS! That's the number!!");
            return true;
        } else if (userGuess > numberToGuess) {
            System.out.println("LOWER");
        } else if (userGuess < numberToGuess) {
            System.out.println("HIGHER");
        }
        return false;
    }
}
