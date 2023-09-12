package task_2;

public class Circle implements Figure {
    double radius;
    public String backColor;
    public String bordColor;

    public Circle() {}

    public Circle(double radius, String backColor, String bordColor) {
        this.radius = radius;
        this.backColor = backColor;
        this.bordColor = bordColor;
    }

    @Override
    public double perimeter() {
        return Math.PI * 2 * radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
