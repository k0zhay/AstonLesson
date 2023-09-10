package task_2;

public class Triangle implements Figure {
    double side1;
    double side2;
    double side3;
    String backColor;
    String bordColor;

    public Triangle() {}

    public Triangle(double side1, double side2, double side3,
                    String backColor, String bordColor) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.backColor = backColor;
        this.bordColor = bordColor;

    }

    @Override
    public double perimeter() {
        return this.side1 + this.side2 + this.side3;
    }

    @Override
    public double area() {
        double p = perimeter() / 2;
        return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
    }

    @Override
    public void info() {
        System.out.printf("\nПериметр фигуры: %.2f" + "\nПлощадь фигуры: %.2f" +
                        "\nЦвет фона: %s" + "\nЦвет границы: %s\n",
                this.perimeter(), this.area(), this.backColor, this.bordColor);
    }
}
