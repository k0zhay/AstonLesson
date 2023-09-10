
//
import task_1.Animal;
import task_1.Cat;
import task_1.Dog;
import task_1.Plate;


public class Lesson_5 {
    public static void main(String[] args) {
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

        // Задача с тарелками (Кто тут главный по тарелочкам?)
        Plate plate = new Plate(40);
        murzik.eatFrom(plate);
        markiza.eatFrom(plate);
        markiza.eatFrom(plate);
        murka.eatFrom(plate);
    }
}