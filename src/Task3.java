import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task3 {
    public static void showSorted(ArrayList<String> notSorted) {
        Object[] sorted = notSorted.stream().sorted(new ComparatorF()).toArray();
        System.out.println(Arrays.toString(sorted));
    }

    private static class ComparatorF implements Comparator<String> {
        public int compare(String a, String b) {
            Integer num1 = Integer.valueOf(a.substring(1));
            Integer num2 = Integer.valueOf(b.substring(1));
            return num1.compareTo(num2);
        }
    }
}
