/*
В этом файле я попробовал оформить вывод результатов заданий
в удобоваримом виде. Надеюсь, получилось.
 */

public class Lesson3 {
    public static void main(String[] args) {
        String result = "Результат выполнения задания №";
        // Задание №1:
        System.out.printf(result + "1:\n%b \n\n",
                methods.isSumWithin(5, 15));
        // Задание №2:
        System.out.println(result + "2:");
        methods.isPositive(0);
        System.out.println();
        // Задание №3:
        System.out.printf(result + "3:\n%b \n\n",
                methods.isNegative(-1));
        // Задание №4:
        System.out.println(result + "4:");
        methods.printText("Я дважды повторять не стану!", 3);
        System.out.println();
        // Задание №5:
        System.out.printf(result + "5:\n%b \n\n",
                methods.isLeapYear(2000));
        // Задание №6:
        System.out.printf(result + "6:\n%s\n\n",
                methods.replaceOneZero());
        // Задание №7:
        System.out.printf(result + "7:\n%s\n\n",
                methods.arrHundred());
        // Задание №8:
        System.out.printf(result + "8:\n%s\n\n",
                methods.lessThanSix());
        // Задание №9:
        System.out.printf(result + "9:\n%s\n",
                methods.fillDiagonal(5));
        // Задание №10:
        System.out.printf(result + "10:\n%s",
                methods.arrCreate(3, 999));
    }
}
