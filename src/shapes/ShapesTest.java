package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Measureable[] myShape = {new Rectangle(3, 5), new Square(5)};

        for (Measureable e : myShape) {
            System.out.println("e = " + e.getPerimeter());
            System.out.println("e = " + e.getArea());
        }

//        System.out.println("myShape[0].getArea() = " + myShape[0].getLength());
//        System.out.println("myShape[0].getArea() = " + myShape[1].getLength());

    }
}
