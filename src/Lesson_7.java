
public class Lesson_7 {
    public static void main(String[] args) {
        String[][] valid = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}};
        String[][] sizeInvalid = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"}};
        String[][] dataInvalid = {
                {"1", "2", "3", "4"},
                {"5", "six", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}};

        // Запуск метода с корректным массивом
        try {
            ArrSum(valid);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }

        // Запуск метода с массивом неправильного размера
        try {
            ArrSum(sizeInvalid);
        } catch (MyArraySizeException | MyArrayDataException e) {

        }

        // Запуск метода с массивом с текстом в одной ячейке
        try {
            ArrSum(dataInvalid);
        } catch (MyArraySizeException | MyArrayDataException e) {

        }
    }

    public static void ArrSum(String[][] arr)
            throws MyArraySizeException, MyArrayDataException {
        int summ = 0; // сумма элементов
        int size = 4; // ограничение на размер массива
        // Проверяем массив на размерность
        if (arr.length == size && arr[0].length == size) {
            for (int row = 0; row < size; row++) {
                for (int column = 0; column < size; column++) {
                    /*
                    А вот тут забавно получается: если не удается попытка
                    преобразовать в int, java сама выбрасывает исключение
                    NumberFormatException, которое выполняет здесь
                    функцию моего исключения MyArrayDataException.
                    Может, есть более элегантный способ это обойти,
                    но у меня по ощущениям получилось масло маслянное,
                    честно говоря.
                     */
                    try {
                        summ += Integer.parseInt(arr[row][column]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException(row, column);
                    }
                }
            }
        } else {
            throw new MyArraySizeException();
        }
        System.out.println("Сумма элементов = " + summ);
    }
}
