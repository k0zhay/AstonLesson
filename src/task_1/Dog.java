package task_1;

public class Dog extends Animal {
    String dogBreed;
    static int dogCount;

    public Dog() {
    }

    public Dog(String name, String color, String dogBreed) {
        super(name, color);
        this.dogBreed = dogBreed;
        dogCount++;
    }

    // Бег собак
    public void run(int meters) {
        int maxRunDistance = 500; // Макс. расстояние бега для собаки
        if (meters <= maxRunDistance) {
            System.out.printf("\n%s пробежал(-а) %d м!\n",
                    this.name, meters);
        } else {
            System.out.printf("\n%d м - слишком большое расстояние для собаки\n",
                    meters);
        }
    }

    // Плавание собак
    public void swim(int meters) {
        int maxSwimDistance = 10; // Макс. расстояние вплавь для собаки
        if (meters <= maxSwimDistance) {
            System.out.printf("\n%s проплыл(-а) %d м!\n",
                    this.name, meters);
        } else {
            System.out.printf("\n%d м - слишком большое расстояние для собаки\n",
                    meters);
        }
    }

    // Подсчет количества собак
    public static int getDogCount() {
        return dogCount;
    }

    // Вывод информации о собаке
    @Override
    public void info(){
        System.out.println("\nКличка: " + name + "\nОкрас: " + color +
                "\nПорода: " + dogBreed);
    }
}
