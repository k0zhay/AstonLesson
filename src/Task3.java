
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Task3 {
    public static void showSorted(ArrayList<String> notSorted) {
        Object[] sorted = notSorted.stream().sorted(new ComparatorF()).toArray();
        System.out.println(Arrays.toString(sorted));
    }

    // Создадим компаратор, который может корректно сравнивать наши элементы
    private static class ComparatorF implements Comparator<String> {
        public int compare(String a, String b) {
            Integer num1 = Integer.valueOf(a.substring(1));
            Integer num2 = Integer.valueOf(b.substring(1));
            return num1.compareTo(num2);
        }
    }
}
