package task_2;

public class Circle implements Figure {
    double radius;
    String backColor;
    String bordColor;

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

    @Override
    public void info() {
        System.out.printf("\nПериметр фигуры: %.2f" + "\nПлощадь фигуры: %.2f" +
                        "\nЦвет фона: %s" + "\nЦвет границы: %s\n",
                this.perimeter(), this.area(), this.backColor, this.bordColor);
    }
}
