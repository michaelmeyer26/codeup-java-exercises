import java.util.Scanner;

public class ConsoleExercises {
    public static void main (String[] args) {
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f\n", pi);

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        int userInt = sc.nextInt();
        System.out.printf("You entered: %d\n", userInt);

        System.out.print("Please enter 3 words: ");
        String firstWord = sc.next();
        String secondWord = sc.next();
        String thirdWord = sc.next();

        System.out.format("%s\n%s\n%s", firstWord, secondWord, thirdWord);

        String test = sc.nextLine();
        System.out.print("Type something! ");
        String userSentence = sc.nextLine();
        System.out.printf("%s\n", userSentence);

        sc.useDelimiter("\n");
        System.out.print("Please enter the length and then width of the room: ");
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        double area = length * width;
        double perimeter = (2 * length) + (2 * width);
        System.out.printf("The area of the room is %f and the perimeter is %f.", area, perimeter);
    }
}
