package shapes;

public class Square extends Rectangle {
    public double side;

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    public double getArea() {
//        System.out.println("Using the square's getArea");
        return Math.pow(this.side, 2);
    }

    public double getPerimeter() {
//        System.out.println("Using the square's getPerimeter");
        return 4 * this.side;
    }
}
