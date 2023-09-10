
import task_1.Animal;
import task_1.Cat;
import task_1.Dog;
import task_1.Plate;
import task_2.Circle;
import task_2.Rectangle;
import task_2.Triangle;

public class Lesson_5 {
    public static void main(String[] args) {
        /*
        Результат выполнения Задачи 1 (про животных)
         */
        System.out.println("***Результат выполнения Задачи 1 (про животных)***");
        // Создадим одно некое животное (класс Animal)
        Animal fyric = new Animal("Фырик", "Белый");
        // Создадим три котика (подкласс Cat)
        Cat murzik = new Cat("Мурзик", "Серый");
        Cat markiza = new Cat("Маркиза", "Серая");
        Cat murka = new Cat("Мурка", "Трехцветная");
        // Создадим две собаки (подкласс Dog)
        Dog bobik = new Dog("Бобик", "Рыжий", "Кавказская овчарка");
        Dog zorya = new Dog("Зоря", "Черный", "Мопс");

        // Метод info, определенный в Animal и переопределенный в Cat/Dog
        fyric.info();
        murzik.info();
        bobik.info();
        // Методы run и swim, определенные в Cat/Dog
        markiza.run(200);
        murka.swim(5);
        bobik.run(501);
        zorya.swim(9);

        // Подсчет общего количества и видов по отдельности
        System.out.println("\nВсего животных: " + Animal.getAnimalCount());
        System.out.println("\nКоличество котиков: " + Cat.getCatCount());
        System.out.println("\nКоличество собак: " + Dog.getDogCount());

        // Задача с тарелками (Кто главный по тарелочкам?)
        Plate plate = new Plate(40);
        murzik.eatFrom(plate);
        markiza.eatFrom(plate);
        markiza.eatFrom(plate);
        murka.eatFrom(plate);
        System.out.println("\nЕды в тарелке: " + plate.food);

        /*
        Результат выполнения Задачи 2 (про фигуры)
         */
        System.out.println("\n***Результат выполнения Задачи 2 (про фигуры)***");
        // Создаем объекты классов
        Rectangle rectangle = new Rectangle(5, 6, "Красный", "Синий");
        Triangle triangle = new Triangle(3, 5, 6, "Белый", "Черный");
        Circle circle = new Circle(7, "Зеленый", "Фиолетовый");

        // Проверяем работоспособность дефолтного метода из интерфейса
        rectangle.calculationResult();
        triangle.calculationResult();
        circle.calculationResult();

        // Выводим полную информацию о созданных фигурах
        rectangle.info();
        triangle.info();
        circle.info();
    }
}