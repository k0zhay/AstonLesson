
/*
Для сокращения записи использован импорт из каталогов с используемыми классами.
Обычно так делать нежелательно, насколько я знаю, но в рамках данного задания
решил, что такой вариант более читабельный.
 */
import task_1.*;
import task_2.*;

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

        // Подсчет общего количества животных и видов по отдельности
        System.out.println("\nВсего животных: " + Animal.getAnimalCount());
        System.out.println("Количество котиков: " + Cat.getCatCount());
        System.out.println("Количество собак: " + Dog.getDogCount());

        // Задача с тарелками (Кто главный по тарелочкам?)
        Plate plate = new Plate(40);
        murzik.eatFrom(plate); // кот был голодным
        markiza.eatFrom(plate); // кот был голодным
        markiza.eatFrom(plate); // уже кормили - не получит еду
        murka.eatFrom(plate); // кот был голодным, но для него мало еды
        // Информация о ранее вызванном объекте обновлена
        murzik.info();
        System.out.println("\nОсталось еды в тарелке: " + plate.food);

        /*
        Результат выполнения Задачи 2 (про фигуры)
         */
        System.out.println("\n***Результат выполнения Задачи 2 (про фигуры)***");
        // Создаем объекты классов
        Rectangle rectangle = new Rectangle(5, 6, "Красный", "Синий");
        Triangle triangle = new Triangle(3, 5, 6, "Белый", "Черный");
        Circle circle = new Circle(7, "Зеленый", "Фиолетовый");

        /*
        Проверяем работоспособность дефолтного метода из интерфейса
        и выводим полную информацию о созданных фигурах
         */
        rectangle.info(rectangle.backColor, rectangle.bordColor);
        triangle.info(triangle.backColor, triangle.bordColor);
        circle.info(circle.backColor, circle.bordColor);
    }
}
