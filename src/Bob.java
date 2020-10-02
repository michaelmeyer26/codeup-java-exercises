import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        boolean talkToBob = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Say something to Bob!");
        do {
            String userInput = sc.nextLine().toLowerCase();

            if (userInput.contains("goodbye")) {
                talkToBob = false;
                System.out.println("Later.");
            } else if (userInput.endsWith("?")) {
                System.out.println("Sure.");
            } else if (userInput.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (userInput.equals("")) {
                System.out.println("Fine, be that way.");
            } else {
                System.out.println("Whatever.");
            }
        } while(talkToBob);
    }
}
