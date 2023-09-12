package task_2;

public class Rectangle implements Figure {
    double side1;
    double side2;
    public String backColor;
    public String bordColor;

    public Rectangle() {}

    public Rectangle(double side1, double side2,
                     String backColor, String bordColor) {
        this.side1 = side1;
        this.side2 = side2;
        this.backColor = backColor;
        this.bordColor = bordColor;
    }

    @Override
    public double perimeter() {
        return 2 * (this.side1 + this.side2);
    }

    @Override
    public double area() {
        return this.side1 * this.side2;
    }
}
