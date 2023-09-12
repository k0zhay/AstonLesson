package task_2;

public interface Figure {
    double perimeter();
    double area();
    /*
    Не совсем понял, зачем делать дефолтным метод расчета площади/периметра,
    если расчеты для каждой фигуры все равно индивидуальные. Поэтому
    сделал дефолтным метод, который выводит информацию о фигурах.
    Этот метод, соответственно, каждый из классов может использовать
    без переопределений.
     */
    default void info(String backColor, String bordColor) {
        System.out.printf("\nПериметр фигуры: %.2f" + "\nПлощадь фигуры: %.2f" +
                        "\nЦвет фона: %s" + "\nЦвет границы: %s\n",
                this.perimeter(), this.area(), backColor, bordColor);
    }
}
