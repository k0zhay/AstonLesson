import java.util.ArrayList;
import java.util.Optional;

public class Task2 {
    public static void countOfWord(ArrayList<String> arr, String word) {
        long count = arr.stream().filter(elem -> elem.equals(word)).count();
        System.out.printf("Слово %s встречается в коллекции %d раз\n", word, count);
    }

/*    public static int firstWord(ArrayList<String> arr) {
        if (arr.size() == 0) {
            System.out.println("В коллекции нет элементов");
            return 0;
        } else {
            Optional<String> firstWord = arr.stream().findFirst();
            System.out.println("Первое слово: ");
        }
    }*/
}
