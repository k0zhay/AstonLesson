
public class MyArrayDataException extends Exception {
    public MyArrayDataException(int row, int column) {
        System.out.printf("Ошибка: элемент(%d, %d) - не число\n", row, column);
    }
}
