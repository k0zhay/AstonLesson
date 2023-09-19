package task1;

import java.util.*;

public class FindUnique {

    public static void showUnique(String[] arr) {
        HashSet<String> arrToSet = new LinkedHashSet<>(Arrays.asList(arr));
        System.out.println(arrToSet + "\n");
    }

    public static void countOfRepetitions(String[] arr) {
        HashMap<String, Integer> arrToMap = new LinkedHashMap<>();
        for (String checkedElem : arr) {
            int count = 0; // счетчик повторений элемента в списке
            for (String comparedElem : arr) {
                /*
                Берем один элемент checkedElem и сравниваем его поочередно
                с каждым элементом comparedElem из списка
                 */
                if (checkedElem.equals(comparedElem)) {
                    count++;
                }
            }
            arrToMap.put(checkedElem, count);
        }
        System.out.println(arrToMap + "\n");
    }
}
