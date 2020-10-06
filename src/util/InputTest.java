package util;

public class InputTest {
    public static void main(String[] args) {
        Input i = new Input();

        System.out.print("Please enter a string: ");
        i.getString();
        System.out.println();
        System.out.print("Please enter yes or no: ");
        System.out.println(i.yesNo());
        System.out.print("Please enter an int: ");
        System.out.println(i.getInt());
        i.getInt(1, 10);
        System.out.print("Please enter a double: ");
        System.out.println(i.getDouble());
        i.getDouble(1.1, 9.9);
    }
}
