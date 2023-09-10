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

    public static int getAnimalCount() {
        return animalCount;
    }

    public void info(){
        System.out.println("\nКличка: " + name + "\nОкрас: " + color);
    }
}
