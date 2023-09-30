import fruits.Fruit;
import fruits.Apple;
import fruits.Orange;
import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private ArrayList<T> fruits; // коллекция, где будут фрукты из коробки
    private float boxWeight; // полный вес коробки
    private int fruitCount; // количество фруктов в коробке

    public Box() {}

    // Конструктор, в который можно передать коллекцию
    public Box(ArrayList<T> fruits) {
        this.fruits = fruits;
        this.fruitCount = fruits.size();
        this.boxWeight = this.fruitCount * fruits.get(0).getWeight();
    }

    // Конструктор, в который можно передать один объект
    public Box(T fruit) {
        this.fruits = new ArrayList<>();
        this.fruits.add(fruit); // передаем единичный объект в список fruits
        this.fruitCount += fruits.size();
        this.boxWeight = this.fruitCount * fruits.get(0).getWeight();
    }

    // Вывод фруктов, которые лежат в коробке
    public List<T> getFruits() {
        return this.fruits;
    }

    // Возвращение количества фруктов в коробке
    public int getFruitCount() {
        return this.fruitCount;
    }

    // Вывод веса коробки
    public float getWeight() {
        return this.boxWeight;
    }

    /*
    Сравнение веса коробок.
    "Первая коробка" - к которой используем метод.
    "Вторая коробка" - которую кладем в скобки.
     */
    public boolean compare(Box<?> box) {
        if (this.boxWeight == box.getWeight()) {
            System.out.println("Весь коробок одинаков");
            return true;
        } else if (this.boxWeight > box.getWeight()) {
            System.out.println("Первая коробка весит больше");
            return false;
        } else {
            System.out.println("Вторая коробка весит больше");
            return false;
        }
    }

    // Пересыпание фруктов из одной коробки в другую
    public void intersperse(Box<T> box) {
        box.fruits.addAll(this.fruits);
        box.fruitCount += this.fruitCount;
        box.boxWeight += this.boxWeight;
        this.fruits.clear();
        this.fruitCount = 0;
        this.boxWeight = 0;
    }

    // Добавление фрукта в коробку
    public void add(T fruit) {
        if (this.fruits.get(0).getClass() == fruit.getClass()) {
            this.fruits.add(fruit);
            this.fruitCount++;
            this.boxWeight += fruit.getWeight();
            System.out.printf("Теперь в коробке %d фруктов\n", this.getFruitCount());
        } else {
            System.out.println("Эта коробка для других фруктов");
        }
    }

    // Вывод класса фруктов, которые хранятся в коробке
    public void getFruitType() throws NullPointerException {
        try {
            if (this.fruits.get(0).getClass() == Apple.class) {
                System.out.println("В коробке лежат яблоки");
            } else if (fruits.get(0).getClass() == Orange.class) {
                System.out.println("В коробке лежат апельсины");
            } else {
                System.out.println("В коробке что-то не то");
            }
        } catch (NullPointerException e) {
            System.out.println("В коробке ничего нет");
        }
    }
}
