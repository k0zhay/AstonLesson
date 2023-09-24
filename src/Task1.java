import java.util.Random;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Task1 {
    public static void EvenInRandArray() {
        Random rand = new Random();
        int length = rand.nextInt(20);
        System.out.println("Размер массива: " + length);
        int[] arr = new int[length];
        for(int i = 0; i < length; i++) {
            arr[i] = rand.nextInt(20);
        }
        System.out.println(Arrays.toString(arr));
        long count = IntStream.of(arr).filter(elem -> elem % 2 == 0).count();
        System.out.println("Количество четных чисел в массиве: " + count);
    }



}
