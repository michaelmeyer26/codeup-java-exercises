package shapes;

import util.Input;

public class CircleApp {
    private static int circlesCreated;

    public static int circleCount() {
        return circlesCreated;
    }


    public static void main(String[] args) {
        boolean wantsToContinue = true;
        do {
            Input i = new Input();
            System.out.print("Please enter in the radius of the circle: ");
            double radius = i.getDouble();
            System.out.println();
            Circle test = new Circle(radius);
            System.out.println(test.getArea());
            System.out.println(test.getCircumference());
            circlesCreated++;
            System.out.print("Would you like to continue? ");
            wantsToContinue = i.yesNo();
        } while (wantsToContinue);
        System.out.println(circleCount() + " total circles created.");
    }
}
