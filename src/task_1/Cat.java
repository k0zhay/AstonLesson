package task_1;
// 464116
public class Cat extends Animal {
    private boolean satiety;
    static int catCount;

    public Cat() {
    }

    public Cat(String name, String color) {
        super(name, color);
        this.satiety = false;
        catCount++;
    }

    // Бег кошей
    public void run(int meters) {
        int maxRunDistance = 200; // Макс. расстояние бега для кошки
        if (meters <= maxRunDistance) {
            System.out.printf("\n%s пробежал(-а) %d м!\n",
                    this.name, meters);
        } else {
            System.out.printf("\n%d м - слишком большое расстояние для котика\n",
                    meters);
        }
    }

    // Плавание (нет) кошек
    public void swim(int meters) {
        System.out.printf("\n%s не полезет в воду: котики не плавают!\n",
                this.name);
    }

    // Подсчет количества кошек
    public static int getCatCount() {
        return catCount;
    }

    // Вывод информации о кошке
    @Override
    public void info(){
        System.out.println("\nКличка: " + name + "\nОкрас: " + color +
                "\nСытость: " + satiety);
    }

    // Поедание корма из выбранной тарелки
    public void eatFrom(Plate plate) {
        int howMuchEat = 15;
        if (satiety) {
            System.out.println("\nЭтот котик уже сыт!");
        } else if (howMuchEat > plate.food) {
            System.out.println("\nКотику мало еды!");
        } else {
            System.out.println("\nКотик покушал");
            plate.food -= howMuchEat;
            this.satiety = true;
        }
    }
}
