package util;

public class InputTest {
    public static void main(String[] args) {
        Input i = new Input();

        System.out.print("Please enter a string: ");
        System.out.println("i.getString() = " + i.getString());
        System.out.println();
        System.out.print("Please enter yes or no: ");
        System.out.println(i.yesNo());
        i.getString();
        System.out.print("Please enter an int: ");
        System.out.println(i.getInt());
        i.getInt(1, 10);
        System.out.print("Please enter a double: ");
        System.out.println(i.getDouble());
        i.getDouble(1.1, 9.9);
        System.out.print("PLease enter a binary number: ");
        System.out.println("i.getBinary() = " + i.getBinary());
        System.out.print("Please enter a hexadecimal number: ");
        System.out.println("i.getHexadecimal() = " + i.getHexadecimal());
    }
}
