package task_1;

public class Animal {
    String name;
    String color;
    static int animalCount;

    public Animal() {
    }

    public Animal(String name, String color) {
        this();
        this.name = name;
        this.color = color;
        animalCount++;
    }

    // Подсчет количества животных всех видов (Animal, Cat, Dog)
    public static int getAnimalCount() {
        return animalCount;
    }

    // Вывод информации о животном
    public void info(){
        System.out.println("\nКличка: " + name + "\nОкрас: " + color);
    }
}
