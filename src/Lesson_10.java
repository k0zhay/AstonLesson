import fruits.*;
import java.util.ArrayList;

public class Lesson_10 {
    public static void main(String[] args) {
        /*
        Создадим коробки с яблоками: в одну положим всего одно яблоко (одиночка),
        во вторую коллекцию из трех яблок
         */
        Apple aloneApple = new Apple();
        Box<Apple> smallAppleBox = new Box<>(aloneApple); // первая коробка яблок
        Apple ap1 = new Apple();
        Apple ap2 = new Apple();
        Apple ap3 = new Apple();
        ArrayList<Apple> apples = new ArrayList<>();
        apples.add(ap1); apples.add(ap2); apples.add(ap3);
        Box<Apple> appleBox = new Box<>(apples); // вторая коробка яблок
        /*
        Коробку с апельсинами сделаем всего одну, в ней будет 4 апельсина
        */
        Orange or1 = new Orange();
        Orange or2 = new Orange();
        Orange or3 = new Orange();
        Orange or4 = new Orange();
        ArrayList<Orange> oranges = new ArrayList<>();
        oranges.add(or1); oranges.add(or2); oranges.add(or3); oranges.add(or4);
        Box<Orange> orangeBox = new Box<>(oranges);

        // Проверим, объекты какого класса хранятся в коробках
        smallAppleBox.getFruitType();
        appleBox.getFruitType();
        orangeBox.getFruitType();

        // Проверим вес получившихся коробок
        System.out.println();
        System.out.println(smallAppleBox.getWeight());
        System.out.println(appleBox.getWeight());
        System.out.println(orangeBox.getWeight());

        // Сравним вес коробки с яблоками и с апельсинами
        System.out.println();
        System.out.println(appleBox.compare(orangeBox));

        // Переложим яблоки из большой коробки в маленькую
        appleBox.intersperse(smallAppleBox);
        // Проверим количество яблок в маленькой коробке
        System.out.println();
        System.out.printf("В коробке %d фруктов\n",
                smallAppleBox.getFruitCount());
        // Добавим ещё одно "одинокое яблоко" и проверим, что есть в коробке
        System.out.println();
        smallAppleBox.add(aloneApple);
        /*
        Итого: в smallAppleBox лежит aloneApple, который был в ней изначально,
        яблоки ap1, ap2 и ap3 из appleBox и aloneApple, добавленный в конце
         */

    }
}
